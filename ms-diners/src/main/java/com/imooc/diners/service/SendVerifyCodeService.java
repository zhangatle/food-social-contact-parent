package com.imooc.diners.service;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.imooc.commons.constant.RedisKeyConstant;
import com.imooc.commons.utils.AssertUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 发送验证码的业务逻辑层
 */

@Service
public class SendVerifyCodeService {

    /**
     * 发送验证码
     */
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public void send(String phone) {
        //校验手机号是否为空
        AssertUtil.isNotEmpty(phone, "手机号不能为空");
        //根据手机号查询是否已生成验证码，已生成直接返回
        if (!checkCodeIsExpired(phone)) {
            return;
        }
        //生成6位验证码
        String code = RandomUtil.randomNumbers(6);
        //调用短信服务发送短信(这里不做)
        //发送成功将code保存至redis，设置失效时间60s
        String key = RedisKeyConstant.verify_code.getKey() + phone;
        redisTemplate.opsForValue().set(key, code, 60, TimeUnit.SECONDS);
    }

    /**
     * 根据手机号查询是否已生成验证码
     *
     * @param phone
     * @return
     */
    private boolean checkCodeIsExpired(String phone) {
        String key = RedisKeyConstant.verify_code.getKey() + phone;
        String code = redisTemplate.opsForValue().get(key);
        if (StrUtil.isBlank(code)) {
            return true;
        }
        return false;
    }

    /**
     * 根据手机号获得验证码
     *
     * @param phone
     * @return
     */
    public String getCodeByPhone(String phone) {
        String key = RedisKeyConstant.verify_code.getKey() + phone;
        return redisTemplate.opsForValue().get(key);
    }

}

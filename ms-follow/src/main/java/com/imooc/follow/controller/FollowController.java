package com.imooc.follow.controller;

import com.imooc.commons.model.domain.ResultInfo;
import com.imooc.commons.utils.ResultInfoUtil;
import com.imooc.follow.service.FollowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@RestController
public class FollowController {

    @Resource
    private FollowService service;

    @Resource
    private HttpServletRequest request;


    /**
     * 获得共同关注的好友
     * @param dinerId 关注的用户
     * @param access_token 当前用户的token
     * @return
     */
    @GetMapping("commons/{dinerId}")
    public ResultInfo findCommonsFriends(@PathVariable Integer dinerId,
                                         String access_token) {
        return service.findCommonsFriends(dinerId,access_token,request.getServletPath());
    }


    /**
     *
     * @param followDinerId 关注的食客id
     * @param isFollowed 是否关注 1-关注 0-取关
     * @param access_token 登录用户token
     * @return
     */
    @PostMapping("/{followDinerId}")
    public ResultInfo follow(@PathVariable Integer followDinerId,
                             @RequestParam Integer isFollowed,
                             String access_token) {

        ResultInfo resultInfo = service.follow(followDinerId, access_token,
                isFollowed, request.getServletPath());
        return resultInfo;
    }
    /**
     * 获取粉丝列表
     *
     * @param dinerId
     * @return
     */
    @GetMapping("followers/{dinerId}")
    public ResultInfo findFollowers(@PathVariable Integer dinerId) {
        Set<Integer> followers = service.findFollowers(dinerId);
        return ResultInfoUtil.buildSuccess(request.getServletPath(), followers);
    }

}
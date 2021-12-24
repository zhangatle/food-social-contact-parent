package com.imooc.commons.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@ApiModel(description = "关注食客的信息")
public class ShortDinerInfo implements Serializable {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("头像")
    private String avatarUrl;
}

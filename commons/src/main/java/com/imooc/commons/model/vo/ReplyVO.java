package com.imooc.commons.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ApiModel(description = "回复实体类")
public class ReplyVO {
    @ApiModelProperty("食客信息")
    private ShortDinerInfo dinerInfo;

    @ApiModelProperty("回复内容")
    String content;

    @ApiModelProperty("针对回复的回复")
    List<ReplyVO> replys;
}

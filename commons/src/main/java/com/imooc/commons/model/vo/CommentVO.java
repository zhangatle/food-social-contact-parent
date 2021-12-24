package com.imooc.commons.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ApiModel(description = "多级餐厅评论实体类")
public class CommentVO {

    @ApiModelProperty("食客信息")
    private ShortDinerInfo dinerInfo;

    @ApiModelProperty("评论内容")
    String content;

    @ApiModelProperty("回复列表")
    List<ReplyVO> replys;
}


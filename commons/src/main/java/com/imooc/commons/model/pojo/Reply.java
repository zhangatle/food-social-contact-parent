package com.imooc.commons.model.pojo;

import com.imooc.commons.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "餐厅评论回复实体类")
public class Reply extends BaseModel {

    @ApiModelProperty("评论外键ID")
    private Integer fkReviewId;
    @ApiModelProperty("回复外键ID")
    private Integer fkReplyId;
    @ApiModelProperty("评论内容")
    private String content;
    @ApiModelProperty("食客外键ID")
    private Integer fkDinerId;
    @ApiModelProperty("被回复食客外键ID")
    private Integer fkReplyDinerId;
    @ApiModelProperty("评论层级")
    private int grade;
}


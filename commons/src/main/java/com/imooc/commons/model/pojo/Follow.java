package com.imooc.commons.model.pojo;

import com.imooc.commons.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "食客关注实体类")
@Setter
@Getter
public class Follow extends BaseModel {

    @ApiModelProperty("用户Id")
    private int dinerId;
    @ApiModelProperty("关注用户的ID")
    private int followDinerId;
}

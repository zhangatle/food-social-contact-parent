package com.imooc.commons.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体对象公共属性
 */
@Setter
@Getter
public class BaseModel implements Serializable {
    private Integer id;
    private Date createDate;
    private Date updateDate;
    private int isValid;
}

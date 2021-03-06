package com.arawn.lib.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 标签实体
 * Created by ArawN on 2017/10/29.
 */
@Getter
@Setter
public class Tag {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 标签名称
     */
    private String name;
}

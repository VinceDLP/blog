package com.poe.ssfhc.blog.authority.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Menu {
    /**
     * 菜单ID
     * */
    private String menuId;
    /**
     * 菜单名称
     * */
    private String menuName;
    /**
     * 父菜单ID
     * */
    private String parentId;
    /**
     * 请求地址
     * */
    private String url;
    /**
     * 菜单类型（M目录 C菜单 F按钮）
     * */
    private String menuType;
    /**
     * 权限标识
     * */
    private String perms;
    /**
     * 创建者
     * */
    private String createBy;
    /**
     * 创建时间
     * */
    private Date createTime;
    /**
     * 更新者
     * */
    private String updateBy;
    /**
     * 更新时间
     * */
    private Date updateTime;
}
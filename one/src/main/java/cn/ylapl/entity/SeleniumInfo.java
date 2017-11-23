/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author yangle
 * @version $Id SeleniumInfo.java, v 0.1 2017-01-22 下午3:56 yangle Exp $$
 */
@Data
@Slf4j
public class SeleniumInfo {
    /**
     * id
     */
    private int id;
    /**
     * 信息
     */
    private String info;
    /**
     * IP地址
     */
    private String ip;
    /**
     * 时间
     */
    private Date createDate;
}
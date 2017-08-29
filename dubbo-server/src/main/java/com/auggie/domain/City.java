/**
 * Project Name:springboot-dubbo-client
 * File Name:City.java
 * Package Name:com.auggie.domain
 * Date:2017年8月28日下午5:56:48
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.domain;

import java.io.Serializable;

/**
 * Describe:(描述).
 * ClassName:City <br/>
 * Date:     2017年8月28日 下午5:56:48 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@SuppressWarnings("serial")
public class City implements Serializable{

	/**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;
    
    public City() {
    }

    public City(Long id, Long provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


/**
 * Project Name:springboot-dubbo-client
 * File Name:CityDubboConsumerService.java
 * Package Name:com.auggie.dubbo
 * Date:2017年8月28日下午5:58:31
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.auggie.domain.City;

/**
 * Describe:(描述).
 * ClassName:CityDubboConsumerService <br/>
 * Date:     2017年8月28日 下午5:58:31 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@Component
public class CityDubboConsumerService {

	@Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}


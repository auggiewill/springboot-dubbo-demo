/**
 * Project Name:springboot-dubbo-server
 * File Name:CityDubboServiceImpl.java
 * Package Name:com.auggie.dubbo.impl
 * Date:2017年8月29日上午11:00:21
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.auggie.domain.City;
import com.auggie.dubbo.CityDubboService;

/**
 * Describe:(描述).
 * ClassName:CityDubboServiceImpl <br/>
 * Date:     2017年8月29日 上午11:00:21 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

	@Override
	public City findCityByName(String cityName) {

		return new City(1L,2L,"温岭","是我的故乡");
	}

}


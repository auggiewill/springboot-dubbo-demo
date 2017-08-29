/**
 * Project Name:springboot-dubbo-client
 * File Name:CityDubboService.java
 * Package Name:com.auggie.dubbo
 * Date:2017年8月28日下午5:57:29
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.dubbo;

import com.auggie.domain.City;

/**
 * Describe:(描述).
 * ClassName:CityDubboService <br/>
 * Date:     2017年8月28日 下午5:57:29 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
public interface CityDubboService {
	
	City findCityByName(String cityName);

}


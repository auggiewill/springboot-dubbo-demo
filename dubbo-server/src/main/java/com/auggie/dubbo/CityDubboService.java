/**
 * Project Name:springboot-dubbo-server
 * File Name:CityDubboService.java
 * Package Name:com.auggie.dubbo
 * Date:2017年8月29日上午10:59:38
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.dubbo;

import com.auggie.domain.City;

/**
 * Describe:(描述).
 * ClassName:CityDubboService <br/>
 * Date:     2017年8月29日 上午10:59:38 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
public interface CityDubboService {

	City findCityByName(String cityName);
}


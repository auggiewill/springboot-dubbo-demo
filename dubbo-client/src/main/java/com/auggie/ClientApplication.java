/**
 * Project Name:springboot-dubbo-client
 * File Name:ClientApplication.java
 * Package Name:com.auggie
 * Date:2017年8月28日下午5:56:25
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.auggie.dubbo.CityDubboConsumerService;

/**
 * Describe:(描述).
 * ClassName:ClientApplication <br/>
 * Date:     2017年8月28日 下午5:56:25 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        CityDubboConsumerService cityService = run.getBean(CityDubboConsumerService.class);
        cityService.printCity();
	}
}


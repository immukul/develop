package com.test.series.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.test.series.controller", "dls.coaching.service", "com.test.series.service" })
public class ParentConfig {

	
}

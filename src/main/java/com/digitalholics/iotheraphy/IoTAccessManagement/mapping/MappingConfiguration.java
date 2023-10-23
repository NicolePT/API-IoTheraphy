package com.digitalholics.iotheraphy.IoTAccessManagement.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("iotDeviceMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public IotDeviceMapper iotDeviceMapper() { return new IotDeviceMapper();}

    @Bean
    public ResultMapper ResultMapper() { return new ResultMapper();}
}

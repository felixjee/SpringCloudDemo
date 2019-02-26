package com.felix.project.client;

import com.felix.project.config.FeignConfig;
import com.felix.project.fallback.EurekaClientFeignHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-service",configuration = FeignConfig.class,fallback = EurekaClientFeignHystric.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/user/list")
    Object getList();
}

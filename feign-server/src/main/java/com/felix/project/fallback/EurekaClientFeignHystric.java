package com.felix.project.fallback;

import com.felix.project.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientFeignHystric implements EurekaClientFeign {
    @Override
    public Object getList() {
        return "error";
    }
}

package com.homismart.common.client.uaa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("uaa")
public interface UserInterface {
    @GetMapping("/getHello")
    public String getHello();

}

package com.homismart.uaa.internace.impl;

import com.homismart.common.client.uaa.UserInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class userimpl implements UserInterface {
    @Override
    public String getHello() {
        log.info("调动feign");
        return "say hello 8083";
    }
}

package com.homismart.web.Controller;

import com.homismart.common.client.uaa.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserInterface userInterface;
    @GetMapping("/getHello")
    public String getHello(){
        return userInterface.getHello();
    }

}

package com.drafire.spring_boot.controller;

import com.drafire.spring_boot.domain.User;
import com.drafire.spring_boot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController 支持WebSocket 版本
 */
@RestController
public class WebSocketUserController {

    private final Logger logger= LoggerFactory.getLogger(WebSocketUserController.class);

    @Autowired
    private UserService userService;

    @MessageMapping("/websocket/user")
    @SendTo("/topic/getUser")
    public User getUser(String id) {
        logger.info("id={}",id);
        int rightId= Integer.parseInt(id);
        return userService.getUserByMapper(rightId);
    }
}

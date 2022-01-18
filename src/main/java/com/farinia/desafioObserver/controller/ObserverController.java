package com.farinia.desafioObserver.controller;

import com.farinia.desafioObserver.model.UserConfig;
import com.farinia.desafioObserver.services.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ObserverController {

    private static final Logger logger = LoggerFactory.getLogger(ObserverController.class);

    @Autowired
    ConfigService configService;

    @GetMapping("/users")
    String getConfig(){
        logger.info("Get usuario config");
        return configService.toString();
    }

    @PutMapping("/users")
    UserConfig updateConfig(@RequestBody UserConfig userConfig) {
        logger.info("Put actualizar usuario config");
        configService.updateUserConfig(userConfig.getRol(),userConfig.getEmail(), userConfig.getPhone());
        return userConfig;
    }
}

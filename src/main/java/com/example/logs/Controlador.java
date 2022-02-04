package com.example.logs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controlador {

    public Controlador() {
        log.error("Error desde controlador");
        log.warn("warn desde controlador");
        log.info("info desde controlador");

    }
}

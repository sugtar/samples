package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DemoRestController {

    private static final Logger logger = LoggerFactory.getLogger(DemoRestController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("index is called.");
        return "Hello world!";
    }

    @GetMapping("/foo")
    public String foo(@RequestParam(value = "param", defaultValue="param", required = false) String param) {
        logger.info("foo is called.");
        return "Hello world!";
    }

    @PostMapping("/bar")
    public String bar() {
        logger.info("bar is called.");
        return "Hello world!";
    }
}

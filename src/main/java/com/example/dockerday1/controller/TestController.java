package com.example.dockerday1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: TestController
 *
 * @author jason
 * @version 1.0
 * @date 2020/6/19
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * http://127.0.0.1:8090/test/index
     * http://58.87.113.58:8091/test/index
     *
     * @return
     */
    @GetMapping("/index")
    public String index() {
        log.info("index1");
        return "index1";
    }

}
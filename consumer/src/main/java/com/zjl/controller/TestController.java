package com.zjl.controller;

import com.zjl.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zoujialiang
 * @date 2020/11/26 21:29
 */
@RestController
@RequestMapping("/wms")
public class TestController {
    @Autowired
    private ProviderFeign providerFeign;

    @PostMapping("/test")
    public Object test() {
        return providerFeign.test();
    }
}

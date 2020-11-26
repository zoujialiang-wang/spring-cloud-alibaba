package com.zjl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @auther zoujialiang
 * @date 2020/11/26 21:23
 */
@FeignClient(name = "provide")
public interface ProviderFeign {
    @PostMapping("/wms-ware-info/test")
    Object test();
}

package com.zjl.controller;


import com.zjl.entity.WmsWareInfo;
import com.zjl.service.impl.WmsWareInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 仓库信息 前端控制器
 * </p>
 *
 * @author ZouJiaLiang
 * @since 2020-11-21
 */
@RestController
@RequestMapping("/wms-ware-info")
public class WmsWareInfoController {
    @Autowired
    private WmsWareInfoServiceImpl wareInfoService;

    @PostMapping("/test")
    public Object test() {
        List<WmsWareInfo> list = wareInfoService.list();
        return list;
    }

    ;

}


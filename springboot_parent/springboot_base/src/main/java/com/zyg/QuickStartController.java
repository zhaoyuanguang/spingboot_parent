package com.zyg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/8 18:11
 * Content:
 */
@Controller
public class QuickStartController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "Springboot 访问成功";
    }
}

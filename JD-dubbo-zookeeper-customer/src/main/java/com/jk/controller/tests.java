/**
 * Copyright (C), 2015-2018, bin.yang.com
 * FileName: tests
 * Author:   杨斌
 * Date:     2018/7/4 0004 21:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.service.testDubbo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 杨斌
 * @create 2018/7/4 0004
 * @since 1.0.0
 */
@Controller
@RequestMapping("tests")
public class tests {

    @Resource
    private testDubbo testService;

    @RequestMapping("testss")
    public void testsss(){
        testService.tests();
    }

}

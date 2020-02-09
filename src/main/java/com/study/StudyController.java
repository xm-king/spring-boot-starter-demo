package com.study;

import com.spring.study.module.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/12/15
 */
@RestController
public class StudyController {

    @Resource
    HelloService helloService;

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return helloService.sayHello();
    }
}

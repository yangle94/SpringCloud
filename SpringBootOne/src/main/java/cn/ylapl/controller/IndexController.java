package cn.ylapl.controller;

import cn.ylapl.feignInterface.Test1;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yangle
 * @version $Id IndexController.java, v 0.1 2017-02-08 下午1:30 yangle Exp $$
 */
@RestController
@RequestMapping("jpush")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    private final Test1 test1;

    @Autowired
    public IndexController(Test1 test1) {
        this.test1 = test1;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "记录ID", required = true, dataType = "String", paramType = "Query")
    })
    @RequestMapping("/test")
    public String index(@RequestParam String id) {
        logger.error("springbootOne1被调用{}", id);
        return test1.test1();
    }
}
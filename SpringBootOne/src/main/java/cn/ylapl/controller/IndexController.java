package cn.ylapl.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author yangle
 * @version $Id IndexController.java, v 0.1 2017-02-08 下午1:30 yangle Exp $$
 */
@RestController
@RequestMapping("jpush")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "记录ID", required = true, dataType = "String", paramType = "Query")
    })
    @RequestMapping("/test")
    public String index(@RequestParam String id) {
        logger.error("springbootOne1被调用{}", id);
        return "id:" + id;
    }

    public static IndexController getIndex() {
        return new IndexController();
    }
}
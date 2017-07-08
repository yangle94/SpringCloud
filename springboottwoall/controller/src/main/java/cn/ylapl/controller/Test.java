package cn.ylapl.controller;

import cn.ylapl.api.Test1ControllereApi;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Angle
 * Date: 2017/7/2
 * Time: 上午9:19
 */
@RestController
public class Test implements Test1ControllereApi {

    @ApiImplicitParams({
    })
    @Override
    public String test1() {
        return "已经进入test,测试feign成功";
    }

}
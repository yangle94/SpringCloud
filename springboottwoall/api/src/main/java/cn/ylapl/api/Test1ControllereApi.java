package cn.ylapl.api;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用feign的controller api
 *
 * @author
 * @create 2017-07-02 上午9:04
 **/
@RequestMapping("test")
public interface Test1ControllereApi {

    @RequestMapping("test1")
    String test1();
}

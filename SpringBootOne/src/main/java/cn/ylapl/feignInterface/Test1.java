package cn.ylapl.feignInterface;

import cn.ylapl.api.Test1ControllereApi;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-07-02 上午9:29
 **/
@FeignClient("springbootTwo")
public interface Test1 extends Test1ControllereApi {
}

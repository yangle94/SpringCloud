package cn.ylapl.config;

import cn.ylapl.controller.PublicUserControllerApi;
import cn.ylapl.util.ResultBean;
import cn.ylapl.vo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 用户service
 *
 * @date: 2017/12/13
 * @time: 下午2:18
 * @author: Angle
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private PublicUserControllerApi publicUserControllerApi;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        ResultBean<UserDTO> resultBean = publicUserControllerApi.getUserByMobile(username);
        return new UserDetailsDTO(resultBean.getObject());
    }
}
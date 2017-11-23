package cn.ylapl.config.oauth;

import cn.ylapl.controller.PublicUserControllerApi;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * ouath2用户查询
 *
 * @date: 2017/11/23
 * @time: 上午10:11
 * @author: Angle
 */
public class UserDetailsServiceImpl implements UserDetailsService{

    private PublicUserControllerApi publicUserControllerApi;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
package com.qfedu.ljb.api.login.service;

import com.qfedu.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "LoginProvider")
public interface LoginService {
    //实现登录
    @PostMapping("/login/login.do")
    R login(@RequestParam("phone") String phone, @RequestParam("password") String password);

    //校验登录有效性
    @GetMapping("/login/checklogin.do")
    R check(@RequestParam(value = "token", required = false) String token);

    //注销
    @GetMapping("/login/exit.do")
    R exit(@RequestParam("token") String token);

}

package top.zhanghb.h5api.controller.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/getUserInfo")
    @ResponseBody
    public Authentication getUserInfo( ){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }


}
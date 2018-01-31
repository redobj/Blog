package top.redobj.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.redobj.blog.bean.Msg;
import top.redobj.blog.bean.User;
import top.redobj.blog.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/api/user/{id}")
    public Msg userinfo(@PathVariable("id") int id){
        User user = userService.getUserInfo(id);
        return user == null ? Msg.fail():Msg.success().add("userInfo",user);
    }



}

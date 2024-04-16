package com.lbj.example.consumer;

import com.lbj.example.common.model.User;
import com.lbj.example.common.service.UserService;
//import com.lbj.example.rpc-simper.proxy.ServiceProxyFactory;

public class EaseConsumerExample {
    public static void main(String[] args) {
        // todo需要获得UserService的实现类对象
        UserService userService = null; // 由于还没有获取service示例，暂设为null
        User user = new User();
        user.setName("LBJ");

        // 调用
        User newUser = userService.getUser(user);
        if(newUser != null) {
            System.out.println(newUser.getName());
        }
        else {
            System.out.println("user == null");
        }
    }
}

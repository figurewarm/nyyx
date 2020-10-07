package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.UserRepository;
import com.jiaobuqifangzu.nyyx.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ： 卢芮
 * 用户handler
 *！！！还未进行异常捕捉
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    //注入userrepository
    @Autowired
    UserRepository userRepository;

    //用户名已存在变量
    private static final int USERALREADYEXIST = -1;

    /**
     * 用户登录
     * @param userReq
     * @return
     */
    @PostMapping("/login")
    public User findUserByData(@RequestBody User userReq){
        System.out.println(userReq.getUsername());
        User loginUser = userRepository.findByUsernameAndPassword(userReq.getUsername(), userReq.getPassword());
        //User user = null;
        //user = userService.findUserByUsernameAndPassword(userReq.getUsername(), userReq.getPassword());
        System.out.println(loginUser.getId());
        return loginUser;
    }

    /**
     *用户注册
     * @param userReq 用户对象
     * @return
     */
    @PostMapping("/register")
    public User registerUser(@RequestBody User userReq){

        //用户名已经存在
        if (userRepository.findByUsername(userReq.getUsername()) != null){

            //返回的user对象的id设置为-1 ，目前并没有进行异常捕捉
            User error_user = new User();
            error_user.setId(USERALREADYEXIST);
            return error_user;
        }
        //进行注册
        else {
            User user_success = userRepository.save(userReq);
            return user_success;
        }


    }

    /**
     * 获取用户信息
     * @param userReq
     * @return
     */
    @GetMapping("/getmessage")
    public User getUserMessage(@RequestBody User userReq){

        return userRepository.findById(userReq.getId()).get();

    }

    /**
     * ！！！还未完成 还需前端沟通接口
     * 修改用户信息  ！！！
     * @param userReq 修改用户信息类
     * @return
     */
    @PostMapping("/modifyuser")
    public User modifyUser(@RequestBody User userReq){

        User userInDB = userRepository.findById(userReq.getId()).get();

        //复制属性
        BeanUtils.copyProperties(userReq,userInDB);

        //再次保存
        userRepository.save(userInDB);

        return userInDB;
    }
}

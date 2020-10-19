package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.UserRepository;
import com.jiaobuqifangzu.nyyx.domain.User;
import com.jiaobuqifangzu.nyyx.entityForReturn.LoginReturn;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 组名：交不起房组
 * 创建人： 卢芮
 * 日期 ：2020/10/17
 * 描述： 用户handler
 * 版本 ：1.0
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
     * 编写人：卢芮
     * 日期：2020/10/17
     * @param phone 电话号码
     * @param password 密码
     * @return
     */
    @GetMapping("/login")
    public LoginReturn findUserByData(@RequestParam(value = "phone_num") String phone, @RequestParam(value = "password") String password){
        //System.out.println(userReq.getUsername());
        User userPhone = userRepository.findByPhoneNum(phone);
        LoginReturn loginReturn = new LoginReturn();
        User loginUser = userRepository.findByPhoneNumAndPassword(phone, password);

        //用户名不存在
        if (userPhone == null){

            loginReturn.setCode(1);
            loginReturn.setMsg("用户不存在");

        }
        //密码不正确
        else if (loginUser == null){
            loginReturn.setCode(2);
            loginReturn.setMsg("密码错误");
        }
        //登录正确
        else {
            loginReturn.setCode(0);
            loginReturn.setMsg("登录成功");
        }

        //User loginUser = userRepository.findByUsernameAndPassword(userReq.getUsername(), userReq.getPassword());
        //User user = null;
        //user = userService.findUserByUsernameAndPassword(userReq.getUsername(), userReq.getPassword());
       // System.out.println(loginUser.getId());
        return loginReturn;
        //return loginUser;
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


    /**
     * 编写人：卢芮
     * 日期：2020/10/19
     * @param userID 用户id
     * @param courseID 课程id
     * 根据传入参数删除课程信息
     * @return 课程信息
     */
    public LoginReturn exitCourse(@RequestParam(value = "user_id") String userID, @RequestParam(value = "course_id") String courseID){

        //检验传入参数




        return null;
    }
}

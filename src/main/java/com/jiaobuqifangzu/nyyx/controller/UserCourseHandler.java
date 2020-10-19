package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.CourseRepository;
import com.jiaobuqifangzu.nyyx.dao.repository.UserCourseRepository;
import com.jiaobuqifangzu.nyyx.domain.Course;
import com.jiaobuqifangzu.nyyx.domain.UserCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author ChenXing
 * @date 2020/10/9 16:47
 */
@RestController
@RequestMapping("/usercourse")
public class UserCourseHandler {
    @Autowired
    UserCourseRepository userCourseRepository;


    /**
     * 加入课程
     *
     * @param usercourseReq
     * @return
     */
    @PostMapping("/add")
    public UserCourse addUserCourse(@RequestBody UserCourse usercourseReq) {
        UserCourse res = userCourseRepository.save(usercourseReq);
        System.out.println("加入课程");
        return res;
    }

    /**
     * 退出课程
     *
     * @param usercourseReq
     * @return 1 为删除成功
     * 0 为删除失败
     */
    @DeleteMapping("/delete")
    public String deleteUserCourse(@RequestBody UserCourse usercourseReq) {

        System.out.println(usercourseReq.getUserId() + "user   " + usercourseReq.getCourseId() + "cou");
        List<UserCourse> res = userCourseRepository.findUserCourseByUserIdAndCourseId(usercourseReq.getUserId(), usercourseReq.getCourseId());
        if (res.size() >= 1)
            for (UserCourse uc : res
            ) {
                userCourseRepository.deleteById(uc.getId());
            }
        List<UserCourse> res1 = userCourseRepository.findUserCourseByUserIdAndCourseId(usercourseReq.getUserId(), usercourseReq.getCourseId());
        if (res1.size() < 1)
            return "1";
        return "0";
    }

    /**
     * 已加入课程
     *
     * @param usercourseReq
     * @return
     */
    @GetMapping("/all")
    public List<UserCourse> allJoin(@RequestBody UserCourse usercourseReq) {
        List<UserCourse> res = userCourseRepository.findUserCoursesByUserId(usercourseReq.getUserId());
        return res;
    }
}

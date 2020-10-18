package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.CourseRepository;
import com.jiaobuqifangzu.nyyx.domain.Course;
//import com.sun.javadoc.SourcePosition;
import com.jiaobuqifangzu.nyyx.entityForReturn.FileReturn;
import com.jiaobuqifangzu.nyyx.entityForReturn.LoginReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.ColorUIResource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ChenXing
 * @date 2020/10/9 11:47
 * <p>
 * 课程hanlder
 */
@RestController
@RequestMapping("/course")
public class CourseHandler {
    @Autowired
    CourseRepository courseRepository;

    /**
     * 添加课程
     *
     * @param courseReq
     * @return
     * 编写人：陈星
     * 日期：2020/10/18
     * 输入说明：课程信息
     * 输出说明：请求是否成功信息
     * 功能简述：向数据库中插入一条数据
     */
    @PostMapping("/add")
    public LoginReturn addCourse(@RequestBody Course courseReq) {

        Date data = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String formattedDate = dateFormat.format(data);
        courseReq.setCreateTime(data);
//        System.out.println(courseReq);
        try {
            courseRepository.save(courseReq);
            return new LoginReturn(0, "课程创建成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new LoginReturn(1, "课程创建失败");
    }

    /**
     * 已发布课程
     *
     * @param courseReq
     * @return
     */
    @GetMapping("/courses")
    public List<Course> findByTeacherId(@RequestBody Course courseReq) {
        List<Course> res = courseRepository.findCoursesByTeacher_id(courseReq.getTeacher_id());
        System.out.println("kechegnxinxi");
        return res;
    }
}

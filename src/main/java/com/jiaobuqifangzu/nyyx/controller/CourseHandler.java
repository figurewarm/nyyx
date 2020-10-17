package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.CourseRepository;
import com.jiaobuqifangzu.nyyx.domain.Course;
//import com.sun.javadoc.SourcePosition;
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
 *
 * 课程hanlder
 *
 */
@RestController
@RequestMapping("/course")
public class CourseHandler {
    @Autowired
    CourseRepository courseRepository;

    /**
     * 添加课程
     * @param courseReq
     * @return
     */
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course courseReq){

        Date data = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String formattedDate = dateFormat.format(data);
        courseReq.setCreateTime(data);
        System.out.println(courseReq);
        Course res = courseRepository.save(courseReq);
        System.out.println("课程添加。");
        return res;
    }

    /**
     * 已发布课程
     * @param courseReq
     * @return
     */
    @GetMapping("/courses")
    public List<Course> findByTeacherId(@RequestBody Course courseReq){
        List<Course> res = courseRepository.findCoursesByTeacherId(courseReq.getTeacherId());
        System.out.println("kechegnxinxi");
        return res;
    }
}

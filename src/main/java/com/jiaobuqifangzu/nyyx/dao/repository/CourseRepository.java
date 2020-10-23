

package com.jiaobuqifangzu.nyyx.dao.repository;

import com.jiaobuqifangzu.nyyx.domain.Course;
import com.jiaobuqifangzu.nyyx.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author ChenXing
 * @date 2020/10/9 11:52
 */

public interface CourseRepository extends JpaRepository<Course, Integer>, JpaSpecificationExecutor<Course> {
    @Query(value = "select * from course where teacher_id = :teacherId", nativeQuery = true)
    public List<Course> findCoursesByTeacher_id(@Param("teacherId") Integer teacherId);


   /**
    * TO-DO
    * 获取推荐课程列表
    */
    //模糊查询
    //public List<Course> findAllByCourseNameLike(String course_name);
}

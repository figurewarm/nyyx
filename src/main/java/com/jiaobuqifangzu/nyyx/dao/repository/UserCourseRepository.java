package com.jiaobuqifangzu.nyyx.dao.repository;

import com.jiaobuqifangzu.nyyx.domain.Course;
import com.jiaobuqifangzu.nyyx.domain.UserCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
/**
 * @author ChenXing
 * @date 2020/10/9 16:44
 */
public interface UserCourseRepository extends JpaRepository<UserCourse, Integer>, JpaSpecificationExecutor<UserCourse> {

    public List<UserCourse> findUserCoursesByUserId(Integer id);
    public List<UserCourse> findUserCourseByUserIdAndCourseId(Integer userid,Integer courserid);

    //根据用户id和课程id删除课程
    public Course deleteByUserIdAndCourseId(Integer userid, Integer courseid);
}

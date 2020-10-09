package com.jiaobuqifangzu.nyyx.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "course")
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//标注主键，且为自增长型
  @Column(name = "id")
  private int id;

  @Column(name = "course_name")
  private String courseName;

  @Column(name = "teacher_id")
  private int teacherId;

  @Column(name = "create_time")
  private Date createTime;

  @Column(name = "cover_route")
  private String cover_route;

  @Column(name = "brief_introduction")
  private String brief_introduction;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }


  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}

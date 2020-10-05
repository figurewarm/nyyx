package com.jiaobuqifangzu.nyyx.domain;


import lombok.Data;

import java.util.Date;

@Data
public class Course {

  private int id;
  private String courseName;
  private int teacherId;
  private Date createTime;
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

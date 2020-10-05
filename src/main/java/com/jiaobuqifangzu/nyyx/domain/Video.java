package com.jiaobuqifangzu.nyyx.domain;


import lombok.Data;

import java.util.Date;
@Data
public class Video {

  private int id;
  private String videoName;
  private int courseId;
  private String videoRoute;
  private String coverRoute;
  private Date createTime;
  private String brief_introduction;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getVideoName() {
    return videoName;
  }

  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }


  public String getVideoRoute() {
    return videoRoute;
  }

  public void setVideoRoute(String videoRoute) {
    this.videoRoute = videoRoute;
  }


  public String getCoverRoute() {
    return coverRoute;
  }

  public void setCoverRoute(String coverRoute) {
    this.coverRoute = coverRoute;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}

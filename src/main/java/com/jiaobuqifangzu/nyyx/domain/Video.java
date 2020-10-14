package com.jiaobuqifangzu.nyyx.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "video")
public class Video {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//标注主键，且为自增长型
  @Column(name = "id")
  private int id;
  @Column(name = "video_name")
  private String videoName;
  @Column(name = "course_id")
  private int courseId;
  @Column(name = "video_route")
  private String videoRoute;
  @Column(name = "cover_route")
  private String coverRoute;
  @Column(name = "create_time")
  private Date createTime;
  @Column(name = "brief_introduction")
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

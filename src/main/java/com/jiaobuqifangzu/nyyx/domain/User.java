package com.jiaobuqifangzu.nyyx.domain;


import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class User {

  //用户id
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  //用户电话号码
  @Column(name = "phone_num")
  private String phoneNum;

  //用户名
  @Column(name = "username")
  private String username;

  //密码
  @Column(name = "password")
  private String password;

  //性别
  @Column(name = "sex")
  private String sex;

  //用户类型 0学生 1老师
  @Column(name = "user_type")
  private Integer userType;

  //头像地址
  @Column(name = "head_img")
  private String headImg;

  //证件照地址
  @Column(name = "certificates")
  private String certificates;

  //学校号
  @Column(name = "school_id")
  private Integer schoolId;

  //创建时间
  @Column(name = "create_time")
  private Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getCertificates() {
    return certificates;
  }

  public void setCertificates(String certificates) {
    this.certificates = certificates;
  }


  public Integer getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}

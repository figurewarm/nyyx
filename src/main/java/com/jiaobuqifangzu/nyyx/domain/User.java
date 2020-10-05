package com.jiaobuqifangzu.nyyx.domain;


import java.util.Date;

public class User {

  private int id;
  private String phoneNum;
  private String username;
  private String password;
  private String sex;
  private int userType;
  private String headImg;
  private String certificates;
  private int schoolId;
  private Date createTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
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


  public int getUserType() {
    return userType;
  }

  public void setUserType(int userType) {
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


  public int getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(int schoolId) {
    this.schoolId = schoolId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}

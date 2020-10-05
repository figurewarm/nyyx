package com.jiaobuqifangzu.nyyx.domain;


import java.util.Date;

public class ShareFiles {

  private int id;
  private String fileName;
  private int userId;
  private String fileRoute;
  private Date createTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }


  public String getFileRoute() {
    return fileRoute;
  }

  public void setFileRoute(String fileRoute) {
    this.fileRoute = fileRoute;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}

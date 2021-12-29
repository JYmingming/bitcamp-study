package com.eomcs.mylist;

public class Board {
  String title;
  String content;
  int viewCount;
  java.sql.Date createDate;


  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
  }
  public java.sql.Date getCreateDate() {

    return createDate;
  }
  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "Board [title=" + title + ", content=" + content + ", viewCount=" + viewCount
        + ", createDate=" + createDate + "]";
  }

}

package com.example.spring05.model.member.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class MembersDTO {
	
	private int user_num;
	private String userid;
	private String passwd;
	private String name;
	private String sex;
	private String tel1;
	private String tel2;
	private String tel3;
	private String address1;
	private String address2;
	private String address3;
	private String image;
	private String context;
	private Date joinDate;
	private MultipartFile file1;
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	@Override
	public String toString() {
		return "MembersDTO [user_num=" + user_num + ", userid=" + userid + ", passwd=" + passwd + ", name=" + name
				+ ", sex=" + sex + ", tel1=" + tel1 + ", tel2=" + tel2 + ", tel3=" + tel3 + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3 + ", image=" + image + ", context=" + context
				+ ", joinDate=" + joinDate + ", file1=" + file1 + "]";
	}
	
	
}

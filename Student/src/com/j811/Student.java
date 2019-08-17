package com.j811;
/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author ljj
* @date 2019年8月11日 上午11:54:16
*
*/
public class Student {
	int id;
	String name;
	char sex;
	int age;
	String grade;
	String address;
	long tel;
	String email;
	@Override
	public String toString() {
		return "学生列表 [编号=" + id + ", 姓名=" + name + ", 性别=" + sex + ", 年龄=" + age + ", 年级=" + grade
				+ ", 地址=" + address + ", 电话=" + tel + ", 邮箱=" + email + "]";
	}
	
}

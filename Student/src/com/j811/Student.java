package com.j811;
/**
* @ClassName: Student
* @Description: TODO(������һ�仰��������������)
* @author ljj
* @date 2019��8��11�� ����11:54:16
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
		return "ѧ���б� [���=" + id + ", ����=" + name + ", �Ա�=" + sex + ", ����=" + age + ", �꼶=" + grade
				+ ", ��ַ=" + address + ", �绰=" + tel + ", ����=" + email + "]";
	}
	
}

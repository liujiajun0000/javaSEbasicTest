package com.j811;
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
* @ClassName: StudentManager
* @Description:学生管理系统 
* @author ljj
* @date 2019年8月11日 上午11:53:43
*
*/
public class StudentManager {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Start();
	}
	//学生信息存储
	static ArrayList<Student> students = new ArrayList<Student>();
	private static String name1;
	//开始程序
	public static void Start() {
		System.out.println("----------欢迎 登陆学生 信息管理系统----------");
		System.out.println("1.登录        2.退出");
		System.out.println("请选择：");
		int num = scanner.nextInt();
		if(num==1) {
			login();
		}else if(num==2) {
			System.out.println("系统退出！");
		}else {
			System.out.println("请重新输入！");
		}
	}
	//登陆程序
	public static void login() {
		System.out.println("欢迎登录！");
		String userName = "admin";
		String passWord = "admin";
		System.out.println("请输入用户名：");
		String name = scanner.next();
		System.out.println("请输入密码：");
		String pass = scanner.next();
		if(name.equals(userName) && pass.equals(passWord)) {
			System.out.println("登陆成功");
			System.out.println("欢迎您，admin");
			handle();
		}else {
			System.out.println("登录失败，请重试");
			login();
		}
	}
	//学生信息操作界面
	public static void handle() {
		System.out.println("********************请选择要操作的信息对应数字********************");
		System.out.println("*1.查看学生信息     2.添加学生信息      3.删除学生信息      4.修改学生信息      5.退出 *");
		System.out.println("请选择：");
		int num = scanner.nextInt();
		if(num==2) {
			add();
			handle();
		}else if(num==1) {
			view();
			handle();
		}else if(num==3) {
			delete();
			handle();
		}else if(num==4) {
			revise();
			handle();
		}else if(num==5) {}
		System.out.println("系统退出！");
	}
	//添加学生信息
	public static void add() {
		System.out.println("请输入学生id：");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄：");
		int age = scanner.nextInt();
		System.out.println("请输入学生所属年级：（只能初级、中级、高级）");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		System.out.println("请输入学生联系方式：");
		long tel = scanner.nextLong();
		System.out.println("请输入学生电子邮箱：");
		String email = scanner.next();
		Student stu = new Student();
		//创建学生
		stu.id = id;
		stu.name = name;
		stu.sex = sex;
		stu.age = age;
		stu.grade = grade;
		stu.address = address;
		stu.tel = tel;
		stu.email = email;
		//将学生信息导入存储数组
		students.add(stu);
		if(students !=null) {
			System.out.println("学生信息录入成功！");
		}
	}
	
	//查看学生信息
	public static void view() {
			System.out.println(students);
		}
	//删除学生信息
	public static void delete() {
		System.out.println("请输入你要删除的学生姓名：");
		String name1 = scanner.next();
		for(int i=0;i<students.size();i++) {
			if(students.get(i).name.equals(name1)) {
				students.remove(i);
				System.out.println("删除成功!"); 
				return;
			}
		}System.out.println("删除失败！");
	}
	//修改学生信息
	public static void revise() {
		System.out.println("请输入你要修改的学生的姓名");
		String name = scanner.next();
		System.out.println("请输入你要修改的年龄为："); 
		String age= scanner.next();
		System.out.println("请输入你要修改的年级为：(只能初级、中级、高级)"); 
		String grade =scanner.next();
		System.out.println("请输入你要修改的地址为："); 
		String address=scanner.next();
		System.out.println("请输入你要修改的联系方式为："); 
		long tel=scanner.nextLong();
		System.out.println("请输入你要修改的电子邮箱为："); 
		String email=scanner.next();
		System.out.println("修改后的信息为：");
		for(int i=0;i<students.size();i++) {
			if(students.get(i).name.equals(name)) {
				//students.set(i,age);
			}
		}
	}
}

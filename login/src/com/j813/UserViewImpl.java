package com.j813;
import java.util.*;
/**
* @ClassName: UserViewImpl
* @Description: 接口实现
* @author ljj
* @date 2019年8月14日 下午6:20:08
*
*/
public class UserViewImpl implements UserView {
	Scanner scanner = new Scanner(System.in);
	//引用userBiz
	private UserBizImpl userBizImpl = new UserBizImpl();
	@Override
	public void login() {
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		userBizImpl.login(userName,password);
		
	}

	@Override
	public void register() {
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		System.out.println("请重新输入密码：");
		String password1 = scanner.next();
		userBizImpl.register(userName, password, password1);

	}

}

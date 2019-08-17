package com.j813;
/**
* @ClassName: UserTest
* @Description: 接口测试
* @author ljj
* @date 2019年8月15日 上午8:24:23
*
*/
public class UserTest {
	private UserViewImpl userViewImpl = new UserViewImpl();
	public static void main(String[] args) {
		new UserTest().userViewImpl.register();
		new UserTest().userViewImpl.login();
		
	}
}

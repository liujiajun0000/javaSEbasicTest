package com.j813;
/**
* @ClassName: UserTest
* @Description: �ӿڲ���
* @author ljj
* @date 2019��8��15�� ����8:24:23
*
*/
public class UserTest {
	private UserViewImpl userViewImpl = new UserViewImpl();
	public static void main(String[] args) {
		new UserTest().userViewImpl.register();
		new UserTest().userViewImpl.login();
		
	}
}

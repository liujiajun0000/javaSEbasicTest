package com.j813;
import java.util.*;
/**
* @ClassName: UserViewImpl
* @Description: �ӿ�ʵ��
* @author ljj
* @date 2019��8��14�� ����6:20:08
*
*/
public class UserViewImpl implements UserView {
	Scanner scanner = new Scanner(System.in);
	//����userBiz
	private UserBizImpl userBizImpl = new UserBizImpl();
	@Override
	public void login() {
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();
		userBizImpl.login(userName,password);
		
	}

	@Override
	public void register() {
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("���������룺");
		String password = scanner.next();
		System.out.println("�������������룺");
		String password1 = scanner.next();
		userBizImpl.register(userName, password, password1);

	}

}

package com.j813;
/**
* @ClassName: UserBiz
* @Description: �ӿ�
* @author ljj
* @date 2019��8��14�� ����6:21:00
*
*/
public interface UserBiz {
	 void register(String username,String password,String password2);
	 void login(String username,String password);
}

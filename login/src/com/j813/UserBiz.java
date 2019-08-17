package com.j813;
/**
* @ClassName: UserBiz
* @Description: 接口
* @author ljj
* @date 2019年8月14日 下午6:21:00
*
*/
public interface UserBiz {
	 void register(String username,String password,String password2);
	 void login(String username,String password);
}

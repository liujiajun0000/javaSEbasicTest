package com.j813;
/**
* @ClassName: UserBizImpl
* @Description:接口实现
* @author ljj
* @date 2019年8月14日 下午6:20:38
*
*/
public class UserBizImpl implements UserBiz{
    public static User[] users = {
    	new User("admin","admin","Administrator","admin@126.com"),
    	new User("tom","cat","tomcat","tomcat@cat.com")
    };
    
	@Override
	public void register(String username, String password, String password2) {
		//用户名是否存在
		boolean check1 = check(username);
		if(check1) {
			System.err.println("用户名已存在！");
			return;
		}
		//两次密码输入不一致
		if(!password.equals(password2)) {
			System.err.println("两次密码输入不一致");
			return;
		}
	}
	//检查用户名是否存在
	private boolean check(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return true;
			}
		}return false;
	}

	//通过用户名找密码
	private String psw(String userName) {
		for(int i=0;i<users.length;i++) {
		if(userName.equals(users[i].getUsername())) {
			return users[i].getPassword();
			}
		}return null;
	}
	@Override
	public  void login(String username, String password) {
		//登陆用户名是否存在
		boolean check2 = check(username);
		if(!check2) {
			System.err.println("登录用户名不存在");
			return;
		}
		//用户名与密码不匹配
		String printPsw= psw(username);
		if(!printPsw.equals(password)){
			System.err.println("密码错误");
		}
	}
}


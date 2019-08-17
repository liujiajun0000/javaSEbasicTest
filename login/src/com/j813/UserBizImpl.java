package com.j813;
/**
* @ClassName: UserBizImpl
* @Description:�ӿ�ʵ��
* @author ljj
* @date 2019��8��14�� ����6:20:38
*
*/
public class UserBizImpl implements UserBiz{
    public static User[] users = {
    	new User("admin","admin","Administrator","admin@126.com"),
    	new User("tom","cat","tomcat","tomcat@cat.com")
    };
    
	@Override
	public void register(String username, String password, String password2) {
		//�û����Ƿ����
		boolean check1 = check(username);
		if(check1) {
			System.err.println("�û����Ѵ��ڣ�");
			return;
		}
		//�����������벻һ��
		if(!password.equals(password2)) {
			System.err.println("�����������벻һ��");
			return;
		}
	}
	//����û����Ƿ����
	private boolean check(String userName) {
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUsername())) {
				return true;
			}
		}return false;
	}

	//ͨ���û���������
	private String psw(String userName) {
		for(int i=0;i<users.length;i++) {
		if(userName.equals(users[i].getUsername())) {
			return users[i].getPassword();
			}
		}return null;
	}
	@Override
	public  void login(String username, String password) {
		//��½�û����Ƿ����
		boolean check2 = check(username);
		if(!check2) {
			System.err.println("��¼�û���������");
			return;
		}
		//�û��������벻ƥ��
		String printPsw= psw(username);
		if(!printPsw.equals(password)){
			System.err.println("�������");
		}
	}
}


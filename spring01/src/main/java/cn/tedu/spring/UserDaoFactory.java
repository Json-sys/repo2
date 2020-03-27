package cn.tedu.spring;

public class UserDaoFactory {
	public UserDao newInstance(){
		System.out.println("开始创建UserDao");
		return new UserDao(null);
	}
}

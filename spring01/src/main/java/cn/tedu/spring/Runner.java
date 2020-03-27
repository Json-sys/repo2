package cn.tedu.spring;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		//加载配置文件
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
                                                                                                                  
		Date date = (Date)ac.getBean("date");
		User user = (User) ac.getBean("user");
		Calendar calendar = (Calendar)ac.getBean("calendar");
		Person person = (Person)ac.getBean("person");
		UserDao dao = (UserDao)ac.getBean("userDao");
		
		System.out.println(date);
		System.out.println(user);
		System.out.println(calendar);
		System.out.println(person);
		System.out.println(dao);
		
		ac.close();
	}
}

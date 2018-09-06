package cn.chf;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.chf.bean.Person;

public class TestIoc {

	@Test
	public void Test(){
		// 通过一个配置文件, 创建一个容器对象
		/**
		 * 容器对象在创建时, 会读取配置文件
		 * 根据XML中的bean节点, 来创建一个个的对象, 并存储到容器中(存储的key , 为bean节点的id属性)
		 */
		ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o1 = beans.getBean("person");
		//Person o2 =(Person) beans.getBean("person");
		System.out.println(o1);
		//System.out.println(o1==o2);	
	} 
	
	@Test
	public void Test11(){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = context.getBean("person",Person.class);
		p.setAge(19);
		p.setName("Alves");
		System.out.println(p);
			
	} 
}

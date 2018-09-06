package cn.chf;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.chf.bean.Person;

public class TestIoc {

	@Test
	public void Test(){
		// ͨ��һ�������ļ�, ����һ����������
		/**
		 * ���������ڴ���ʱ, ���ȡ�����ļ�
		 * ����XML�е�bean�ڵ�, ������һ�����Ķ���, ���洢��������(�洢��key , Ϊbean�ڵ��id����)
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

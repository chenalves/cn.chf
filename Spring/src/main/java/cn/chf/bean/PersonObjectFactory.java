package cn.chf.bean;
/**
 * ʵ������
 * @author j
 */
public class PersonObjectFactory {

	public Person getPerson() {
		System.out.println("ʵ����������������");
		return new Person();
	}
}

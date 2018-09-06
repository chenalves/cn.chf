package cn.chf.bean;
/**
 * 实例工厂
 * @author j
 */
public class PersonObjectFactory {

	public Person getPerson() {
		System.out.println("实例工厂方法被调用");
		return new Person();
	}
}

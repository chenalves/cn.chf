package cn.chf.bean;
/**
 * 静态工厂
 * @author j
 *
 */
public class PersonStaticFactory {

	public static Object getPerson() {
		System.out.println("静态工厂方法被调用");
		return new Person();
	}
}

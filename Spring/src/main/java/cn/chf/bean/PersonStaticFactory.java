package cn.chf.bean;
/**
 * ��̬����
 * @author j
 *
 */
public class PersonStaticFactory {

	public static Object getPerson() {
		System.out.println("��̬��������������");
		return new Person();
	}
}

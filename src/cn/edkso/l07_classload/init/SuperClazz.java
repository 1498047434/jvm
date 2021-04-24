package cn.edkso.l07_classload.init;

/**
 * @author 十下
 * 父类
 */
public class SuperClazz {
	static 	{
		System.out.println("SuperClass init！");
	}
	public static int value=123;
	public static final String HELLOWORLD="hello king";
	public static final int WHAT = value;
}

package com.factory.simplefactory;

/**
 * �򵥹�����
 * @author ��˼��
 *
 */
public class CarFactory2 {

	public static Car creatAudi(){
		return new Audi();
	}
	
	
	public static Car creatByd(){
		return new Byd();
	}
	

}

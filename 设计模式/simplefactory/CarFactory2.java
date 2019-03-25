package com.factory.simplefactory;

/**
 * 简单工厂类
 * @author 段思琦
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

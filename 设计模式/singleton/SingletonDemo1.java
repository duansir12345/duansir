package com.singleton;

/**
 * 测试饿汉式单例模式
 * @author 段思琦
 * 
 */

public class SingletonDemo1 {

	//由于加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();//类初始化时，立即加载这个对象（没有延时加载的优势）
	
	private SingletonDemo1(){      //构造方法
		
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance(){
		return instance;
	}
	
	
	
}

package com.singleton;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞）
 * @author 段思琦
 * 
 */

public class SingletonDemo5 {

	private static SingletonDemo5 instance;
	//类初始化时，不初始化这个对象，延时加载
	
	private SingletonDemo5(){      //私有化构造器
		
	}
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo5 getInstance(){
	    if(instance == null){
	    	instance = new SingletonDemo5();
	    }
		return instance;
	}
	
	
	
}

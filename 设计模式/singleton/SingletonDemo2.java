package com.singleton;

/**
 * 测试懒汉式单例模式
 * @author 段思琦
 * 
 */

public class SingletonDemo2 {

	private static SingletonDemo2 instance;
	//类初始化时，不初始化这个对象，延时加载
	
	private SingletonDemo2(){      //私有化构造器
		
	}
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance(){
	    if(instance == null){
	    	instance = new SingletonDemo2();
	    }
		return instance;
	}
	
	
	
}

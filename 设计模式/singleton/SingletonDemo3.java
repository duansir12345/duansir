package com.singleton;

/**
 * 测试静态内部类实现单例模式
 * @author 段思琦
 * 线程安全，调用效率高，实现了延时加载
 * 
 */

public class SingletonDemo3 {


	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	
	private SingletonDemo3(){      //构造方法
		
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo3 getInstance(){
		return SingletonClassInstance.instance;
	}
	
	
	
}

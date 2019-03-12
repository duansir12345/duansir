package com.singleton;


/**
 * 测试反射和反序列化破解
 * @author 段思琦
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception{
		SingletonDemo5 s1 = SingletonDemo5.getInstance();

		SingletonDemo5 s2 = SingletonDemo5.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        
        
	}
}

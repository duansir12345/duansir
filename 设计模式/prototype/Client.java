

package com.prototype;

import java.util.Date;

/**
 * 
 * 测试原型模式
 * @author 段思琦
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep("abc",new Date());
     	System.out.println(s1.getName());
     	Sheep s2 = (Sheep) s1.clone();
	    System.out.println(s2.getName());
	
	}
}

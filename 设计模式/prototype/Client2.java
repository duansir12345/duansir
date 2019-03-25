package com.prototype;

import java.util.Date;

/*
 * 
 * 原型模式 (深克隆)
 */
public class Client2 {

	public static void main(String[] args) throws Exception {

		Date date = new Date(123123123);
		Sheep2 s1 = new Sheep2("abc", date);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		date.setTime(324234234234234L);
		System.out.println(s1.getBirthday());
		Sheep2 s2 = (Sheep2) s1.clone();
		s2.setName("多利");
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());

	}
}

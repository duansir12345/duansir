package com.prototype;

import java.util.Date;

/**
 * 原型模式(浅克隆)
 * @author 段思琦
 *
 */


public class Sheep implements Cloneable{
    private String name;
    private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object obj = super.clone();//直接调用object对象的clone()方法
	
		
		return obj;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @param name
	 * @param birthday
	 */
	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	public Sheep(){
		
	}
}

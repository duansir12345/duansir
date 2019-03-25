package com.prototype;

import java.util.Date;

/**
 * 原型模式(深克隆)
 * @author 段思琦
 *
 */


public class Sheep2 implements Cloneable{
    private String name;
    private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object obj = super.clone();//直接调用object对象的clone()方法
	
		//添加如下代码，实现深复制
		Sheep2 s=(Sheep2) obj;
		s.birthday=(Date) this.birthday.clone();//把属性也进行克隆
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
	public Sheep2(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	public Sheep2(){
		
	}
}

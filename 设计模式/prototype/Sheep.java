package com.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ(ǳ��¡)
 * @author ��˼��
 *
 */


public class Sheep implements Cloneable{
    private String name;
    private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object obj = super.clone();//ֱ�ӵ���object�����clone()����
	
		
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

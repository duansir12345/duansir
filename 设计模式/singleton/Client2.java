package com.singleton;


/**
 * ���Է���ͷ����л��ƽ�
 * @author ��˼��
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

package com.singleton;

/**
 * ��������ʽ����ģʽ
 * @author ��˼��
 * 
 */

public class SingletonDemo2 {

	private static SingletonDemo2 instance;
	//���ʼ��ʱ������ʼ�����������ʱ����
	
	private SingletonDemo2(){      //˽�л�������
		
	}
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance(){
	    if(instance == null){
	    	instance = new SingletonDemo2();
	    }
		return instance;
	}
	
	
	
}

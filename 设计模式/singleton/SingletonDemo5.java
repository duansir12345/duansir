package com.singleton;

/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©����
 * @author ��˼��
 * 
 */

public class SingletonDemo5 {

	private static SingletonDemo5 instance;
	//���ʼ��ʱ������ʼ�����������ʱ����
	
	private SingletonDemo5(){      //˽�л�������
		
	}
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo5 getInstance(){
	    if(instance == null){
	    	instance = new SingletonDemo5();
	    }
		return instance;
	}
	
	
	
}

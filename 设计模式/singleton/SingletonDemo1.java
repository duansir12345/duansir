package com.singleton;

/**
 * ���Զ���ʽ����ģʽ
 * @author ��˼��
 * 
 */

public class SingletonDemo1 {

	//���ڼ�����ʱ����Ȼ�����̰߳�ȫ��
	private static SingletonDemo1 instance = new SingletonDemo1();//���ʼ��ʱ�����������������û����ʱ���ص����ƣ�
	
	private SingletonDemo1(){      //���췽��
		
	}
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance(){
		return instance;
	}
	
	
	
}

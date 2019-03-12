package com.singleton;

/**
 * ���Ծ�̬�ڲ���ʵ�ֵ���ģʽ
 * @author ��˼��
 * �̰߳�ȫ������Ч�ʸߣ�ʵ������ʱ����
 * 
 */

public class SingletonDemo3 {


	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	
	private SingletonDemo3(){      //���췽��
		
	}
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo3 getInstance(){
		return SingletonClassInstance.instance;
	}
	
	
	
}

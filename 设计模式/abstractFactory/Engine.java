package com.factory.abstractFactory;

public interface Engine {

	void run();
	void start();
	
}	
	class LuxuryEngine implements Engine{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�ܵĿ�");
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("�����ÿ�");
		}
		
	}
	
	
	class LowEngine implements Engine{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�ܵ���");
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("��������");
		}
		
	}
	


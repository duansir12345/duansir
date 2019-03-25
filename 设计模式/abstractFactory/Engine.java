package com.factory.abstractFactory;

public interface Engine {

	void run();
	void start();
	
}	
	class LuxuryEngine implements Engine{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("跑的快");
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("启动得快");
		}
		
	}
	
	
	class LowEngine implements Engine{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("跑得慢");
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("启动的慢");
		}
		
	}
	


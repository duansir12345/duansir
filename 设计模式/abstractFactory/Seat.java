package com.factory.abstractFactory;

public interface Seat {

	void message();
}

class LuxurySeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�߶����");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�պ�����");
	}
	
}
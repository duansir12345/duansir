package com.factory.abstractFactory;

public interface Seat {

	void message();
}

class LuxurySeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("高端舒服");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("凑合能用");
	}
	
}
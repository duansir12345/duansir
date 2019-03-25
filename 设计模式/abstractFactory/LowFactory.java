package com.factory.abstractFactory;

public class LowFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub

		return new LuxuryEngine();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LuxuryTyre();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LuxurySeat();
	}

	

}

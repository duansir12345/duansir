package com.factory.abstractFactory;

public interface Tyre {

	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("转的快");
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("转的慢");
	}
	
}

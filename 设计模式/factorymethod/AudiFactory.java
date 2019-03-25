package com.factory.factorymethod;

public class AudiFactory implements CarFactory{

	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}

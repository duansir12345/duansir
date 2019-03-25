package com.factory.factorymethod;

public class BydFactory implements CarFactory{

	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

}

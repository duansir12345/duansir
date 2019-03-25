package com.builder;

public class Client {

	
	public static void main(String[] args) {
		AirShipDirector director = new xxxAirShipDirector(new xxxAirShipBuilder());
	
		AirShip ship=director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
			ship.launch();
	}
	
}
	

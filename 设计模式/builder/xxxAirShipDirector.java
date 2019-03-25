package com.builder;

public class xxxAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	/**
	 * @param builder
	 */
	public xxxAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {

		Engine e = builder.builderEngine();
		OrbitalModule o = builder.buildOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();

		// װ��ɶ���
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);

		return ship;
	}

}

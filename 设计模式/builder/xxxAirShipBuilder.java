package com.builder;


/**
 * 
 * 构建者模式
 * @author 段思琦
 *
 */
public class xxxAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {

		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {

		System.out.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		
        System.out.println("构建逃逸塔");
		return new EscapeTower("逃逸塔");
	}

	
}

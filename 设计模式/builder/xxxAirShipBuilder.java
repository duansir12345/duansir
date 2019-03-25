package com.builder;


/**
 * 
 * ������ģʽ
 * @author ��˼��
 *
 */
public class xxxAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {

		System.out.println("����������");
		return new Engine("������");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {

		System.out.println("���������");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		
        System.out.println("����������");
		return new EscapeTower("������");
	}

	
}

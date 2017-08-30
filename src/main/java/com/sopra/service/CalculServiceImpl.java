package com.sopra.service;

import org.springframework.stereotype.Service;

@Service //cette classe sera vue 
//comme un composant Spring (id=calculServiceImpl)
public class CalculServiceImpl implements CalculService {

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double mult(double a, double b) {
		return a*b;
	}

}

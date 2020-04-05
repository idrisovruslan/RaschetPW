package ru.idrisov.RaschetPW;

public abstract class Flooring {
	Calculator calculator = new Calculator();
	InputOfValues input = new InputOfValues();
	double weight = 0;
	double width = 0;
	String weightString = null;
	String widthString = null;
	
	public abstract void calculation();
}

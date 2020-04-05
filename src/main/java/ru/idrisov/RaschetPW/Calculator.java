package ru.idrisov.RaschetPW;

public class Calculator {
	static final double METAL_DENSITY = 7.85;
//Перегруженный расчет
	public double calc(double weight, double width) {
		// metalDensity=this.metalDensity;
		return (weight / METAL_DENSITY / 1000 / 1000 * width);
	}
	
	public double calc(double weight) {
		// metalDensity=this.metalDensity;
		return (weight / METAL_DENSITY / 1000 / 1000 * 1000);
	}
}
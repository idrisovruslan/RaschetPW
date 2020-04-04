package ru.idrisov.RaschetPW;

public class Stupen extends Pokritie {

	@Override
	public void raschet() {
		while (true) {

			weightString = input.userInput("Введите вес(положительный, отличный от 0 int или double)");
			if (weightString == null) {
				System.out.println("Вы ввели неверные данные");
				break;
			}
			weight = Double.parseDouble(weightString);

			System.out.println("Площадь поперечного сечения настила весом " + weight + " = " + calculator.calc(weight));

			break;
		}
	}
}

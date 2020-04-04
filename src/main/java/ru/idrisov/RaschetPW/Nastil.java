package ru.idrisov.RaschetPW;

public class Nastil extends Pokritie {
	
	@Override
	public void raschet() {
		while (true) {

			weightString = input.userInput("Введите вес(положительный, отличный от 0 int или double)");
			if (weightString == null) {
				System.out.println("Вы ввели неверные данные");
				break;
			}
			weight = Double.parseDouble(weightString);
			
			widthString = input.userInput("Введите длинну(положительный, отличный от 0 int или double)");
			if (widthString == null) {
				System.out.println("Вы ввели неверные данные");
				break;
			}
			width = Double.parseDouble(widthString);

			System.out.println("Площадь поперечного сечения настила весом " + weight + " и длиной " + width + " = "
					+ calculator.calc(weight, width));
			
			break;
		}
	}
}

package ru.idrisov.RaschetPW;

public class Main {

	public static void main(String args[]) {

		while (true) {
			Input input = new Input();
			String userInput = input.userInput("Введите что вас интересует. Введите help для вызова справки");
			switch (userInput) {

//Расчитываем настил
			case ("nastil"):
				new Grating().calculation();
				break;

//Расчитываем ступень
			case ("stupen"):
				new Stage().calculation();
				break;

//Справка
			case ("help"):
				System.out.println("nastil- программа расчета площади поперечного сечения настила\n"
						+ "stupen- программа расчета площади поперечного сечения ступени\n"
						+ "exit- выход из программы");
				break;
//Завершаем программу
			case ("exit"):
				System.out.println("Программа окончена");
				System.exit(0);

			default:
				System.out.println("Вы ввели неправильное значение");
				break;
			}
		}
	}
}
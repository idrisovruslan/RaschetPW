package ru.idrisov.RaschetPW;

public class Stupen extends Pokritie {

	@Override
	public void raschet() {
		while (true) {

			weightString = input.userInput("������� ���(�������������, �������� �� 0 int ��� double)");
			if (weightString == null) {
				System.out.println("�� ����� �������� ������");
				break;
			}
			weight = Double.parseDouble(weightString);

			System.out.println("������� ����������� ������� ������� ����� " + weight + " = " + calculator.calc(weight));

			break;
		}
	}
}

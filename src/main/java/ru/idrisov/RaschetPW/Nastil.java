package ru.idrisov.RaschetPW;

public class Nastil extends Pokritie {
	
	@Override
	public void raschet() {
		while (true) {

			weightString = input.userInput("������� ���(�������������, �������� �� 0 int ��� double)");
			if (weightString == null) {
				System.out.println("�� ����� �������� ������");
				break;
			}
			weight = Double.parseDouble(weightString);
			
			widthString = input.userInput("������� ������(�������������, �������� �� 0 int ��� double)");
			if (widthString == null) {
				System.out.println("�� ����� �������� ������");
				break;
			}
			width = Double.parseDouble(widthString);

			System.out.println("������� ����������� ������� ������� ����� " + weight + " � ������ " + width + " = "
					+ calculator.calc(weight, width));
			
			break;
		}
	}
}

package ru.idrisov.RaschetPW;

public class Main {

	public static void main(String args[]) {

		while (true) {
			Input input = new Input();
			String userInput = input.userInput("������� ��� ��� ����������. ������� help ��� ������ �������");
			switch (userInput) {

//����������� ������
			case ("nastil"):
				new Nastil().raschet();
				break;

//����������� �������
			case ("stupen"):
				new Stupen().raschet();
				break;

//�������
			case ("help"):
				System.out.println("nastil- ��������� ������� ������� ����������� ������� �������\n"
						+ "stupen- ��������� ������� ������� ����������� ������� �������\n"
						+ "exit- ����� �� ���������");
				break;
//��������� ���������
			case ("exit"):
				System.out.println("��������� ��������");
				System.exit(0);

			default:
				System.out.println("�� ����� ������������ ��������");
				break;
			}
		}
	}
}
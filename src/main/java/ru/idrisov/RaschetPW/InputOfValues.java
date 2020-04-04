package ru.idrisov.RaschetPW;

public class InputOfValues extends Input {
	
	@Override
	public String userInput(String massage) {
		
		double value = 0;
//��������� ���������������� ����
		String valueString = super.userInput(massage);
//��������� ������������ �����	
		try {
			value = Double.parseDouble(valueString);
			if (value<=0) throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.err.println("�������� ������ ������!");
			valueString = null;
		}
		return valueString;
	}
}

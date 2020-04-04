package ru.idrisov.RaschetPW;

public class InputOfValues extends Input {
	
	@Override
	public String userInput(String massage) {
		
		double value = 0;
//Считываем пользовательский ввод
		String valueString = super.userInput(massage);
//Проверяем правильность ввода	
		try {
			value = Double.parseDouble(valueString);
			if (value<=0) throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.err.println("Неверный формат строки!");
			valueString = null;
		}
		return valueString;
	}
}

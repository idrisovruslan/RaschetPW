package ru.idrisov.RaschetPW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	
	public String userInput(String massage) {
		
		String valueString = null;
//—читываем пользовательский ввод
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(massage);
			valueString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return valueString;
	}
}
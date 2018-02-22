package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {

	}

	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Map<Integer, Integer> map = new HashMap<>();

		Random ran = new Random();
		
		int occur;
		int value;

		for (int i = 0; i <= amount; i++) {
			value = ran.nextInt(interval);

		}

		return map;
		
		//stwórz listę z wylosowanymi liczbami
		// w pętli for z if sprawdź ile razy wystąpi liczba
		//dodaj do mapy liczbę jako klucz i liczbę wystąpień jako wartość

	}

}

// W projekcie utwórz pakiet pl.coderslab.collection, w pakiecie utwórz klasę
// GenerateRandom zawierającą metodę o sygnaturze: public static Map<Integer,
// Integer> checkRand(int amount, int interval), metoda ta ma zwracać mapę
// wystąpień wartości losowych generowanych za pomocą klasy Random.
//
// Kluczem mapy ma być losowana liczba, wartością ilość jej wystąpień.
//
// Parametry:
//
// amount - oznaczają ilość losowań jaka ma być wykonana.
// interval - zakres wartości dla metody klasy nextInt klasy Random.
//
// Przykładowy wynik wyświetlenia elementów mapy dla wywołania metody z
// parametrami amount = 500000 oraz interval = 10:
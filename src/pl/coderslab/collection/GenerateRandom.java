package pl.coderslab.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		Map<Integer, Integer> maps = checkRand(2, 4);

		for (Integer key : maps.keySet()) {
			for (Integer value : maps.values()) {
				System.out.println(key + " : " + value);
			}
		}

	}

	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Map<Integer, Integer> map = new HashMap<>();

		Random ran = new Random();
		List<Integer> lista = new ArrayList<>();
		int occur;
		int val = 0;

		for (int i = 0; i < amount; i++) {
			for (int a = 0; a < interval; a++) {
				val = ran.nextInt(interval);
				lista.add(val);
			}

		}
		System.out.println(lista.toString());

		for (Integer occ : lista) {

			occur = Collections.frequency(lista, occ);
			map.put(occ, occur);
			System.out.println(map.toString());
			return map;

		}

		return map;

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
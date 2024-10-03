package functional_programing_in_java;

import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {

		List<Integer> listOfNumbers = List.of(25, 12, 89, 31, 5, 6, 78);
		//printAllListNumberStructured(listOfNumbers);
		printAllEvenNumberFromListStructured(listOfNumbers);
	}

	private static void printAllEvenNumberFromListStructured(List<Integer> listOfNumbers) {
		for (Integer number : listOfNumbers) {
			if (number % 2 == 0) {
				System.out.println("The numbers is " + number);
			}
		}
	}

	private static void printAllListNumberStructured(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println("The numbers is " + number);
		}

	}
}

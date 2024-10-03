package functional_programing_in_java;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {

		List<Integer> listOfNumbers = List.of(25,12,89,31,5,6,78);
		//printAllListNumberFunctional(listOfNumbers);
		//printAllEvenNumberFromListFunctional(listOfNumbers);
		printSquareEvenNumberFromListFunctional(listOfNumbers);
	}

	
	private static void printSquareEvenNumberFromListFunctional(List<Integer> listOfNumbers) {
		
		listOfNumbers.stream()
		 .filter(data-> data %2 ==0)
		 .map(number -> number * number)
		.forEach(System.out::println);
	}


	private static void printAllEvenNumberFromListFunctional(List<Integer> listOfNumbers) {
		
		listOfNumbers.stream().filter(data-> data %2 ==0)
		.forEach(System.out::println);
		
	}


//	public  static void print(int number) {
//		System.out.println(number);
//	}
//	

	private static  void printAllListNumberFunctional(List<Integer> numbers) {
		
		numbers.stream().forEach(System.out ::println);
	}
}

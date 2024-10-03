package functional_programing_in_java;

import java.util.List;

public class FP01FunctionalExcercise {
	public static void main(String[] args) {

		List<Integer> listOfNumbers = List.of(25, 12, 89, 31, 5, 6, 78);
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		printNumberOfCharactersInEachCourse(courses);
		//printAllCoursesContainsAtleast4Character(courses);
		//printAllCoursesContainingSpring(courses);
		//printAllCoursesIndividually(courses);
		//printAllOddNumberFromLisFunctional(listOfNumbers);
		//printCubeOfOddNumberFromListFunctional(listOfNumbers);
	}

	
	private static void printNumberOfCharactersInEachCourse(List<String> courses) {
		
		courses.stream()
		.map(course-> course +" "+ course.length())
		.forEach(System.out::println);
	}


	private static void printCubeOfOddNumberFromListFunctional(List<Integer> listOfNumbers) {
		listOfNumbers.stream()
		 .filter(data-> data %2 !=0)
		 .map(number -> number * number *number)
		.forEach(System.out::println);
		
	}



	private static void printAllCoursesContainsAtleast4Character(List<String> courses) {
		
		courses.stream().filter( data-> data.length() >=4 ).forEach(System.out::println);
	}

	private static void printAllCoursesContainingSpring(List<String> courses) {
		
		courses.stream().filter( data-> data.contains("Spring")).forEach(System.out::println);
		
	}

	private static void printAllCoursesIndividually(List<String> courses) {
		
		courses.stream().forEach(System.out::println);
		
	}

	private static void printAllOddNumberFromLisFunctional(List<Integer> listOfNumbers) {

		listOfNumbers.stream().filter(data -> data % 2 != 0).forEach(System.out::println);

	}

}

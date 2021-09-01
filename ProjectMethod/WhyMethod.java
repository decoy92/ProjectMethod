
public class WhyMethod {

	public static void main(String[] args) {
		
		// ... 수많은 코드 ...
		             //인자(argument)
		printTwoTimes("a", "-");
		// ... 수많은 코드 ...
		printTwoTimes("a", "*");
		// ... 수많은 코드 ...
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		
	}
									//매개변수(parameter)
	public static void printTwoTimes(String text, String delimiter) {

		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
		
}
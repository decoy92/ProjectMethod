
public class WhyMethod {

	public static void main(String[] args) {
		
		// ... ������ �ڵ� ...
		             //����(argument)
		printTwoTimes("a", "-");
		// ... ������ �ڵ� ...
		printTwoTimes("a", "*");
		// ... ������ �ڵ� ...
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		
	}
									//�Ű�����(parameter)
	public static void printTwoTimes(String text, String delimiter) {

		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
		
}
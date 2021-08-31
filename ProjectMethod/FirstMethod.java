
public class FirstMethod {
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("a");
		System.out.println("a");
	}

	public static void main(String[] args) {
		
		// ... 수많은 코드 ...
		printTwoTimesA();
		// ... 수많은 코드 ...
		printTwoTimesA();
		// ... 수많은 코드 ...
		printTwoTimesA();
		
		// '두 번의 A를 프린트한다' 라는 내용을 한눈에 파악하기 쉽다.
		// 한줄짜리 코드도 그 코드의 의미를 명확하게 하기 위해서 메소드를 만드는 것은 좋은 습관이다.
		
	}

}
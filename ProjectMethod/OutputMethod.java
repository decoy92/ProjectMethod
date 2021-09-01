
public class OutputMethod {
	
	public static String a() {
		// ...
		return "a";
	}
	
	public static int one() {
		return 1; // 메소드 종료
		// ...
	}

	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
	}

}
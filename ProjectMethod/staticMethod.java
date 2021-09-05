class Print {
	public String delimiter;
	public static void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public static void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
}
public class staticMethod {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		// instance
		Print t1 = new Print(); // new : 복제- / 데이터타입이 Print인 t1이라는 변수에 담다. t1 = Print 라는 클래스의 분신(instance)
		t1.delimiter = "-";
		t1.a();
		t1.b();
		
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t1.delimiter = "-"
		t1.a();
		t1.b();
		
		}


}
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
		Print t1 = new Print(); // new : ����- / ������Ÿ���� Print�� t1�̶�� ������ ���. t1 = Print ��� Ŭ������ �н�(instance)
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
public class AccountingApp {
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	public static void main(String[] args) {
		//���ް���
		double valueOfSupply = 10000.0;
		
		//�ΰ���ġ����
		double vatRate = 0.1;
		//�ΰ���
		double vat = valueOfSupply * vatRate;
		// double vat = getVAT();
		//�հ�
		double total = valueOfSupply + vat;

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		
	}

}
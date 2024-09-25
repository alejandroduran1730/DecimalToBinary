public class DecimalToBinary {

	public static void main(String[] args) {
		int decimalNumber = 10; // Number to be converted
		String binaryNumber = "";
		int remainder;
		
		while(decimalNumber != 0) {
			remainder = decimalNumber % 2 ;
			binaryNumber = remainder + binaryNumber;
			decimalNumber /= 2;
		}
		
		System.out.println(binaryNumber);
	}
}
public class Ex_10_3 {

    public static void main(String[] args) {
	MyInteger myInteger;
	myInteger = new MyInteger();
		System.out.println(myInteger.isEven(52));
		System.out.println(myInteger.isOdd(33));
		System.out.println(myInteger.isPrime(8));
		char[] chars = {'2','3','4'};
		System.out.println(myInteger.parseInt(chars));
		String string = "1234567";
		System.out.println(myInteger.parseInt(string));
    }
}

package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int newValue) {
		
		iValue = newValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue);
	}

	public boolean isPrime() {
		return isPrime(iValue);
	}

	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}

	public static boolean isOdd(int num) {
		return (num % 2 != 0);
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger num) {
		return num.isEven();
	}
	
	public static boolean isOdd(MyInteger num) {
		return num.isOdd();
	}
	
	public static boolean isPrime(MyInteger num) {
		return num.isPrime();
	}
	
	public boolean equals(int num){
		return(iValue==num);
	}
	
	public boolean equals(MyInteger num) {
		return equals(num.getiValue());
	}
}

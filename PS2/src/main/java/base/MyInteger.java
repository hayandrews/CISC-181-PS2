package base;


public class MyInteger {
	private int iValue;

	public MyInteger(int val) {
		this.iValue = val;
	}

	public int getiValue() {
		return this.iValue;
	}

	public boolean isEven() {

		if (this.iValue % 2 == 0) {
			return true;
		} else
			return false;
	}

	public boolean isOdd() {

		if (this.iValue % 2 != 0) {
			return true;
		} else
			return false;
	}

	public boolean isPrime() {
		if (this.iValue <= 1) {
			return false;
		}
		for (int n = 2; n < this.iValue; n++) {
			if (this.iValue % n == 0)
				return false;
		}
		return true;

	}

	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int x) {

		if (x % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		for (int n = 2; n < x; n++) {
			if (x % n == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {

		if (value.getiValue() % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(MyInteger value) {

		if (value.getiValue() % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(MyInteger value) {
		if (value.getiValue() <= 1) {
			return false;
		}
		for (int n = 2; n < value.getiValue(); n++) {
			if (value.getiValue() % n == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int x) {
		if (this.iValue == x) {
			return true;
		} else
			return false;
	}

	public boolean equals(MyInteger value) {
		if (this.iValue == value.getiValue()) {
			return true;
		} else
			return false;
	}

}

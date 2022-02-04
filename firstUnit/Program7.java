class Program7 {

	public static void main(String[] args) {
		Armstrong a1 = new Armstrong(153);
		Armstrong a2 = new Armstrong(123);
		System.out.println("is 153 armstrong : " + a1.isArmstrong());
		System.out.println("is 123 armstrong : " + a2.isArmstrong());
	}

}

class Armstrong {
	int number;

	Armstrong(int number) {
		this.number = number;
	}

	public int digits() {
		int count = 0;
		int n = number;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public boolean isArmstrong() {
		int nDigits = digits();
		int n = number;
		int sum = 0;
		while (n != 0) {
			sum += (int) Math.pow(n % 10, nDigits);
			n /= 10;
		}
		return sum == number;
	}
}
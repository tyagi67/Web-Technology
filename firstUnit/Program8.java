class Program8{
	
	public static void main(String args[]){
		PermutationAndCombination obj1 = new PermutationAndCombination(3,2);
		PermutationAndCombination obj2 = new PermutationAndCombination(5,2);
		obj1.ans();
		obj2.ans();
	}
}

class PermutationAndCombination{
	int n;
	int r;
	
	PermutationAndCombination(int n, int r){
		this.n = n;
		this.r = r;
	}
	
	public int fact(int n){
		return (n==0? 1 : n*fact(n-1));
	}
	
	public void ans(){
		int npr = fact(n)/fact(n-r);
		System.out.println("Permutation and Combination "+ n + "," + r + ": " + npr + " " +npr/fact(r));
	}	
}
	
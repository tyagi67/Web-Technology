class Program13{
	public static void main(String[] args){
		Account a1,a2;
		a1 = new Account("a1", "anant");
		a2 = new Account("c1", "abhi", 10000);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.credit(5000));
		System.out.println(a1);
		System.out.println(a1.debit(3000));
		System.out.println(a1);
		System.out.println(a2.transferTo(a1, 3000));
		System.out.println(a1);
		System.out.println(a2);
	}
}

class Account{
	String id;
	String name;
	int balance;
	
	Account(String id, String name){
		this.id = id;
		this.name = name;
		balance = 0;
	}
	
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	String getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	
	int getBalance(){
		return balance;
	}
	
	int credit(int amount){
		balance += amount;
		return balance;
	}
	
	int debit(int amount){
		if(amount <= balance){
			balance -= amount;
		}else{
			System.out.println("Amount Exceeded Balance");
		}
		return balance;
	}
	
	int transferTo(Account another, int amount){
		if(amount <= this.balance){
			another.balance += amount;
			balance -= amount;
		}else{
			System.out.println("Amount Exceeded Balance");
		}
		return balance;
	}
	
	public String toString(){
		return "Account[id = " + id + ", name = " + name + ", balance = " + balance + "]";
	}
	
}
			
		
	
	

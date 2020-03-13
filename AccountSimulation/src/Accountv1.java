import java.time.LocalDate;





public class Accountv1 {
	private int id ;
	private double balance = 0.0 ;
	private double annualInterestRate = 0.0 ;
	private LocalDate dateCreated ; 
	private int choice = 0 ; 
	
	//Constructor 
	public Accountv1() {
		dateCreated = LocalDate.now() ; 
	}
	
	public Accountv1(int id, double balance) {
		dateCreated = LocalDate.now() ; 
		this.id = id ; 
		this.balance = balance ; 
	}
	
	public int accesorid() {
		return id ; 
	}
	
	public double accesorbalance() {
		return balance ; 
	}
	
	public double accessorannual() {
		return annualInterestRate ; 
	}
	public LocalDate accessorDateCreated() {
		return this.dateCreated ; 
	}
	
	public void mutatorid(int id) {
		this.id = id ;
	}
	
	public void mutatorbalance(double balance) {
		this.balance = balance ;
	}
	public void mutatorannual(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate  ;
	}
	
	public double getMonthlyInterestRate() { 
		return (annualInterestRate / 100) /12 ; 
	}
	
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate()) ; 
	}
	
	public void withdraw(double amount) {
		balance -= amount ; 
	}
	
	public void deposit(double amount) {
		balance += amount ; 		
	}
	
	//public void 
	
	public void display() {
		System.out.println("Main Menu: ") ; 
		System.out.println("1:Check balance ") ;
		System.out.println("2:Withdraw ") ; 
		System.out.println("3 Deposit ") ; 
		System.out.println("4 Exit ") ; 
		System.out.println("Enter a choice : ") ;
	}
	
	
	public void choice(int choice) {
		this.choice = choice ; 
		switch(this.choice) {
		case 1: System.out.println("Balance is: ") ; 
		break;
		case 2: System.out.println("Enter an amount to withdraw: ") ;
		break; 
		case 3: System.out.println("Enter an amount to deposit: ") ; 
		break; 
		case 4: System.out.println("Exit") ; 
		break; 
	}
	}
	
	
}
	

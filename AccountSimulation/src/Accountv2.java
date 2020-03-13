import java.util.Scanner ; 

public class Accountv2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ; 
		
		
		
		int i = 0 ; 
		Accountv1[] accounts = new Accountv1[10] ;  	
		for (i = 0 ; i < 10; i++) {
			accounts[i] = new Accountv1(i, 100.0) ;
		}
 		Accountv1 account = new Accountv1(i, 100.0) ;
		
		int ongov2 = 0 ; 
		int ongo = 1 ; 
		
		while (ongo ==1) {
			if (ongo != -12) {
				ongov2 = 1 ;
			}
		System.out.println("Enter ID: ") ;
		int id = input.nextInt() ;
		while (id < 0 || id > 10) {
			System.out.println("Invalid ID Try Again: ") ; 
			id = input.nextInt() ;
			} 
		
		while (ongov2 != 4) {
			account.display(); 
			ongov2 = input.nextInt() ;
		if (ongov2 == 1) {
			System.out.println("The balance is: " + account.accesorbalance()) ;
		}
		if (ongov2 == 2) {
			double withdraw ;
			System.out.println("Enter amount to withdraw: ") ; 
			withdraw = input.nextDouble() ;
			account.withdraw(withdraw);
		}
		if (ongov2 == 3) {
			double deposit ; 
			System.out.println("Enter amount to deposit: ") ; 
			deposit = input.nextDouble() ; 
			account.deposit(deposit);	
		}
	}
		}
		}
}


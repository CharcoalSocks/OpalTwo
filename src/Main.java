package examPrep;

import java.util.ArrayList;

//create a transport system similar to opal
public class Main {
	private ArrayList <Account> users = new ArrayList<Account>(); 
	
	//pre: assumes valid input and positive transaction for initial balance
	public void newUser(ArrayList<Account> list, String name, int transaction) {
		if (transaction >= 0) {
			Account user = new Account();
			//populate obj
			//add to array
			list.add(user);
		} else {
			//example of defensive programming
			System.out.println("Invalid starting balance.");
		}
	}
	
	//with name of user account, search thru array to get user
	public Account findAccount(ArrayList<Account> List, String id) {
		Account account;
		for (Account account2 : List) {
			//if (id = List.account2.getID()) {
				//return account;
			//}
		}
		return null;
	}
	
	//negative balance invalid and rejected
	//weekly and daily limits -> $50, $20
	public void charge(String id, int transaction) {
		findAccount(users, id);
		System.out.println();
	}
}

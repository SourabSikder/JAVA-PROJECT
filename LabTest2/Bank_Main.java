package LabTest2;

public class Bank_Main {

	public static void main(String[] args) {
		//create a instance of BankA,BankB and BankC.
	Bank bA=new BankA();
	Bank bB=new BankB();
	Bank bC=new BankC();
	System.out.println("BankA Balance:"+bA.getBalance());
	System.out.println("BankB Balance:"+bB.getBalance());
	System.out.println("BankC Balance:"+bC.getBalance());	
	}

}

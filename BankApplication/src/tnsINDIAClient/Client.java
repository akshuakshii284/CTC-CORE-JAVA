package tnsINDIAClient;

import tnsIndiafoundationApplication.MMBankFactory;
import tnsIndiafoundationApplication.MMCurrentAcc;
import tnsIndiafoundationApplication.MMSavingAcc;
import tnsIndiafoundationFramework.BankFactory;
import tnsIndiafoundationFramework.CurrentAcc;
import tnsIndiafoundationFramework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123456,"rani",50000);
		sa.withdraw(45000);
		CurrentAcc ca=new MMCurrentAcc(45678,"rammu",5000);
		ca.withdraw(2000);

	}

}

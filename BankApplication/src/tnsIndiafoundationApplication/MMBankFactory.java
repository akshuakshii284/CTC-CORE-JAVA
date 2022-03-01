package tnsIndiafoundationApplication;

import tnsIndiafoundationFramework.BankFactory;
import tnsIndiafoundationFramework.CurrentAcc;
import tnsIndiafoundationFramework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal) {
		SavingAcc sa=new SavingAcc(accNo,accNm,accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal) {
		CurrentAcc ca=new CurrentAcc(accNo,accNm,accBal);
		return ca;
	}

	
}
	



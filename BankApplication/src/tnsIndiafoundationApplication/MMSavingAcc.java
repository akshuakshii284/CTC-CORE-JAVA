package tnsIndiafoundationApplication;

import tnsIndiafoundationFramework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo,accNm,accBal);
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("the total  amount after reciving salary is "+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [ isSalried()="+isSalaried()+"=toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() +  "]";
	}

	

	
	

}

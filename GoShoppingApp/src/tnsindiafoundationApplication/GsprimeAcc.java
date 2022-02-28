package tnsindiafoundationApplication;

import tnsindiafoundationFramework.PrimeAcc;

public class GsprimeAcc extends PrimeAcc {

	public GsprimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void bookProduct(float charges) {
		System.out.println("you have purchased the product :"+charges);
	}

	@Override
	public String toString() {
		return "GsprimeAcc [toString()=" + super.toString() + ", getAccNO()=" + getAccNO() + ", getAccName()="
				+ getAccName() + ", getCharges()=" + getCharges() + "]";
	
	}
}

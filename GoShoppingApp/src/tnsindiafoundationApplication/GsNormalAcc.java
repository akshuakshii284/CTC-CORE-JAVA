package tnsindiafoundationApplication;

import tnsindiafoundationFramework.NormalAcc;

public class GsNormalAcc extends NormalAcc {

	public GsNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("you have purchased the product charges"+charges+" with deliverycharges "+deliverycharges);
	}

}

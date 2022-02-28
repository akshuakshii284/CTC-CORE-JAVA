package tnsindiafoundationApplication;

import tnsindiafoundationFramework.NormalAcc;
import tnsindiafoundationFramework.PrimeAcc;
import tnsindiafoundationFramework.ShopFactory;

public class GsShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accno,String accname,float charges)
	{
		PrimeAcc pa=new PrimeAcc(accno,accname,charges);
		return pa;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accno,String accname,float charges) {
		NormalAcc na=new NormalAcc(accno,accname,charges);
		return na;
	}
	

	

	}



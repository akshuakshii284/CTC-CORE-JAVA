package tnsindiafoundationFramework;

public class PrimeAcc extends ShopAcc {
private static boolean isprime=true;
public PrimeAcc(int accno,String accname,float charges)
{
	super(accno,accname,charges);
}
public static boolean isIsprime() {
	return isprime;
}

public static void setIsprime(boolean isprime) {
	PrimeAcc.isprime = isprime;
}

@Override
public String toString() {
	return "PrimeAcc [isprime=" + isprime+ ", getAccNO()=" + getAccNO() + ", getAccName()=" + getAccName()
			+ ", getCharges()=" + getCharges() +"]";
}




}

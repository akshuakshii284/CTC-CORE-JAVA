package tnsindiafoundationFramework;

public interface ShopFactory {
 
   public NormalAcc getNewNormalAccount(int accno, String accname, float charges);
 public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges);
}

package tnsindiafoundationFramework;

public class ShopAcc {
	private int accNO;
	private String accName;
	float charges;
	
	public ShopAcc(int accNO, String accName, float charges) { //lazy installisation :when we require we intialize at that time//
		this.accNO = accNO;
		this.accName = accName;
		this.charges = charges;
	}

		
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("the total charge of product is "+charges);
	}
public void items(float charges)
{
	System.out.println("the charges of items purchased is"+charges);
}
@Override
public String toString() {
	return "ShopAcc [accNO=" + accNO + ", accName=" + accName + ", charges=" + charges + "]";
}

}

package tnsif;

import tnsindiafoundationApplication.GsNormalAcc;
import tnsindiafoundationApplication.GsShopFactory;
import tnsindiafoundationApplication.GsprimeAcc;
import tnsindiafoundationFramework.NormalAcc;
import tnsindiafoundationFramework.PrimeAcc;
import tnsindiafoundationFramework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf=new GsShopFactory();
PrimeAcc pa=new GsprimeAcc(123,"akshuu",500);
pa.bookProduct(600);
NormalAcc na=new GsNormalAcc(99,"akshatha",1000);
na.bookProduct(500);
	}

}

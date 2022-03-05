package tnsINDIAClient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tnsIndiafoundationApplication.MMCurrentAcc;
import tnsIndiafoundationApplication.MMSavingAcc;
import tnsIndiafoundationFramework.CurrentAcc;
import tnsIndiafoundationFramework.SavingAcc;

class ClientTest {

	@Test
	void test() {
		ClientTest ct=new ClientTest();
		SavingAcc sa=new MMSavingAcc(123456,"rani",50000);
		sa.withdraw(45000);
		sa.deposite(4000);
		CurrentAcc ca=new MMCurrentAcc(45678,"rammu",5000);
		ca.withdraw(2000);
         ca.deposite(200);
	}

}

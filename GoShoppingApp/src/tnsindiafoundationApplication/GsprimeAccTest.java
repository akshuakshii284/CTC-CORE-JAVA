package tnsindiafoundationApplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GsprimeAccTest {
	
	GsprimeAcc pa;

	@BeforeEach
	void setup()
	{
		pa=new mock(Gsprime.class);
	}

}

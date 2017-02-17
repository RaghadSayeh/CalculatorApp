import static org.junit.Assert.*;

import org.junit.Test;

public class TestMul {

	@Test
	public void TestMul() {
	CalcModel c= new CalcModel();
	c.mulTwoNO(5,6);
	int r=c.getRes();
	assertTrue(r==30);
	
	}

}

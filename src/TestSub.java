import static org.junit.Assert.*;

import org.junit.Test;

public class TestSub {

	@Test
	public void TestSub() {
		CalcModel m=new CalcModel();
		m.subTwoNO(66,7);
		int r=m.getRes();
		assertTrue(r==59);
	}

}

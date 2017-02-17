import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiv {

	@Test
	public void TestDiv() {
		CalcModel m=new CalcModel();
		m.divTwoNO(24, 2);
		int d=m.getRes();
		assertTrue(d==12);
		
		
	}

}

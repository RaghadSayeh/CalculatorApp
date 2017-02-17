import static org.junit.Assert.*;

import org.junit.Test;

public class TestMod {

	@Test
	public void test() {
		CalcModel m=new CalcModel();
		m.modTwoNO(23,2);
		int r=m.getRes();
		assertTrue(r==1);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void Calctest() {
		CalcModel m=new CalcModel();
		m.addTwoNO(3, 4);
		int R=m.getRes();
		assertTrue(R==7);
		
	}


}

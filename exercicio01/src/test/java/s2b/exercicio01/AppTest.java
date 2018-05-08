package s2b.exercicio01;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)
public class AppTest {

	int a,b,r;
	@Test
	@Parameters({"20,30,50","20,20,40"
	})

	public void testSomar(int a,int b , int r) throws Exception {
		
		assertEquals(App.somar(a, b),r);
		
	}


}

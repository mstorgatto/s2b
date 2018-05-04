package s2b.exercicio;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AppTestParam2 {


	@Test
	@FileParameters("./lista.csv")
	public void testSomar(int a,int b,int r) {
		assertEquals(App.somar(a, b),r);
	}
		
		
	}
	
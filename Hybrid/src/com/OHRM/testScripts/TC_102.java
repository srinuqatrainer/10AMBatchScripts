package com.OHRM.testScripts;

import org.testng.annotations.Test;

import com.OHRM.lib.General;

public class TC_102
{
	@Test
	public void testRun2() throws InterruptedException
	{
		General g = new General();
		g.setUp();
		g.logIn();
		g.verifyLogIn();
		g.pim();
		g.addEmployee();
		g.tearDown();
		
	}
}

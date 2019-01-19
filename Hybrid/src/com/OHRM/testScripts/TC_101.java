package com.OHRM.testScripts;

import org.testng.annotations.Test;

import com.OHRM.lib.General;

public class TC_101
{

	@Test
	public void testRun() throws InterruptedException
	{
		General g = new General();
		g.setUp();
		g.logIn();
		g.verifyLogIn();
		g.tearDown();
	}
}

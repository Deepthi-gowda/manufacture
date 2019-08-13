package Script;

import generic.Generic_Test;

import org.testng.annotations.Test;

import pom.Loginpage;



public class Script1 extends Generic_Test{

@Test
public void loginpage() throws InterruptedException
{
	 Loginpage l1 = new  Loginpage(driver);
	 l1.logintb();
	 l1.loginpw();
	
	
	}

	}


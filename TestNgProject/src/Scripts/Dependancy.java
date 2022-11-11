package Scripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Dependancy 
{
	@Test()
	public void Signup()
	{
		System.out.println("Iam signup");
	}
	@Test(dependsOnMethods = "Signup")
	
	public void Login()
	{
	
	Assert.fail();
		System.out.println("Iam login");
	}

	@Test(dependsOnMethods = {"Signup","Login"})
	public void cart()
	{
		System.out.println("Iam cart");
	}

	@Test(dependsOnMethods = {"Signup","Login"})
	public void Logout()
	{
		System.out.println("Iam logout");
	}
}

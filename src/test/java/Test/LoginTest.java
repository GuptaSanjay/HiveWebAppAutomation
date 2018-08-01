package Test;


import Page.LoginPage;



public class LoginTest {


	LoginPage loginPage=new LoginPage();




	public void LoginToHive(){
System.out.println("insideLoginToHive");
		loginPage.loginToHive("rudb1","Hive1234");
	}


	public void userLoggedIn()
	{
		System.out.print("Success");
	}
	public boolean checkLoginPage()
	{

		String title=loginPage.getLoginTitle();
		if(title.equals("Enter your login details"))
		{
			return true;
		}
		else
		{
			return false;
		}

	}


}
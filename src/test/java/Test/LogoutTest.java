package Test;


import Page.LogoutPage;


public class LogoutTest {

    LogoutPage logoutPage=new LogoutPage();


    public void checkAlreadyLoggedIn() {
        System.out.println("inside Test");
        logoutPage.checkAlreadyLoggedIn();
    }

    public void clickLogoutButton() {


        logoutPage.clickLogoutButton();
    }
//logged out successfully
    public void loggedoutSuccessfully() {
System.out.println("Successfully");
        logoutPage.loggedoutSuccessfully();
    }
}

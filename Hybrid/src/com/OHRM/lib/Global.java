package com.OHRM.lib;

import org.openqa.selenium.WebDriver;

public class Global
{
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	public String userName="admin";
	public String password="password";
	
	public String firstName="Ram";
	public String lastName="Hello";
	public String middleName="hi";
	
	public String text_UserName="txtUsername";
	public String text_Password="txtPassword";
	public String text_SubmitButton="Submit";
	
	public String text_PIM="menu_pim_viewPimModule";
	public String text_AddEmployee="menu_pim_addEmployee";
	public String text_FirstName="firstName";
	public String text_LastName="lastName";
	public String text_MiddleName="middleName";
	public String text_EmpId="employeeId";
	public String text_SaveButton="btnSave";
	
	public String text_welcomeMessage="welcome";
	public String text_logOut="Logout";
	
	public String text_deleteButton="btnDelete";
	
	
	
}

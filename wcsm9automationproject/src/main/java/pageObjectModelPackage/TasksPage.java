package pageObjectModelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
		@FindBy(partialLinkText = "Projects & Customers")
		private WebElement Projects_Customers_Sub_Module;
		@FindBy(xpath = "//input[@value='Create New Customer']")
		private WebElement Create_New_Customer;
		@FindBy(xpath = "//input[@value='Create New Project']")
		private WebElement Create_New_Project;
		
		@FindBy(name = "name")
		private WebElement Customer_nameTB;
		@FindBy(name = "createCustomerSubmit")
		private WebElement Create_Customer_Button;
		
		@FindBy(name = "customerId")
		private WebElement customer_name_Dropdown;
		@FindBy(name = "name")
		private WebElement Project_nameTB;
		@FindBy(name = "createProjectSubmit")
		private WebElement Create_Project_Button;
		public WebElement getProjects_Customers_Sub_Module() {
			return Projects_Customers_Sub_Module;
		}
		public WebElement getCreate_New_Customer() {
			return Create_New_Customer;
		}
		public WebElement getCreate_New_Project() {
			return Create_New_Project;
		}
		public WebElement getCustomer_nameTB() {
			return Customer_nameTB;
		}
		public WebElement getCreate_Customer_Button() {
			return Create_Customer_Button;
		}
		public WebElement getCustomer_name_Dropdown() {
			return customer_name_Dropdown;
		}
		public WebElement getProject_nameTB() {
			return Project_nameTB;
		}
		public WebElement getCreate_Project_Button() {
			return Create_Project_Button;
		}
		public void CreateCustomer_CreateProject_method(String cust_name,String pro_name) throws InterruptedException
		{
			Projects_Customers_Sub_Module.click();
			Thread.sleep(2000);
			Create_New_Customer.click();
			Thread.sleep(2000);
			Customer_nameTB.sendKeys(cust_name);
			Create_Customer_Button.click();
			Thread.sleep(2000);
			Create_New_Project.click();
			Select sel = new Select(customer_name_Dropdown);
			sel.selectByVisibleText(cust_name);
			Project_nameTB.sendKeys(pro_name);
			
			Create_Project_Button.click();
			
		}
		
		
		
		

}

package crmfa;

import org.openqa.selenium.WebElement;

public class Test_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Base_class b = new Base_class();
		b.browserchrome();
		b.urlpath("http://leaftaps.com/opentaps/control/main");
		b.max();
		Thread.sleep(1000);
		
		WebElement user = b.idlocator("username");
		b.sendkey(user, "DemoSalesManager");
		
		WebElement pass = b.xpathlocator("//input[@type='password']");
		b.sendkey(pass, "crmsfa");
		
		WebElement btnlo = b.className("decorativeSubmit");
		b.click(btnlo);
		
		WebElement but = b.idlocator("button");
		b.click(but);
		
		b.xpathlocator("//a[text()='Create Lead']").click();
		
		b.xpathlocator("//a[text()='My Leads']").click();
		b.message("Successfull acheived_by 1");
		
	}
}

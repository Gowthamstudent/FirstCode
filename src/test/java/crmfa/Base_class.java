package crmfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	WebDriver driver;
	public void browserchrome() {
		/*
		 * System.setProperty("Webdriver.chrome.driver",
		 * "F:\\Eclipse_Programs_Path\\TestLeaf\\Driver\\chromedriver.exe");
		 */
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void urlpath(String url) {
		driver.get(url);
		}
	public void max() {
		driver.manage().window().maximize();
	}
	public WebElement idlocator(String idname) {
		WebElement FindEle = driver.findElement(By.id(idname));
		return FindEle;
	}
	public WebElement xpathlocator(String xpath) {
		WebElement FindEle = driver.findElement(By.xpath(xpath));
		return FindEle;
	}
	public void sendkey(WebElement elements, String name) {
		elements.sendKeys(name);
	}
	public WebElement className(String name) {
		WebElement FindEle = driver.findElement(By.className(name));
		return FindEle;
	}
	public void click(WebElement element) {
		element.click();
	}
	public void message(String msg) {
		System.out.println("Successfull acheived");
		System.out.println(msg);
	}

	/*
	 * public void excelRead(String file, String sheet, int row, int cell) throws
	 * IOException { File f = new File(file); FileInputStream fin =new
	 * FileInputStream(f); Workbook w = new XSSFWorkbook(fin); Sheet s =
	 * w.getSheet(sheet); Row r = s.getRow(row); Cell c=r.getCell(cell);
	 * c.getCellType();
	 * 
	 * }
	 */



}

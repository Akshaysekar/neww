package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public String getCurrentUrl() {
		String text = driver.getCurrentUrl();
		return text;

	}
	public static void quit() {
	      driver.quit();

	}
	public static void close() {
		driver.close();

	}
	public String getTitle() {
		// TODO Auto-generated method 
String title = driver.getTitle();
return title;

	}
	public void navigateTO(String url) {
		driver.navigate().to(url);
	}
	public void navigateBack() {

	driver.navigate().back();
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public String pageSource() {
		String source = driver.getPageSource();
		return source;
	}
	
	public String windowHandle() {
		String text=driver.getWindowHandle();
		return text;
	}
	public Set<String> windowHandleS() {
		Set<String> text = driver.getWindowHandles();
		return text;
	}


	//Base class methods for alerts interface
	public void AcceptInAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void CancelInAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void sendTextToAlert(WebElement element,String data) {
		Alert alert = driver.switchTo().alert();
		element.sendKeys(data);
		alert.accept();
	}	
		// Base class methods in Frames
		public void SwitchToFrameByIndex(int index) {
			driver.switchTo().frame(index);
		}
		public void switchToFrameByText(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}
		public void switchToFrameByWebElement(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
	
		// Base class methods for WebElement interface
		//99%-------------------------works this method
		public String getAttribute(WebElement element) {
			String attribute=element.getAttribute("Value");// to get the sendkeys input and to get the textbox values
			return attribute;
		}
		//1%---------------works this methods rare chance
		public String getAttribute1(WebElement element,String Value) {
			String attribute=element.getAttribute(Value);// to get the sendkeys input and to get the textbox values
			return attribute;
		}

		public String getText1(WebElement element) {
			String text=element.getText();
			return text;
		}
		public void sendKeys(WebElement element,String  txtusername) {
			element.sendKeys(txtusername);
		}
		public void clickWebelement(WebElement element) {
			element.click();
		}
		//Base class methods for Select Class for dropdown
		public void selectoptionsByText(WebElement element,String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
		public void selectoptionsByIndex(WebElement element,int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void selectoptionsByAttribute(WebElement element,String AttributeName) {
			Select select = new Select(element);
			select.selectByValue(AttributeName);
		}
		

		public void deselectoptionsByText(WebElement element,String text) {
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}
		public void deselectoptionsByIndex(WebElement element,int index) {
			Select select = new Select(element);
			select.deselectByIndex(index);
		}
		public void deselectoptionsByAttribute(WebElement element,String AttributeName) {
			Select select = new Select(element);
			select.deselectByValue(AttributeName);
		}
		public List<WebElement> getAlloptions(WebElement element) {
			Select select = new Select(element);
		List<WebElement> options=select.getAllSelectedOptions();
		return options;
		}
		public int getAlloptionsSIZE(WebElement element) {
			Select select = new Select(element);
		List<WebElement> options=select.getAllSelectedOptions();
		int size=options.size();
		return size;
		}
		
		public boolean ismultiple(WebElement element) {
			Select select = new Select(element);
			boolean multiple=select.isMultiple();
			return multiple;
		}

		//Base class methods for actions class for mouse operations
		public void movetoElement(WebElement element) {
			Actions action= new Actions(driver);
			action.moveToElement(element);

		}
		public void rightClick(WebElement element) {
			Actions action = new Actions(driver);
			action.contextClick(element);
		}
		public void doubleclick(WebElement element) {
			Actions action=new Actions(driver);
			action.doubleClick(element);
		}
		public void dragandDrop(WebElement source,WebElement target) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target);
		}
		//Base methods for boolean
		public boolean isDisplayed(WebElement element) {
			boolean displayed=element.isDisplayed();
			return displayed;
		}
		public boolean isEnabled(WebElement element) {
			boolean Enabled=element.isEnabled();
			return Enabled;
		}
		
		public boolean isselected(WebElement element) {
			boolean selected=element.isSelected();
			return selected;
		}
		public boolean equalsString(String s1,String s2) {
			boolean equals=s1.equals(s2);
			return equals;
		}
		public boolean equalsIgnoreCase(String s1,String s2) {
			boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
			return equalsIgnoreCase;
		}
		public boolean contains(String s1,String s2) {
			boolean contains = s1.contains(s2);
			return contains;
		}
		public boolean startsWith(String s1,String s2) {
			boolean startsWith=s1.startsWith(s2);
			return startsWith;
		}
		public boolean endsWith(String s1,String s2) {
			boolean endsWith=s1.endsWith(s2);
			return endsWith;
		}
		public boolean IsEmpty(String s) {
			boolean empty=s.isEmpty();
			return empty;
		}

		public boolean createFolder(File f) {
			boolean create = f.mkdirs();
			return create;
		}
		public boolean canRead(File f) {
			boolean read = f.canRead();
			return read;
		}
		public boolean writeFile(File f) {
			boolean write = f.canWrite();
			return write;
		}
		public boolean execute(File f) {
			boolean execute=f.canExecute();
			return execute;
		}
		public boolean fileExist(File f) {
			boolean exist=f.exists();
			return exist;
		}
		//Base class methods for JavaScript
		public void JSClick(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click", element);
		}
		public void JSSetValue(WebElement element,String text) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute'value''"+text+"'", element);
		}
		public void JSGetValue(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].getAttribute'value'", element);
		}
		public void JSPageDOWN(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].ScrollIntoView(true)", element);
		}
		public void JSPageUP(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].ScrollIntoView(false)", element);
		}
		
		//Base class methods present in WebElement Interface

		public void click(WebElement element) {
			element.click();
		}
		public  String getText(WebElement element) {
			String text=element.getText();
			return text;
		}
		public WebElement findLocaterById(String Attributename){
			WebElement element = driver.findElement(By.id(Attributename));
		return element;
		}
		
		public WebElement findLocaterByName(String Name){
			WebElement element=driver.findElement(By.name(Name));
			return element;
		}
		
		public WebElement findLocatorByClassName(String ClassName){ 
			WebElement element = driver.findElement(By.className(ClassName));
		return element;
		}
		
		public WebElement findLocatorByXpath(String Xpathname){
			WebElement element = driver.findElement(By.xpath(Xpathname));
		return element;
		}
		
		
		public WebElement findelementbyID(String attributevalue) {
			WebElement element=driver.findElement(By.id(attributevalue));
			return element;
		}
		public WebElement findelementbyName(String attributevalue) {
			WebElement element=driver.findElement(By.name(attributevalue));
			return element;
		}
		public WebElement findelementbyClassName(String attributevalue) {
			WebElement element=driver.findElement(By.className(attributevalue));
			return element;
		}

		public WebElement findelementbyXPath(String xpath) {
			WebElement element=driver.findElement(By.xpath(xpath));
			return element;
		}
		public WebElement findelementbyPartialLink(String Partiallink) {
			WebElement element=driver.findElement(By.partialLinkText(Partiallink));
			return element;
				}
		public WebElement findelementbyLinkText(String link) {
			WebElement element=driver.findElement(By.linkText(link));
			return element;
		}
		public WebElement findelementbyTagName(String c ) {
			WebElement element=driver.findElement(By.tagName(c));
			return element;
		}
		public WebElement findelementbyCSSSelector(String css) {
			WebElement element=driver.findElement(By.cssSelector(css));
			return element;
		}
			
			public void writeData(String sheetName, int rowNo, int cellNo, String orderNo) throws IOException {
				String data= null;
				File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\ManvenSample\\Excel\\hotel.xlsx");
				FileInputStream stream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(stream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row row = sheet.getRow(rowNo);
				Cell cell = row.createCell(cellNo);
				cell.setCellValue(orderNo);
				FileOutputStream stream2 =new FileOutputStream(file);
				workbook.write(stream2);
		}
		
		
			public String getData(String SheetName, int rownum, int cellnum) throws IOException {
				
				String res=null;
				
				File file = new File("C:\\Users\\rajar\\eclipse-workspace\\base\\excel\\framework excel.xlsx");
		       
				FileInputStream inputStream = new FileInputStream(file); 
				
				Workbook workbook = new XSSFWorkbook(inputStream);
				
				Sheet sheet = workbook.getSheet(SheetName);
				
				Row row = sheet.getRow(rownum);
		    	
				Cell cell = row.getCell(cellnum);
		    	
				CellType cellType = cell.getCellType();
			    
		    	switch (cellType) {
			    
		    	case STRING:
					res = cell.getStringCellValue();
					System.out.println(res);
					
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						
					java.util.Date d = cell.getDateCellValue();
					SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MMM-yy");
					res =dateFormat.format(d);
					}
					else {
					double numericcellvalue = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(numericcellvalue);
					res = b.toString();
					System.out.println(res);
				}
				break;
				default:
				break;
		}
			    FileOutputStream o = new FileOutputStream(file);
		    	workbook.write(o);
		     	
		    	return res;
			
		}
		public void selectOptionsByText(WebElement element,String Data){
			Select select = new Select(element); 
			select.selectByVisibleText(Data);
		}
		
		public void selectOptionsByIndex(WebElement element,int index){
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		
		public void selectOptionsByAttribute(WebElement element,String AttributeName)
		{
		Select select = new Select(element); 
		select.deselectByValue(AttributeName);
		}
		public void dropdownbyIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void threadSleep(int sec) throws InterruptedException {
			Thread.sleep(sec);
		}
		public String getAttributeValue(WebElement element){
			String attribute = element.getAttribute("value");
		return attribute;
		}
		
			
		public void insertValue(WebElement element,String txtusername){ 
			element.sendKeys(txtusername);
		}
		
		
		
		
		
		
		
	}	
	



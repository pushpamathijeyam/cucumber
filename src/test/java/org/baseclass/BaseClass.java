package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;

	public static void openChromeBrowser() { // 1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void openEdgeBrowser() { // 2
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void closeCurrentTab() { // 3
		driver.close();

	}

	public static void closeBrowser() { // 4
		driver.quit();
	}

	public void applyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static String fetchTitle() { // 5
		String titlename = driver.getTitle();
		return titlename;
//		System.out.println(titlename);
	}

	public static String fetchUrl() { // 6
		String url = driver.getCurrentUrl();
		return url;
		// System.out.println(url);

	}

	public static void maxWindow() { // 7
		driver.manage().window().maximize();

	}

	public static void minWindow() { // 8
		driver.manage().window().minimize();
	}

	public static void toReload() { // 9
		driver.navigate().refresh();
	}

	public static void lanuchUrl(String url) { // 10
		driver.get(url);

	}

	public static void holdExecution(int timeInMillisecond) throws InterruptedException { // 11
		Thread.sleep(timeInMillisecond);

	}

	public static void fillTextBox(WebElement element, String input) { // 12
		element.sendKeys(input);
		// return input;

	}

	public static void toClickButton(WebElement element) { // 13
		element.click();

	}

	public static void moveCursor(WebElement targetElement) { // 14
		a = new Actions(driver);
		a.moveToElement(targetElement).perform();

	}

	public static void dragdrop(WebElement source, WebElement target) { // 15
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}

	public static void doubleClickElement(WebElement target) { // 16
		a = new Actions(driver);
		a.doubleClick(target).perform();

	}

	public static void clickHold(WebElement target) { // 17
		a = new Actions(driver);
		a.clickAndHold(target).perform();

	}

	public static void contextAndClick(WebElement target) { // 18
		a = new Actions(driver);
		a.contextClick(target).perform(); 
	}

	public static void keyUpCase(WebElement target, String destination) { // 19
		a = new Actions(driver);
		a.keyUp(target, destination).perform();
	}

	public static void keyDownCase(WebElement target, String destination) { // 20
		a = new Actions(driver);
		a.keyDown(target, destination).perform();
	}

	public static void sendText(String input) { // 21
		a = new Actions(driver);
		a.sendKeys(input).perform();
	}

	public void handleSimpleAlert() { // 22
		Alert ac = driver.switchTo().alert();
		ac.accept();
	}

	public static void cancelConfirmAlert() { // 23
		driver.switchTo().alert().dismiss();
	}

	public static void promptAlert(String value) { // 24
		driver.switchTo().alert().sendKeys(value);
	}

	public static void promptAlertPassText() { // 25
		driver.switchTo().alert().getText();
	}

	public static void copy() throws AWTException { // 26
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() throws AWTException { // 27
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void tab() throws AWTException { // 28
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void copyAll() throws AWTException { // 29
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void save() throws AWTException { // 30
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
	}

	public static void enter() throws AWTException { // 31
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void cut() throws AWTException { // 32
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void keyDown() throws AWTException { // 33
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void keyUp() throws AWTException { // 35
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void pageDown() throws AWTException { // 36
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	public static void pageUp() throws AWTException { // 37
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public static void takeScreenShot(String imgname) throws IOException { // 38
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcFile = tss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Akila\\eclipse-workspace\\CucumberDemo\\screenshot\\"+imgname+".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void jsCommand(String script, Object args) { // 39
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, args);
	}

	public static void selectVisibleText(WebElement element, String text) { // 40
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectIndex(WebElement element, int index) { // 41
		s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectValue(WebElement element, String value) { // 42
		s = new Select(element);
		s.selectByValue(value);
	}

	public void deselectIndex(WebElement element, int index) { // 43
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselectValue(WebElement element, String value) { // 44
		s = new Select(element);
		s.deselectByValue(value);

	}

	public static void deselectVisibleText(WebElement element, String text) { // 45
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void switchWindow(String name) { // 46
		driver.switchTo().window(name);
	}

	public static void switchFramesIndex(int index) { // 47
		driver.switchTo().frame(index);

	}

	public static void switchFramesName(String nameOrId) { // 48
		driver.switchTo().frame(nameOrId);
	}

	public static void switchFramesElement(WebElement frameElement) { // 49
		driver.switchTo().frame(frameElement);

	}

	public static void switchParentFrame() { // 50
		driver.switchTo().parentFrame();

	}

	public static void navigateRefresh() {// 51
		driver.navigate().refresh();
	}

	public static void navigateUrl(String url) { // 52
		driver.navigate().to(url);
	}

	public static void navigateBack() { // 53
		driver.navigate().back();
	}

	public static void navigateForward() { // 54
		driver.navigate().forward();
	}

	public static String readDataFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\Akila\\eclipse-workspace\\CucumberDemo\\excel\\ammu.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String input = "";
		if (cellType == 1) {
			input = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
			input = sdf.format(da);

		} else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			input = String.valueOf(l);
		}

		return input;

	}

	public static String updateExcel(String sheetName, int rowNo, int cellNo, String value) throws IOException {
		File f = new File("C:\\Users\\Akila\\eclipse-workspace\\Maven\\excel\\ammu.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		b.write(fout);
		return sheetName;

	}

	public static void output(String input) {
		System.out.println(input);
	}

}

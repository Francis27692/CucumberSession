package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	static Alert al;
	static Robot rob;
	static Select s;
	public static Date d;

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void fillText(WebElement element, String value) {
		element.sendKeys(value);
	}

	// public static void fillNum(WebElement element, int number) {
	// element.sendKeys(number);
	// }

	public static void printTxt(WebElement element) {
		String prtTxt = element.getText();
		System.out.println(prtTxt);
	}

	public static void btnClick(WebElement btn) {
		btn.click();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void mouseHover(WebElement move) {
		a = new Actions(driver);
		a.moveToElement(move).perform();
	}

	public static void pageDown(WebElement pDown) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pDown);
	}

	public static void pageUp(WebElement pUp) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", pUp);
	}

	public static void pageScreenshot(String image) throws IOException {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Course\\Selenium\\MavenTest\\screenshot\\" + image + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void alertAccept() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void alertDismiss() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alertPrompt(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);
	}

	public static void parentId() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void allWindowID() {
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
	}

	public static void newWindow(Integer i) {
		Set<String> allWindowId = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allWindowId);
		driver.switchTo().window(li.get(i));
	}

	public static void findSize(WebElement size) {
		size.getSize();
	}

	public static void givenText(WebElement txt) {
		String printTxt = txt.getText();
		System.out.println(printTxt);
	}

	public static void jsSetText(String valTxt, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + valTxt + "')", element);
	}

	public static void jsGetText(WebElement element) {
		js = (JavascriptExecutor) driver;
		Object oj = js.executeScript("arguments[0].getAttribute('value')", element);
		String printTxt = (String) oj;
		System.out.println(printTxt);
	}

	public static void robSelect(WebElement element) throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);

	}

	public static void robSelCopy(WebElement element) throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);

	}

	public static void robPaste(WebElement txtPaste) throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
	}

	public static void robCopy(WebElement element) throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
	}

	public static void robTab(WebElement nxtElem) throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
	}

	public static void doubleClick(WebElement dClick) {
		a = new Actions(driver);
		a.doubleClick(dClick).perform();
	}

	public static void rightclick(WebElement context) {
		a = new Actions(driver);

		a.contextClick(context).perform();
	}

	public static void robDown(Integer intNum) throws AWTException {
		rob = new Robot();
		for (int i = 0; i < intNum; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public static void robEnter() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void iFrameNum(int i) {
		driver.switchTo().frame(i);
	}

	public static void iFrameTxt(String s) {
		driver.switchTo().frame(s);
	}

	public static String getExcelData(int rwNumber, int colNumber) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream finpt = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(finpt);
		Sheet sht = w.getSheet("userdetails");
		Row rw = sht.getRow(rwNumber);

		Cell cl = rw.getCell(colNumber);

		int cellType = cl.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cl.getStringCellValue();
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cl)) {
				Date dcl = cl.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				value = sdf.format(dcl);
			} else {
				double ncl = cl.getNumericCellValue();
				long l = (long) ncl;

				value = String.valueOf(l);
			}
		}
		return value;
	}

	public static String getNaukriData(int rowNum, int colNum) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sht = wb.getSheet("naukri");

		Row rw = sht.getRow(rowNum);
		Cell cl = rw.getCell(colNum);

		int cellType = cl.getCellType();
		String value = "";
		if (cellType == 1) {

			value = cl.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			double ncl = cl.getNumericCellValue();
			long l = (long) ncl;
			value = String.valueOf(l);
			System.out.println(value);
		}
		return value;
	}

	public static String getHotelData(int rowNum, int colNum) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sht = wb.getSheet("adactin-hotel");

		Row rw = sht.getRow(rowNum);
		Cell cl = rw.getCell(colNum);

		int cellType = cl.getCellType();
		String value = "";
		if (cellType == 1) {

			value = cl.getStringCellValue();
			// System.out.println(value);
		} else if (cellType == 0) {
			double ncl = cl.getNumericCellValue();
			long l = (long) ncl;
			value = String.valueOf(l);
			// System.out.println(value);
		}
		return value;
	}

	public static String getFBData(int rowNum, int colNum) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sht = wb.getSheet("facebook");

		Row rw = sht.getRow(rowNum);
		Cell cl = rw.getCell(colNum);

		int cellType = cl.getCellType();
		String value = "";
		if (cellType == 1) {

			value = cl.getStringCellValue();
			// System.out.println(value);
		} else if (cellType == 0) {
			double ncl = cl.getNumericCellValue();
			long l = (long) ncl;
			value = String.valueOf(l);
			// System.out.println(value);
		}
		return value;
	}

	public static void hotelBookingData(WebElement element, int rwNum, int clNum) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\bookhotel.xlsx");

		Workbook w = new XSSFWorkbook();

		Sheet createSheet = w.createSheet("hotel-booking");
		Row cRow = createSheet.createRow(rwNum);
		Cell cl = cRow.createCell(clNum);

		// cl.setCellValue();

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void printDataInExcel(WebElement element, int rwNum, int clNum) throws IOException {
		String text = element.getText();
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);

		Sheet createSheet = w.getSheet("facebook");
		Row cRow = createSheet.createRow(rwNum);
		Cell cl = cRow.createCell(clNum);

		cl.setCellValue(text);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void hotelPrintData(WebElement element, int rwNum, int clNum, String value) throws IOException {
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\bookhotel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sht = w.getSheet("adactin-hotel");
		Row rw = sht.getRow(rwNum);
		Cell cl = rw.getCell(clNum);

		cl.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void dropdownData(WebElement element, String value) {
		s = new Select(element);
		List<WebElement> selOpt = s.getOptions();
		for (int i = 1; i < selOpt.size(); i++) {
			WebElement eachOpt = selOpt.get(i);
			String txt = eachOpt.getText();
			System.out.println(txt);
		}

	}

	public static void dropdownSelect(WebElement element, int value) {
		s = new Select(element);
		s.selectByIndex(value);
	}

	public static void dropdownSelByVisibleTxt(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void clearText(WebElement element) {
		element.clear();
	}

	public static void printDateAndTime(String s) {
		d = new Date();
		System.out.println(s + d);
	}
	
	public static void implicitWait(Integer i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		
	}
	
	public static void threadSleep(Integer ms) throws InterruptedException {
		Thread.sleep(ms);

	}

}

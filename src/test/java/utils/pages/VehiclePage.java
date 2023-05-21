package utils.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class VehiclePage extends TestBase {
	
	public VehiclePage(WebDriver driver) {
		super(driver);
	}

	//Objects located on page

	private By radioRightHand = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");
	public By radioRightHd() {
		return radioRightHand;	
	}
	private By radioMale = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	public By optionMale() {
		return radioMale;	
	}
	private By checkboxOp = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	public By EuroProtection() {
		return checkboxOp;	
	}
	private By speOp = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	public By Speeding() {
		return speOp;	
	}
	private By skyOp = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
	public By Skydiving() {
		return skyOp;	
	}
	private By platPlan = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
	public By platinumPlan() {
		return platPlan;	
	}
	
	//Methods
	public void visitPage(String url) {
		driver.get(url);
	}

	//Verify if the element is visible
	public void verifyElement(String element){
		WebElement box = driver.findElement(By.id("LoadingPDF"));
        synchronized (box) {
            try {       	
            	box.wait(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'" + element  + "')]"));
    	//conditional for element
    		if (text.isDisplayed() == true) {
    			System.out.println("The mensage is displayed with sucess");
    		} else {
    			System.out.println("The element is not visible");
    			driver.quit();
    		}
	}
	
	//Fill a text on a field
	public void fillTextArea(String element, String element2) {
		WebElement field = driver.findElement(By.id(element));
		field.sendKeys(element2);
	}
	
	//Buttons next
	public void nextButton(String element) {
		WebElement next = driver.findElement(By.id(element));
        synchronized (next) {
            try {
            	next.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		next.click();
	}
	
	//Optional selections 
	public void clickBttNext() {
		WebElement radioRightHand = driver.findElement(radioRightHd());
		radioRightHand.click();
	}
	public void selectRadioBtt() {
		WebElement radioRightHand = driver.findElement(radioRightHd());
		radioRightHand.click();
	}
	
	public void radioGender() {
		WebElement radioGenderM = driver.findElement(optionMale());
		radioGenderM.click();
	}
	public void radioPlat() {
		WebElement radioSelected = driver.findElement(platinumPlan());
		radioSelected.click();
	}
	
	public void optionalProd() {
		WebElement optionProd = driver.findElement(EuroProtection());
		optionProd.click();
	}
	public void hobbies() {
		WebElement optionHobbie = driver.findElement(Speeding());
		optionHobbie.click();
		WebElement optionHobbie2 = driver.findElement(Skydiving());
		optionHobbie2.click();
	}
   public void selectElementList (String element, String element2) {
  	      WebElement field = driver.findElement(By.id(element));
  	      Select sel = new Select(field);
  	      sel.selectByVisibleText(element2);		
    }
	
	
}

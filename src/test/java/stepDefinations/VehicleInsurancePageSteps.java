package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.pages.VehiclePage;

public class VehicleInsurancePageSteps {
	
	private final VehiclePage vehiclePage = new VehiclePage(new ChromeDriver());
	
	
	@Given("I am on {string}")
	public void i_am_on(String url) {
		vehiclePage.visitPage(url);
	}
	
	@And("gonna to visit form enter vehicle data")
	public void gonna_to_visit_form_enter_vehicle_data() {
	    
	}
	
	@When("start to field the form")
	public void start_to_field_the_form() {
	}
	
	@And("select the {string} in a list {string}")
	public void select_the_make_in_a_list_bmw(String make, String bmw) {
		vehiclePage.selectElementList(make, bmw);
	}
	
	@And("next select the {string} in a list {string}")
	public void select_the_model_in_a_list_scooter(String model, String moped) {
		vehiclePage.selectElementList(model, moped);
	}
	
	@And("fill the {string} {string}")
	public void fill_the_cylinder_capacity(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	
	@And("fill the area of {string} {string}")
	public void fill_the_engine_performance(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	
	@And("select the {string} {string}")
	public void select_the_date_of_manufacture(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("fill the value {string} {string}")
	public void select_the_number_of_seats(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("choose Right Hand Drive")
	public void choose_right_hand_drive() {
	    vehiclePage.selectRadioBtt();
	}
	
	@And("select the option of {string} {string}")
	public void select_the_option_of(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("choose a {string} {string}")
	public void select_the_fuel_type_diesel(String element, String element2) {
	    vehiclePage.selectElementList(element, element2);
	}
	
	@And("fill the how many {string} {string}")
	public void fill_the_payload(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("i set the amount of {string} {string}")
	public void fill_the_total_weight(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("put {string} {string}")
	public void fill_the_list_price(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@When("fill {string} {string}")
	public void fill_the_annual_mileage(String element, String element2) {
	    vehiclePage.fillTextArea(element, element2);
	}
	
	@And("click on next button {string}")
	public void click_on_button_vehicle(String btNext) {
		vehiclePage.nextButton(btNext);
	}
	

	//Page Insurant data
	@And("i fill my {string} {string}")
	public void i_fill_my(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("i fill the {string} {string}")
	public void i_fill_the(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("set my {string} {string}")
	public void set_my(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("choose my gender")
	public void choose_my_gender() {
	    vehiclePage.radioGender();
	}
	@And("i select my {string} {string}")
	public void i_select_my(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("i put number of my {string} {string}")
	public void i_put_number_of_my(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("set the {string} {string}")
	public void set_the(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("inform my hobbies")
	public void inform_my_hobbies() {
	    vehiclePage.hobbies();
	}	
	@And("click on button {string} to advance")
	public void click_on_button_product(String btNext) {
		vehiclePage.nextButton(btNext);
	}
	
	
	
	//Page Product Data
	@And("set a {string} {string}")
	public void set_a(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("inform the {string} {string}")
	public void inform_the(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("define a {string} {string}")
	public void define_a(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("click to define a {string} {string}")
	public void define_a_damage(String element, String element2) {
		vehiclePage.selectElementList(element, element2);
	}
	@And("select any optional products")
	public void select_any_optional_products() {
	    vehiclePage.optionalProd();
	}
	@And("choose if want {string} {string}")
	public void choose_if_want(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("click on button {string}")
	public void click_on_button_next_price(String btNext) {
	   vehiclePage.nextButton(btNext);
	}
	
	//Page Price option
	@And("select the Platinum plan")
	public void select_the_plan() {
		vehiclePage.radioPlat();
	}
	@And("advance clicking on {string} button")
	public void advance_to_next_page(String element) {
		   vehiclePage.nextButton(element);
	}
	
	//Send quote page
	@And("put my on field {string} {string}")
	public void put_my_on_field(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("i create a {string} {string}")
	public void i_create_a(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("change a new {string} {string}")
	public void change_a_new(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@And("confirm the pass {string} {string}")
	public void confirm_the_pass_confirmpassword(String element, String element2) {
		vehiclePage.fillTextArea(element, element2);
	}
	@Then("i click {string} button and a mensage {string}")
	public void i_click_button(String element, String element2) {
		   vehiclePage.nextButton(element);
		   vehiclePage.verifyElement(element2);
	}

}

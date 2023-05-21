#Author: caiohenriquemaciel@gmail.com - v.1
#Keywords Summary : Accenture; Test; BDD; Gherkin
#Feature: Quoting insurance car
#Scenario: Fill fields on web page of test.
#Background: List of steps to run


@tag
Feature: Quoting insurance car
  I want to quote a insurance of a car

  @tag1
  Scenario Outline:: Sending data for Quotation
    Given I am on "http://sampleapp.tricentis.com/101/app.php"
    And gonna to visit form enter vehicle data
    When start to field the form
    And select the "make" in a list <make>
    And next select the "model" in a list <model>
    And fill the "cylindercapacity" <cylinder-capacity>
    And fill the area of "engineperformance" <engine-performance>
    And select the "dateofmanufacture" "05/18/2022"
    And fill the value "numberofseats" <number-seats>
    And choose Right Hand Drive
    And select the option of "numberofseatsmotorcycle" <number-seats>
    And choose a "fuel" <fuel-type>
    And fill the how many "payload" <payload>
    And i set the amount of "totalweight" <weight>
    And put "listprice" <price>
    And fill "annualmileage" <annual-mileage>
    And click on next button "nextenterinsurantdata"
    
    #Second form Insurant Page
    And i fill my "firstname" <first-name>
    And i fill the "lastname" <last-name>
    And set my "birthdate" <my-birthdate>
    And choose my gender
    And i select my "country" <my-country>
    And i put number of my "zipcode" "05788200"
    And set the "occupation" <my-occupation>
    And inform my hobbies
    And click on button "nextenterproductdata" to advance

    #Third page Product Page
    And set a "startdate" "10/01/2024"
    And inform the "insurancesum" " 5.000.000,00"
    And define a "meritrating" "Bonus 1"
    And click to define a "damageinsurance" "No Coverage"
    And select any optional products
    And choose if want "courtesycar" " No"
    And click on button "nextselectpriceoption"

		#Fourth page select the Plan
		And select the Platinum plan
		And advance clicking on "nextsendquote" button
		
		#Last step to send quote
		And put my on field "email" "caio@exemplo.com"
		And i create a "username" "maciel_teste"
		And change a new "password" "Abc123!"
		And confirm the pass "confirmpassword" "Abc123!"
		Then i click "sendemail" button and a mensage "Sending e-mail success!"
		
    Examples: 
      |	make | model |cylinder-capacity| engine-performance| 	fuel-type | payload| weight| 	 price|annual-mileage|number-seats|first-name|last-name|my-birthdate| my-country|my-occupation|
      | "BMW"|"Moped"|						"100"|							"101"| 		"Diesel"| 	"102"|	"103"|"100000"|					"105"|				 "3"|		"Caio" | "Maciel"|"07/26/1996"|		"Brazil"| 	"Employee"|


    
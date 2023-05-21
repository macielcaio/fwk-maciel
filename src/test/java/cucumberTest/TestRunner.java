package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	 
	@RunWith(Cucumber.class)
	//Alterar o caminho da feature, pois foi executada localmente
	@CucumberOptions(features = "D:\\Projects\\projeto automação\\macyel_automation\\src\\test\\java\\features\\TesteAccenture.feature",
					glue="stepDefinations", tags = "@tag", monochrome = true)

public class TestRunner {
		

}

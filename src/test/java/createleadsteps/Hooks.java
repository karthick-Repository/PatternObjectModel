package createleadsteps;

import cucumber.api.Scenario;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
	  
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test.assignCategory("Smoke");
		test.assignAuthor("Karthick Harish");
		startApp("chrome");
	}

	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		closeAllBrowsers();
		endResult();
	}
}

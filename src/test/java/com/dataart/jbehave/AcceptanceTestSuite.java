package com.dataart.jbehave;

import org.jbehave.core.annotations.BeforeScenario;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	public AcceptanceTestSuite() {
		//findStoriesCalled("**/Registration.story");
		//findStoriesCalled("**/Login.story");
		//findStoriesCalled("**/Import.story");
		//findStoriesCalled("**/PasswordReset.story");
		findStoriesCalled("*.story");
		//findStoriesCalled("**/UserProfile.story");
	}

}

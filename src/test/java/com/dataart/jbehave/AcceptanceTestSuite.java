package com.dataart.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	public AcceptanceTestSuite() {
		findStoriesCalled("**/Registration.story");

	}
}

package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.firstName.validate("Dinesh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.firstName.validate("dinesh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.lastName.validate("zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.lastName.validate("zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.email.validate("abc.xyz@bl.co.in");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.email.validate("din12@gmail.com");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.mobileNumber.validate("91 9404291279");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenMobileNo_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.mobileNumber.validate("9404291279");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule1.validate("Di@ne-sh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule1.validate("dinesh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule2.validate("Di@ne-sh_Zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule2.validate("zin-gade.din");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule3.validate("Din@esh12");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule3.validate("Din@e.sh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule4.validate("Dinesh@12zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() throws InvalidUserDetailsException {
		boolean result = userRegistration.passwordRule4.validate("Din1esh2zingade");
		;
		Assertions.assertTrue(result);
	}
}

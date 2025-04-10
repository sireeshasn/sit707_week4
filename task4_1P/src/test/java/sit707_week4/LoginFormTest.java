package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "S223796895";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "sireesha";
		Assert.assertNotNull("Student name is null", studentName);
	}
	

	    @Test
	    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login(null, null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login(null, "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login(null, "ahsan_pass");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("wrong_username", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("wrong_username", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("wrong_username", "ahsan_pass");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testSuccessCorrectUsernameAndCorrectPasswordAndCorrectValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        Assert.assertTrue(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndWrongValCode() {
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndWrongValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndCorrectPasswordAndEmptyValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        if(status.isLoginSuccess()) {
	        	Assert.assertFalse(LoginForm.validateCode(null));
	        }
	    }

	    @Test
	    public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        if(status.isLoginSuccess()) {
	        	Assert.assertFalse(LoginForm.validateCode("wrong_code"));
	        }
	    }

	    @Test
	    public void testFailCorrectUsernameAndCorrectPasswordAndDontCareValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	        Assert.assertTrue(LoginForm.validateCode(status.getErrorMsg()));
	    }

	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndEmptyValCode() {
	        LoginStatus status = LoginForm.login("ahsan", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndWrongValCode1() {
	        LoginStatus status = LoginForm.login("ahsan", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndWrongPasswordAndEmptyValCode1() {
	        LoginStatus status = LoginForm.login("ahsan", "wrong_password");
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndEmptyValCode() {
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndWrongValCode1() {
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }

	    @Test
	    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode1() {
	        LoginStatus status = LoginForm.login("ahsan", null);
	        Assert.assertFalse(status.isLoginSuccess());
	    }


	
	/*
	 * Write more test functions below.
	 */
}
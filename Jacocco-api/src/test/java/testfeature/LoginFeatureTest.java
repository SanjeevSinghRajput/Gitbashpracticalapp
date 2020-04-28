package testfeature;

import org.junit.Test;

import appfeatures.AppLogin;
import junit.framework.Assert;

public class LoginFeatureTest {
	AppLogin api = new AppLogin();

	@Test
	public void login_test1() {
		boolean status = api.login("admin", "admin");
		Assert.assertEquals(status, true);
	}
}

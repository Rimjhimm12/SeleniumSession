package testngsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CURDTesting {

	public String addUser() {

		String userId = "1234";
		return userId;

	}

	public String getUser(String userId) {
		String userInfo = "Rimjhim";
		return userInfo;

	}

	public String updateUser(String userID) {
		String userInfo = getUser(userID);
		userInfo = "Rimjhim Mallick";
		return userInfo;

	}

	public String deleteUser(String userID) {
		String userInfo = getUser(userID);
		userInfo = null;
		return userInfo;

	}

	@Test
	public void addUserTest() {
		Assert.assertEquals(addUser(), "1234");

	}

	@Test
	public void getUserTest() {
		String userinfo = getUser(addUser()).trim().toLowerCase();
		Assert.assertEquals(userinfo, "rimjhim1");

	}

	@Test
	public void updateUserTest() {
		String newUserInfo = updateUser(getUser(addUser())).toLowerCase();
		Assert.assertEquals(newUserInfo, "rimjhim mallick");

	}

	@Test
	public void deleteUserTest() {
		String userInfo = deleteUser(getUser(addUser()));
		Assert.assertEquals(userInfo, null);

	}

}

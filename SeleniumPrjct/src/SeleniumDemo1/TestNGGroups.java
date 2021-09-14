package SeleniumDemo1;

import org.testng.annotations.Test;

public class TestNGGroups {

	@Test (groups = {"sanity"})
	public void test1() {
		System.out.println("this is test1");
	}
	@Test (groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("this is test2");
	}
	@Test (groups = {"sanity", "regression"})
	public void test3() {
		System.out.println("this is test3");
	}
	@Test 
	public void test4() {
		System.out.println("this is test4");
	}
	@Test (groups = {"windows.sanity"})
	public void test5() {
		System.out.println("regular expressions");
	}
}

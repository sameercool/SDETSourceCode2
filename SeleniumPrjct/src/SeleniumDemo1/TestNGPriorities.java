package SeleniumDemo1;

import org.testng.annotations.Test;

public class TestNGPriorities {

		@Test (priority=3)
		public void c() {
			System.out.println("c");
		}
		@Test (priority=1)
		public void a() {
			System.out.println("a");
		}
		@Test (priority=4)
		public void d() {
			System.out.println("d");
		}
		//test case with same priorities
		@Test (priority=4)
		public void f() {
			System.out.println("f");
		}
		@Test (priority=2)
		public void b()
		{
			System.out.println("b");
		}
		
		//test cases with no priority
		@Test 
		public void g() {
			System.out.println("this is no priority eg");
		}
		//test case with 0 priority
		@Test (priority=0)
		public void h(){
			System.out.println("this is 0 priority eg");
		}
	}

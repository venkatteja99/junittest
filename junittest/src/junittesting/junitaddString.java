package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class junitaddString {

	@Test
	public void test() {
		testing test=new testing();
		String result=test.addstring("hello", "world");
		assertEquals("helloworld",result);
	}

}

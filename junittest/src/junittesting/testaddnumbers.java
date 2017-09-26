package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
	    testing test=new testing();
	  int result= test.addnumber(10, 20);
	    assertEquals(30,result);
	}

}

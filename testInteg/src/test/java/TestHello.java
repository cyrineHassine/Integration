

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import testInteg.Hello;

public class TestHello {

	@Test
	public void test() {
		Hello hello=new Hello();
		assertEquals(hello.sayHello(),"Hello");
		
	}

}

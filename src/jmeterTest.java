import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class jmeterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetName() {
		jmeter aJmeter=new jmeter();
		String aString=aJmeter.getName();
		assertEquals(aString, aJmeter.name);
		
	}

	@Test
	public void testGetFriend() {
        jmeter aJmeter=new jmeter();
		String aString=aJmeter.getFriend();
		assertEquals(aString, aJmeter.friend);
		
	}

}

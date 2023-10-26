import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PathExampleTest {
	
	static PathCoverage pathExample;

	@BeforeEach
	public void setUp() throws Exception {

		pathExample = new PathCoverage();
	}

	@Test
	public void test1() {
		
		long x = 0;
		
		assertEquals(3, pathExample.returnInput(x,true,true,true));
		assertEquals(0, pathExample.returnInput(x,false,false,false));
	}

	@Test
	public void test2() {

		long x = 0;

		assertEquals(3, pathExample.returnInput(x,true,true,true));
		assertEquals(1, pathExample.returnInput(x,false,true,true));
		assertEquals(1, pathExample.returnInput(x,true,false,true));
		assertEquals(1, pathExample.returnInput(x,true,true,false));
		assertEquals(0, pathExample.returnInput(x,false,false,false));
	}

}
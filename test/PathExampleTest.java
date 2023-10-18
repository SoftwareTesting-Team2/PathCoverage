import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PathExampleTest {
	
	static PathExample pathExample;

	@BeforeEach
	public void setUp() throws Exception {

		pathExample = new PathExample();
	}

	@Test
	public void test1() {
		
		int x = 25;
		
		assertEquals(25, pathExample.returnInput(x, true , true , true ));
		assertEquals(25, pathExample.returnInput(x, true , true , false ));
		assertEquals(25, pathExample.returnInput(x, true , false , true ));
		assertEquals(25, pathExample.returnInput(x, false , true , true ));
		assertEquals(25, pathExample.returnInput(x, false, false, false));
	}

}
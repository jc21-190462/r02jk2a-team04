import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai05Test{

	@Test
	void   testcountString() {
		Kadai05 d = new Kadai05();
		assertEquals(15,d.getMax( new  int[] {10,5,9,4,15}));
		assertEquals(10,d.getMax( new  int[] {10,5,9,4,15}));
		assertEquals(20,d.getMax( new  int[] {10,5,9,4,15}));
		assertNull(null);

	}

}
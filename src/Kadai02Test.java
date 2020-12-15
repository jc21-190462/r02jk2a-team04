import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test{

	@Test
	void   testcountString() {
		Kadai02 s = new Kadai02();
		assertEquals(3,s.countString("aaabbccccd", 'a'));
		assertNull(null);

	}

}

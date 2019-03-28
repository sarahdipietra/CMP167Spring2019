import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DMVTest {

	@Test
	void test1() {
		System.out.println("Testing for expirationDate");
		assert((DMV.expirationDate(2014) != 2024)) : "Test has not passed";
		assert((DMV.expirationDate(2014) != 2023)) : "Test has not passed";
	}
}

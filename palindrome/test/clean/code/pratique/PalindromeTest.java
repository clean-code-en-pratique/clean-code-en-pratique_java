package clean.code.pratique;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void shouldBeAPalindrome() {
		assertTrue(Palindrome.isPalindrome("otto"));
	}

	@Test
	public void shouldBeAPalindromeEvenWithSpaceAndCharacter() {
		assertTrue(Palindrome.isPalindrome("A Toyota. Race fast, safe car. A Toyota."));
	}
	
	@Test
	public void shoulNotBeAPalindrome() {
		assertFalse(Palindrome.isPalindrome("toto"));
	}

}

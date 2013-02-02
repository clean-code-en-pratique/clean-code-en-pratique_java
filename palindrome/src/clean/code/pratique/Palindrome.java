package clean.code.pratique;

public class Palindrome {
	static public boolean isPalindrome(String value) {

		int leftIndex = 0;
		int rigthIndex = value.length() - 1;

		while (true) {
			if (leftIndex > rigthIndex) {
				return true;
			}

			char leftChar = value.charAt(leftIndex);
			char rightChar = value.charAt(rigthIndex);

			// Scan forward for a while invalid.
			while (!Character.isLetterOrDigit(leftChar)) {
				leftIndex++;
				if (leftIndex > rigthIndex) {
					return true;
				}
				leftChar = value.charAt(leftIndex);
			}

			// Scan backward for b while invalid.
			while (!Character.isLetterOrDigit(rightChar)) {
				rigthIndex--;
				if (leftIndex > rigthIndex) {
					return true;
				}
				rightChar = value.charAt(rigthIndex);
			}

			if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
				return false;
			}
			leftIndex++;
			rigthIndex--;
		}
	}

	// Good Sentences
	// "A man, a plan, a canal: Panama.",
	// "A Toyota. Race fast, safe car. A Toyota.",
	// "Cigar? Toss it in a can. It is so tragic.",
	// "Dammit, I'm mad!",
	// "Delia saw I was ailed.",
	// "Desserts, I stressed!",
	// "Draw, O coward!",
	// "Lepers repel.",
	// "Live not on evil.",
	// "Lonely Tylenol.",
	// "Murder for a jar of red rum.",
	// "Never odd or even.",
	// "No lemon, no melon.",
	// "Senile felines.",
	// "So many dynamos!",
	// "Step on no pets.",
	// "Was it a car or a cat I saw?",

	// Wrong sentences
	// "Dot Net Perls is not a palindrome.",
	// "Why are you reading this?",
	// "This article is not very useful.",
	// "...",
	// "...Test"
}

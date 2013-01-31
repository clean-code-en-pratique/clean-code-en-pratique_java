package clean.code.pratique;

public class Palindrome {
	static public boolean isPalindrome(String value) {

		int min = 0;
		int max = value.length() - 1;

		while (true) {
			if (min > max) {
				return true;
			}

			char a = value.charAt(min);
			char b = value.charAt(max);

			// Scan forward for a while invalid.
			while (!Character.isLetterOrDigit(a)) {
				min++;
				if (min > max) {
					return true;
				}
				a = value.charAt(min);
			}

			// Scan backward for b while invalid.
			while (!Character.isLetterOrDigit(b)) {
				max--;
				if (min > max) {
					return true;
				}
				b = value.charAt(max);
			}

			if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
				return false;
			}
			min++;
			max--;
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

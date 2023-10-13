package newLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {

	public static void frequencyCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String inputString = sc.nextLine();
		HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			System.out.println("Char is : " + ch);
			// System.out.println("char position"+freqMap.get(ch)+1);
			// Check if the character is already present in the hashmap

			if (freqMap.containsKey(ch)) {
				System.out.println("value of the char " + ch + " : " + (freqMap.get(ch)));

				freqMap.put(ch, freqMap.get(ch) + 1);
			} else {
				// If it is not present, add the character to the hashmap with a frequency of 1
				freqMap.put(ch, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println("Frequency of " + entry.getKey() + " is " + entry.getValue());
		}

	}

	public static void main(String[] args) {

		frequencyCheck();

	}

}

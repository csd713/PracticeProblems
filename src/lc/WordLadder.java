/**
 * File created by csd on May 27, 2018
 * 
 * LC127 - Word Ladder
 */
package lc;

import java.util.*;

public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		arr.add("most");
		arr.add("fist");
		arr.add("lost");
		arr.add("cost");
		arr.add("fish");
		System.out.println(ladderLength("lost", "cost", arr));
	}

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

		if (!wordList.contains(endWord))
			return 0;

		Queue<String> q = new LinkedList<>();
		q.add(beginWord);

		int length = 0; // begin word length

		while (!q.isEmpty()) {
			int size = q.size(); // store the size of Q (it may change)

			for (int i = 0; i < size; i++) {
				String cur = q.remove();

				if (cur.equals(endWord)) {
					return length + 1;
				}

				for (int j = 0; j < cur.length(); j++) {
					char[] word = cur.toCharArray();

					// get the words that are 1 word away from current word
					// Similar to fetching adjacency list in BFS

					for (char ch = 'a'; ch <= 'z'; ch++) {
						word[j] = ch;
						String check = new String(word);
						if (wordList.contains(check) && !check.equals(cur)) {
							q.add(check);
							// remove from wordlist to mark it as visited
							wordList.remove(check);
						}
					}
				}
			}
			length++;
		}
		return 0;
	}
}

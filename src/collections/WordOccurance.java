package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean World Green World Love World";
		
		String [] words = str1.split(" ");
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word: words) {
			
			if(map1.get(word) == null) {
				map1.put(word, 1);
			}else {
				
				int oldOccu = map1.get(word);
				
				map1.put(word, oldOccu+1);
			}
				
			//Integer occurance = map1.get(word)	
		}

		System.out.println(map1);
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> wordMap = new HashMap<>();
		for(int i=0;i<N;i++) {
			String word = br.readLine();
			if(word.length()>=M) {
				if(wordMap.containsKey(word)) wordMap.put(word, wordMap.get(word)+1);
				else wordMap.put(word, 1);
			}
		}
		
		List<String> wordList = new ArrayList<>(wordMap.keySet());
		wordList.sort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(wordMap.get(s1).compareTo(wordMap.get(s2))>0) return -1;
				else if(wordMap.get(s1).compareTo(wordMap.get(s2))<0) return 1;
				else {
					if(s1.length()!=s2.length()) return s2.length()-s1.length();
					else return s1.compareTo(s2);
				}
			}
		});
		
		for(String i : wordList) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
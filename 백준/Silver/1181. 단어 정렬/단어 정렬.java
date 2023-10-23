import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<String> word = new ArrayList<>();
		for(int i=0;i<N;i++) {
			String tmp = br.readLine();
			if(word.contains(tmp)!=true) word.add(tmp); 
		}
		
		
		Collections.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}
				else return s1.length()-s2.length();
			}
		});
		
		
		
		for(int i=0;i<word.size();i++) {
			System.out.println(word.get(i));
		}
	}
}
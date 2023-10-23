import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		List<String> word = new ArrayList<>();
		for(int i=0;i<N;i++) word.add(br.readLine());
		
		Collections.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				StringTokenizer st1 = new StringTokenizer(s1);
				StringTokenizer st2 = new StringTokenizer(s2);
				int age1 = Integer.parseInt(st1.nextToken());
				int age2 = Integer.parseInt(st2.nextToken());
				
				if(age1==age2) return 0;
				else return age1-age2;
			}
		});
		
		
		
		for(int i=0;i<word.size();i++) {
			System.out.println(word.get(i));
		}
	}
}
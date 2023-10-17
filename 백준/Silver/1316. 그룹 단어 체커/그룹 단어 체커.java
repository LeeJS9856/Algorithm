import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count =0;
		
		for(int i=0;i<N;i++) {
			int toggle = 0;
			String[] word = br.readLine().split("");
			List<String> wordList = new ArrayList<>();
			for(int j=0;j<word.length;j++) {
				if(wordList.contains(word[j])!=true){
					wordList.add(word[j]);
				}
				else if(word[j-1].equals(word[j])!=true){
					toggle = 1;
				}
			}
			
			if(toggle == 0) count++;
			
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		
	}
}
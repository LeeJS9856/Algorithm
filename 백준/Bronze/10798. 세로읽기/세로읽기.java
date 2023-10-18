import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[][] wordList = new String[5][15];
		List<Integer> wordSize = new ArrayList<>();
		for(int i=0;i<5;i++) {
			String[] word = br.readLine().split("");
			wordSize.add(word.length);
			for(int j=0;j<wordSize.get(i);j++) {
				wordList[i][j] = word[j];
			}
			
		}
		
		
		for(int j=0;j<15;j++) {
			for(int i=0;i<5;i++) {
				if(wordList[i][j]!=null) bw.write(wordList[i][j]+"");
			}
		}
		bw.flush();
		bw.close();
	}
}
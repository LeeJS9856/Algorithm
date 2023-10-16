import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = br.readLine();
		String[] word = sentence.split(" ");
		List<String> wordList = new ArrayList<>(Arrays.asList(word));
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(0).equals("")) wordList.remove(0);
		}
		bw.write(wordList.size()+"\n");
		bw.flush();
		bw.close();
	}
}
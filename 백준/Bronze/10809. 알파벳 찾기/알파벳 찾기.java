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
		
		String S = br.readLine();
		String[] word = S.split("");
		List<Integer> wordInt = new ArrayList<>();
		for(int i=0;i<word.length;i++) {
			wordInt.add((int)S.charAt(i));
		}
		
		for(int i="a".charAt(0);i<="z".charAt(0);i++) {
			if(wordInt.contains(i)==true) {
				for(int j=0;j<wordInt.size();j++) {
					if(wordInt.get(j).equals(i)==true) {
						bw.write(j+" ");
						break;
					}
				}
			}
			else {
				bw.write(-1 + " ");
			}
		}
		bw.flush();
		bw.close();
		
	}
}
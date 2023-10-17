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

		String[] word = br.readLine().split("");
		List<Integer> alpha = new ArrayList<>();
		for(int i=(int)"A".charAt(0); i<="Z".charAt(0);i++) {
			alpha.add(0);
		}
		
		for(int i=0;i<word.length;i++) {
			word[i] = word[i].toUpperCase();
			alpha.set((int)word[i].charAt(0)-(int)"A".charAt(0),alpha.get((int)word[i].charAt(0)-(int)"A".charAt(0))+1 );
		}
		
		int maxCount = 0;
		char maxAlpha=' ';
		
		for(int i=0; i<alpha.size();i++) {
			if(alpha.get(i)>maxCount) {
				maxCount = alpha.get(i);
			}
		}
		for(int i=0; i<alpha.size();i++) {
			if(alpha.get(i).equals(maxCount)&&maxAlpha==' ') {
				int Alpha = (int)"A".charAt(0)+i;
				maxAlpha = (char)Alpha;
			}
			else if(alpha.get(i).equals(maxCount)&&maxAlpha!=' ') {
				maxAlpha = '?';
			}
		}
		bw.write(maxAlpha+"\n");
		bw.flush();
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] word = br.readLine().split("");
		int count = word.length;
		int toggle = 0;
		for(int i=0;i<word.length;i++) {
			if(word[i].equals(word[count-1])!=true) {
				toggle = 1;
			}
			count--;
		}
		if(toggle == 1) bw.write(0+"\n");
		else if(toggle == 0) bw.write(1+"\n");
		bw.flush();
		bw.close();
	}
}
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
		int count = 0;
		for(int i=1;i<word.length;i++) {
			if(IfCroaAlpha(i, word, "c", "=")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "c", "-")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "d", "-")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "l", "j")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "n", "j")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "s", "=")) {
				count++;
			}
			else if(IfCroaAlpha(i, word, "z", "=")) {
				count++;
			}
		}
		for(int i=2;i<word.length;i++) {
			if(IfCroaAlpha(i, word, "d", "z", "=")) {
				count++;
			}
		}
		
		bw.write(word.length-count + "\n");
		bw.flush();
		bw.close();
		
	}
	
	public static boolean IfCroaAlpha(int number, String[] array, String s1, String s2) {
		boolean TF = array[number-1].equals(s1)&&array[number].equals(s2);
		return TF;
	}
	public static boolean IfCroaAlpha(int number, String[] array, String s1, String s2, String s3) {
		boolean TF = array[number-2].equals(s1)&&array[number-1].equals(s2)&&array[number].equals(s3);
		return TF;
	}
}
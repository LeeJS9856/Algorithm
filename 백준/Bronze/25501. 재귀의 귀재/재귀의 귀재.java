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
		
		int T = Integer.parseInt(br.readLine());
	
		for(int i=0;i<T;i++) {
			String[] word = br.readLine().split("");
			bw.write(isPalindrome(word)+" "+isPalindromeCount(word)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int recursion(String[] s, int l, int r) {
		if(l>=r) return 1;
		else if(!s[l].equals(s[r])) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int recursionCount(String[] s, int l, int r) {
		if(l>=r) return 1;
		else if(!s[l].equals(s[r])) return 1;
		else return recursionCount(s, l+1, r-1)+1;
	}
	
	public static int isPalindrome(String[] s) {
		return recursion(s, 0, s.length-1);
	}
	
	public static int isPalindromeCount(String[] s) {
		return recursionCount(s, 0, s.length-1);
	}
}

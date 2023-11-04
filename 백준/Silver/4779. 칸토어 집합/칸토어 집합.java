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
		
		String input = "";
		
		while((input = br.readLine())!=null) {
			 int N = Integer.parseInt(input);
			 String[] set = new String[(int)Math.pow(3, N)];
			 for(int i=0;i<set.length;i++) {
				 set[i]="-";
			 }
			 cator(set, 0, set.length-1);
			 for(String i : set) {
				 bw.write(i+"");
			 }
			 bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	} 
	
	public static void cator(String[] n, int start, int end) {
		if(start==end) return;
		int divide = (end-start+1)/3;
		int firstPoint = start + divide;
		int secondPoint = firstPoint + divide;
		for(int i=firstPoint;i<secondPoint;i++) {
			n[i]=" ";
		}
		cator(n,start, firstPoint-1);
		cator(n,secondPoint, end);
		
	}
}
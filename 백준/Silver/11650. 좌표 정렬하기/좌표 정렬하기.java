import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] xy = new String[N];
		for(int i=0;i<N;i++) {
			xy[i] = br.readLine();
		}
		
		Arrays.sort(xy, new Comparator<String>() {
			public int compare(String s1, String s2) {
				StringTokenizer st1 = new StringTokenizer(s1);
				StringTokenizer st2 = new StringTokenizer(s2);
				int x1 = Integer.parseInt(st1.nextToken());
				int y1 = Integer.parseInt(st1.nextToken());
				int x2 = Integer.parseInt(st2.nextToken());
				int y2 = Integer.parseInt(st2.nextToken());
				
				if(x1==x2) return y1-y2;
				else return x1-x2;
			}
		});
		
		for(String i : xy) {
			System.out.println(i);
		}
	}
}
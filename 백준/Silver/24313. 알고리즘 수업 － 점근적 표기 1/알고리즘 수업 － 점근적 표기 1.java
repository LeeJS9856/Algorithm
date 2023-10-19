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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		
		if(a1<0) {
			if(a0<=0) System.out.println(1);
			else if(a1*n0+a0<=c*n0) System.out.println(1);
			else System.out.println(0);
		}
		else if(a1>0) {
			if(a0<=0&&c>=a1) System.out.println(1);
			else if(a0>=0&&c>=a1&&a1*n0+a0<=c*n0) System.out.println(1);
			else System.out.println(0);
		}
		else {
			if(a0<=0) System.out.println(1);
			else if(a1*n0+a0<=c*n0) System.out.println(1);
			else System.out.println(0);
		}
	}
}
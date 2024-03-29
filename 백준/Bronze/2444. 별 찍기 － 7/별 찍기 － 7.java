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
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) {
			for(int j=N-i;j>0;j--) {bw.write(" ");}
			for(int k=1;k<=2*i-1;k++) {bw.write("*");}
			bw.write("\n");
		}
		for(int i=N-1;i>=1;i--) {
			for(int j=0;j<N-i;j++) {bw.write(" ");}
			for(int k=2*i-1;k>=1;k--) {bw.write("*");}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
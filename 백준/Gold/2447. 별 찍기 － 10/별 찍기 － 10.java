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
		
		int N = Integer.parseInt(br.readLine());
		String[][] square = new String[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				square[i][j] = "*";
			}
		}
		pattern(square, 0, 0, N);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(square[i][j]+"");;
			}
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
	} 
	
	public static void pattern(String[][] square, int x, int y, int N) {
		if(N==1) return;
		N = N/3;
		for(int i=x+N;i<x+2*N;i++) {
			for(int j=y+N;j<y+2*N;j++) {
				square[i][j] = " ";
			}
		}
		for(int i=x;i<=x+2*N;i+=N) {
			for(int j=y;j<=y+2*N;j+=N) {
				pattern(square, i, j, N);
			}
		}
	}
}
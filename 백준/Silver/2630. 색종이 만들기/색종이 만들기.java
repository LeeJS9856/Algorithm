import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main {
	static int[][] table;
	static int[] count = new int[2]; //0,1의 개수
		public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		table = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				table[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divide(N, 0, 0);
		bw.write(count[0] + "\n" + count[1]+"\n");
		
		bw.flush();
		bw.close();
	}
		
		public static int divide(int N, int X, int Y) {
			int sum = 0;
			
			if(N==1) {
				if(table[X][Y] == 0) {
					count[0] += 1;
					return 0;
				}
				else {
					count[1] += 1;
					return 1;
				}
			}
			
			sum = divide(N/2, X, Y) + divide(N/2, X+N/2, Y+N/2) +
					divide(N/2, X, Y+N/2) + divide(N/2, X+N/2, Y);
			
			if(sum == N*N) {
				count[1] -= 3;
			}
			else if (sum==0) {
				count[0] -= 3;
			}
			
			return sum;
	}
}
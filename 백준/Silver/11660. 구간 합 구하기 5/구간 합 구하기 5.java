import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N M 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//입력값의 합을 테이블에 저장
		int[][] table = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				int number = Integer.parseInt(st2.nextToken());
				if(j==0) table[i][j] = number;
				else table[i][j] = table[i][j-1] + number;
			}
		}
		
		//x1, x2, y1, y2 M번 입력
		
		for(int i=0;i<M;i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st3.nextToken())-1;
			int y1 = Integer.parseInt(st3.nextToken())-1;
			int x2 = Integer.parseInt(st3.nextToken())-1;
			int y2 = Integer.parseInt(st3.nextToken())-1;
			
			int sum = 0;
			for(int j=x1;j<=x2;j++) {
				if(y1==0) sum += table[j][y2];
				else sum += table[j][y2] - table[j][y1-1];
			}
			
			bw.write(sum+"\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}
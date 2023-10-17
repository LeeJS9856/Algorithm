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
		
		String NM = br.readLine();
		StringTokenizer st = new StringTokenizer(NM);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] matrixA = new int[N][M];
		for(int i=0;i<N;i++) {
			String[] row = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				matrixA[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int[][] matrixB = new int[N][M];
		for(int i=0;i<N;i++) {
			String[] row = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				matrixB[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int[][] matrixC = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
				bw.write(matrixC[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
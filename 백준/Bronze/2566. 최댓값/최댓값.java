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
		
		int[][] matrix = new int[9][9];
		int max = 0;
		int maxRow = 0, maxCol = 0;
		for(int i=0;i<9;i++) {
			String[] row = br.readLine().split(" ");
			for(int j=0;j<9;j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
				if(matrix[i][j] >= max) {
					max = matrix[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		bw.write(max + "\n");
		bw.write((maxRow+1) + " " + (maxCol+1) + "\n");
		bw.flush();
		bw.close();
	}
}
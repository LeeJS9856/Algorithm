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
		
		int[][] table = new int[100][100];
		
		int number = Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int a = x-1; a<x+9;a++) {
				for(int b=y-1;b<y+9;b++) {
					table[a][b] = 1;
				}
			}
		}
		
		int count = 0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(table[i][j]==1) count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
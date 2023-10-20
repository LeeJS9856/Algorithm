import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[][] NM = new String[N][M];
		for(int i=0;i<N;i++) {
			String[] row = br.readLine().split("");
			for(int j=0;j<M;j++) {
				NM[i][j] = row[j];
			}
		}
		
		List<Integer> count = new ArrayList<>();
		for(int x=0;x<=N-8;x++) {
			for(int y=0;y<=M-8;y++) {
				String[][] Chess = new String[8][8];
				
				for(int i=x;i<x+8;i++) {
					for(int j=y;j<y+8;j++) {
						Chess[i-x][j-y] = NM[i][j];
					}
				}
				
				count.add(drawColor(Chess));
			}
		}
		count.sort(Comparator.naturalOrder());
		System.out.println(count.get(0));
	}
	
	public static int drawColor(String[][] list) {
		String[] WB = "WBWBWBWB".split("");
		String[] BW = "BWBWBWBW".split("");
		
		int wb = 0, bw = 0; //wb, bw로 시작하는 경우의 바꿔야하는 정사각형의 갯수 카운트
		for(int m=0;m<8;m++) {
			if((m+2)%2==0) {
				for(int n=0;n<8;n++) {
					if(list[m][n].equals(WB[n])!=true) wb++; 
					if(list[m][n].equals(BW[n])!=true) bw++; 
				}
			}
			if((m+2)%2==1) {
				for(int n=0;n<8;n++) {
					if(list[m][n].equals(BW[n])!=true) wb++; 
					if(list[m][n].equals(WB[n])!=true) bw++; 
				}
			}
		}
		
		return Math.min(bw, wb);
	}
}
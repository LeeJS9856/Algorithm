import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main {
	static int[][][] list;

	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		list = new int[21][21][21];
		
		while(true) {
			
		StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==-1&&b==-1&&c==-1) break;
			
			bw.write("w("+a+", "+b+", "+c+") = "+ w(a,b,c)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int w(int a, int b, int c) {
		if(a<=0||b<=0||c<=0) {
			a=0;
			b=0;
			c=0;
		}
		if(a>20||b>20||c>20) {
			a=20;
			b=20;
			c=20;
		}
		
		for(int x=0;x<=a;x++) {
			for(int y=0;y<=b;y++) {
				for(int z=0;z<=c;z++) {
					if(x==0||y==0||z==0) {
						list[x][y][z] = 1;
					}
					else if(x<y&&y<z) {
						list[x][y][z] = list[x][y][z-1] + list[x][y-1][z-1] - list[x][y-1][z];
					}
					else {
						list[x][y][z] = list[x-1][y][z]+list[x-1][y-1][z] + list[x-1][y][z-1] - list[x-1][y-1][z-1];
					}
				}
			
			}
		
		}
		
		return list[a][b][c];
	}
}
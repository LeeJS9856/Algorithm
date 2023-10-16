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
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String RS = br.readLine();
			StringTokenizer st = new StringTokenizer(RS);
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			String[] splitS = S.split("");
			for(int j=0;j<splitS.length;j++) {
				for(int k=0;k<R;k++) {
					bw.write(splitS[j]);
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
		
	}
}
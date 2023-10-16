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
		String nx = br.readLine();
		StringTokenizer st = new StringTokenizer(nx);
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		String A = br.readLine();
		StringTokenizer st2 = new StringTokenizer(A);
		for(int i=0;i<n;i++) {
			int tmp = Integer.parseInt(st2.nextToken());
			if(tmp < x) {
				bw.write(tmp + " ");
			}
		}
		bw.flush();
		bw.close();
		
	}
}
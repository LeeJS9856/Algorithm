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
		
		String number = br.readLine();
		StringTokenizer st = new StringTokenizer(number);
		
		int[] chess = {1,1,2,2,2,8};
		for(int i=0;i<6;i++) {
			int A = Integer.parseInt(st.nextToken());
			bw.write(chess[i]-A + " ");
		}
		bw.flush();
		bw.close();
	}
}
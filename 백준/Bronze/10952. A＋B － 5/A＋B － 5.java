import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] arg) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A=-1, B=-1;
		while(true) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if(A!=0 || B!=0) bw.write(A+B+"\n");
			else break;
		}
		bw.flush();
		bw.close();
	}
}
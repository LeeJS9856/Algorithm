import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sideDot = 2;
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			sideDot = sideDot*2-1;
		}
		bw.write(sideDot*sideDot+"\n");
		bw.flush();
		bw.close();
	}
}
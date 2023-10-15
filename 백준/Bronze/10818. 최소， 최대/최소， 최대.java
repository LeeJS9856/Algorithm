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
		int N = Integer.parseInt(br.readLine());
		String numberList = br.readLine();
		StringTokenizer st = new StringTokenizer(numberList);
		int min=0, max = 0;
		for(int i=0;i<N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(i==0) {
				min = tmp;
				max = tmp;
			}
			if(tmp>max) max = tmp;
			if(tmp<min) min = tmp;
		}
		
		bw.write(min + " " + max + "\n");
		bw.flush();
		bw.close();
	}
}
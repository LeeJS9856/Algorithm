import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String number = br.readLine();
		StringTokenizer st = new StringTokenizer(number);
		int count = 0;
		for(int i=0;i<N;i++) {
			int dicimal = Integer.parseInt(st.nextToken());
			int toggle = 0;
			for(int j=2;j<dicimal;j++) {
				if(dicimal%j==0) toggle = 1;
			}
			if(toggle == 0&&dicimal!=1) count++;
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();
	}
	
}
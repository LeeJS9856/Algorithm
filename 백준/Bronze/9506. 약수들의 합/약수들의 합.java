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
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==-1) break;
			
			int sum = 0;
			List<Integer> divisor = new ArrayList<>();
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					divisor.add(i);
					sum = sum + i;
				}
			}
			if(sum == n) {
				bw.write(n + " = " + divisor.get(0));
				for(int i=1;i<divisor.size();i++) {
					bw.write(" + " + divisor.get(i));
				}
				bw.write("\n");
			}
			else bw.write(n + " is NOT perfect.\n");
			
		}
		bw.flush();
		bw.close();
	}
	
}
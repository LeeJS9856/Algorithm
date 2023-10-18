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
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> divisor = new ArrayList<>();
		int sum = 0;
		for(int i = M;i<=N;i++) {
			int toggle = 0;
			for(int j=2;j<i;j++) {
				if(i%j==0) toggle = 1;
			}
			if(i==1) toggle = 1;
			if(toggle == 0) {
				divisor.add(i); 
				sum = sum + i;
			}
		}
		if(divisor.size()==0) bw.write(-1+"\n");
		else {
			divisor.sort(Comparator.naturalOrder());
			bw.write(sum + "\n" + divisor.get(0));
		}
		bw.flush();
		bw.close();
		
	}
	
}
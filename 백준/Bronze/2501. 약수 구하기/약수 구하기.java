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
		
		String NK = br.readLine();
		StringTokenizer st = new StringTokenizer(NK);
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> divisor = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			if(N%i==0) divisor.add(i);
		}
		
		if(K>divisor.size()) bw.write(0+"\n");
		else bw.write(divisor.get(K-1)+"\n");
		bw.flush();
		bw.close();
	}
	
}
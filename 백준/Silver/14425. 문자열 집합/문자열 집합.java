import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> wordSet = new HashSet<String>();
		for(int i=0;i<N;i++) {
			wordSet.add(br.readLine());
		}
		
		int count= 0;
		for(int i=0;i<M;i++) {
			if(wordSet.contains(br.readLine())) count++;
		}
		bw.write(count+"");
		
		bw.flush();
		bw.close();
	}

}

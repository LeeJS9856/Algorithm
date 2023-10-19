import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		for(int i=0;i<N;i++) {
			String xy = br.readLine();
			StringTokenizer st = new StringTokenizer(xy);
			x.add(Integer.parseInt(st.nextToken()));
			y.add(Integer.parseInt(st.nextToken()));
		}
		
		bw.write((Collections.max(x)-Collections.min(x))*(Collections.max(y)-Collections.min(y))+"\n");
		bw.flush();
		bw.close();
	}
	
}
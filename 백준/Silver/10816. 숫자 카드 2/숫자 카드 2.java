import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> cardMap = new HashMap();
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(st.nextToken());
			if(cardMap.containsKey(x)) {
				cardMap.put(x, cardMap.get(x)+1);
			}
			else cardMap.put(x, 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int y = Integer.parseInt(st2.nextToken());
			if(cardMap.containsKey(y)) bw.write(cardMap.get(y)+" ");
			else bw.write(0+" ");
		}
		bw.flush();
		bw.close();
		
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> original = new ArrayList<>();
		List<Integer> sorted = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int number = Integer.parseInt(st.nextToken());
			original.add(number);
			sorted.add(number);
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		sorted.sort(Comparator.naturalOrder());
		
		int rank = 0;
		for(int i : sorted) {
			if(map.containsKey(i)!=true) {
				map.put(i, rank);
				rank++;
			}
		}
		
		for(int i : original) {
			int ranking = map.get(i);
			bw.write(ranking + " ");
		}
		
		bw.flush();
		bw.close();
	}

}
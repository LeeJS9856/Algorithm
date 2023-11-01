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
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> divisor = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			divisor.add(Integer.parseInt(st.nextToken()));
		}
		divisor.sort(Comparator.naturalOrder());
		
		long res = divisor.get(0)*divisor.get(divisor.size()-1);
		bw.write(res+"");
		bw.flush();
		bw.close();
	}
}
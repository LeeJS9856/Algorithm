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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> len = new ArrayList<>();
		for(int i = 0; i<3;i++) {
			len.add(Integer.parseInt(st.nextToken()));
		}
		
		len.sort(Comparator.naturalOrder());
		if(len.get(0)+len.get(1)<=len.get(2)) {
			len.set(2,len.get(0)+len.get(1)-1 );
		}
		
		bw.write((len.get(0)+len.get(1)+len.get(2))+"\n");
		bw.flush();
		bw.close();
		
	}
}
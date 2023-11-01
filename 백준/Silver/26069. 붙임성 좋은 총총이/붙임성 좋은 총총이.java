import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Set<String> name = new HashSet<>();
		name.add("ChongChong");
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			
			if(name.contains(A)&&!name.contains(B)) {
				name.add(B);
			}
			else if(!name.contains(A)&&name.contains(B)) {
				name.add(A);
			}
		}
		bw.write(name.size()+"");
		
		bw.flush();
		bw.close();
	}
}
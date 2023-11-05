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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		com(N, M, list);
	} 
	
	public static void com(int n, int m, List<Integer> list) {
		if(m==0) {
			for(int i : list) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!list.contains(i)) {
				list.add(i);
				com(n, m-1, list);
				list.remove(list.size()-1);
			}
		}
	}
}
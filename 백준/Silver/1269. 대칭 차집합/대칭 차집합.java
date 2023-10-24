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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Set<Integer> ASet = new HashSet<>();
		Set<Integer> BSet = new HashSet<>();
		
		StringTokenizer sta = new StringTokenizer(br.readLine());
		for(int i=0;i<a;i++) {
			ASet.add(Integer.parseInt(sta.nextToken()));
		}
		
		int count = 0;
		StringTokenizer stb = new StringTokenizer(br.readLine());
		for(int i=0;i<b;i++) {
			int input = Integer.parseInt(stb.nextToken());
			BSet.add(input);
			if(ASet.contains(input)) count++;
		}
		
		bw.write((ASet.size()+BSet.size()-count*2)+"");
		bw.flush();
		bw.close();
		
	}

}
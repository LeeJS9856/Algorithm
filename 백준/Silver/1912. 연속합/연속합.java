import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
	static int[] seq;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		seq = new int[N];
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			seq[i] = num;
		}
		bw.write(func()+"");
		bw.flush();
		bw.close();
		
	}
	public static int func() {
		int[] array = new int[N];
		int max = 0;
		array[0] = max = seq[0];
		for(int i=1;i<N;i++) {
			array[i] = Math.max(array[i-1] + seq[i], seq[i]);
			max = Math.max(max, array[i]);
		}
		return max;
	}
}
	
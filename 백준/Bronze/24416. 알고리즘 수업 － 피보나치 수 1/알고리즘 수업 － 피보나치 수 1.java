import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] count = {1,0};
		fibo(n,count);
		fibonacci(n,count);
		bw.write(count[0]+" "+ count[1]);
		bw.flush();
		bw.close();
	}
	
	public static int fibo(int n, int[] count) {
		if(n==1||n==2) return 1;
		else {
			count[0]++;
			return (fibo(n-1, count)+fibo(n-2, count));
		}
	}
	
	public static int fibonacci(int n, int[] count) {
		List<Integer> f = new ArrayList<>();
		f.add(1);
		f.add(1);
		for(int i=3;i<=n;i++) {
			f.add(f.get(i-2)+f.get(i-3));
			count[1]++;
		}
		return f.get(n-1);
	}
}
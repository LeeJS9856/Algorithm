import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<K;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) stack.pop();
			else stack.push(x);
		}
		
		int sum = 0;
		for(int i : stack) {
			sum+=i;
		}
		bw.write(sum+"");
		
		bw.flush();
		bw.close();
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> A = new ArrayList<>();
		StringTokenizer stA = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A.add(Integer.parseInt(stA.nextToken()));
		}
		
		Stack<Integer> B = new Stack<>();
		int stackElement = 0;
		StringTokenizer stB = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(stB.nextToken());
			if(A.get(i)==0) {
				B.push(input);
				stackElement++;
			}
		}
		
		Queue<Integer> C = new LinkedList<>();
		for(int i=0;i<stackElement;i++) {
			C.add(B.pop());
		}
		int M = Integer.parseInt(br.readLine());
		StringTokenizer stC = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			C.add(Integer.parseInt(stC.nextToken()));
		}
		
		
		
		for(int i=0;i<M;i++) {
			bw.write(C.poll()+" ");
		}
		
		bw.flush();
		bw.close();
	}

}
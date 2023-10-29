import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> people = new LinkedList<>();
		Queue<Integer> list = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			people.add(i);
		}
		while(!people.isEmpty()) {
			for(int i=0;i<K-1;i++) {
				people.add(people.poll());
			}
			list.add(people.poll());
		}
		
		bw.write("<"+list.poll());
		while(!list.isEmpty()) {
			bw.write(", "+list.poll());
		}
		bw.write(">");
		
		bw.flush();
		bw.close();

	}

}

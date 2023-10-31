import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> balloon = new ArrayDeque<>();
		Deque<Integer> number = new ArrayDeque<>();
		for(int i=1;i<=N;i++) {
			balloon.addLast(Integer.parseInt(st.nextToken()));
			number.addLast(i);
		}
		int mission = balloon.pollFirst();
		bw.write(number.pollFirst()+" ");
		for(int i=0;i<N-1;i++) {
			if(mission>0) {
				for(int j=0;j<mission-1;j++) {
					balloon.offerLast(balloon.pollFirst());
					number.offerLast(number.pollFirst());
				}
				mission = balloon.pollFirst();
				bw.write(number.pollFirst()+" ");
			}
			else {
				for(int j=0;j<(mission*-1)-1;j++) {
					balloon.offerFirst(balloon.pollLast());
					number.offerFirst(number.pollLast());
				}
				mission = balloon.pollLast();
				bw.write(number.pollLast()+" ");
			}	
		}
		bw.flush();
		bw.close();

	}

}

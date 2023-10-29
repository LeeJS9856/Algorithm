import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> card = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			card.add(i);
		}
		while(N!=1) {
			card.remove();
			if(card.size()==1) break;
			int upper = card.poll();
			card.add(upper);
		}
		bw.write(card.poll()+"");
		
		bw.flush();
		bw.close();

	}

}
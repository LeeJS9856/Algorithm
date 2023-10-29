import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> deck = new HashMap<>();
		int head = 0;
		int tail = 1;
		
		for(int i=0;i<N;i++) {
			String[] command = br.readLine().split(" ");
			switch(Integer.parseInt(command[0])) {
				case 1 :
					int X = Integer.parseInt(command[1]);
					deck.put(head, X);
					head--;
					break;
				case 2 :
					int Y = Integer.parseInt(command[1]);
					deck.put(tail, Y);
					tail++;
					break;
				case 3:
					if(deck.size()==0) bw.write(-1+"\n");
					else {
						bw.write(deck.get(head+1)+"\n");
						deck.remove(head+1);
						head++;
					}
					break;
				case 4:
					if(deck.size()==0) bw.write(-1+"\n");
					else {
						bw.write(deck.get(tail-1)+"\n");
						deck.remove(tail-1);
						tail--;
					}
					break;
				case 5:
					bw.write(deck.size()+"\n");
					break;
				case 6:
					if(deck.size()==0) bw.write(1+"\n");
					else bw.write(0+"\n");
					break;
				case 7:
					if(deck.size()==0) bw.write(-1+"\n");
					else {
						bw.write(deck.get(head+1)+"\n");
					}
					break;
				case 8:
					if(deck.size()==0) bw.write(-1+"\n");
					else {
						bw.write(deck.get(tail-1)+"\n");
					}
					break;
			}
		}
		bw.flush();
		bw.close();

	}

}
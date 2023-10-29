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
		Map<Integer, Integer> que = new HashMap<>();
		int head = 0;
		int tale = 0;
		for(int i=0;i<N;i++) {
			String[] command = br.readLine().split(" ");
			switch(command[0]) {
				case "push" :
					int X = Integer.parseInt(command[1]);
					que.put(tale, X);
					tale++;
					break;
				case "pop"	:
					if(que.size()==0) bw.write(-1+"\n");
					else {
						bw.write(que.get(head)+"\n");
						que.remove(head);
						head++;
					}
					break;
				case "size"	:
					bw.write(que.size()+"\n");
					break;
				case "empty" :
					if(que.isEmpty()) bw.write(1+"\n");
					else bw.write(0+"\n");
					break;
				case "front" :
					if(que.size()==0) bw.write(-1+"\n");
					else {
						bw.write(que.get(head)+"\n");
					}
					break;
				case "back" :
					if(que.size()==0) bw.write(-1+"\n");
					else {
						bw.write(que.get(tale-1)+"\n");
					}
					break;
			}
			          
		}
		
		bw.flush();
		bw.close();

	}

}

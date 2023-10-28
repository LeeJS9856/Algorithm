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
		Map<Integer, Integer> stack = new HashMap<>();
		for(int i=0;i<N;i++) {
			String[] C = br.readLine().split(" ");
			int command = Integer.parseInt(C[0]);
			switch(command) {
				case 1: 
					stack.put(stack.size(),Integer.parseInt(C[1]));
					break;
				case 2:
					if(stack.size()==0) bw.write(-1+"\n");
					else {
						bw.write(stack.get(stack.size()-1)+"\n");
						stack.remove(stack.size()-1);
					}
					break;
				case 3:
					bw.write(stack.size()+"\n");
					break;
				case 4:
					if(stack.size()==0) bw.write(1+"\n");
					else bw.write(0+"\n");
					break;
				case 5:
					if(stack.size()==0) bw.write(-1+"\n");
					else {
						bw.write(stack.get(stack.size()-1)+"\n");
					}
					break;
			}
		}
		
		
		bw.flush();
		bw.close();
	}

}
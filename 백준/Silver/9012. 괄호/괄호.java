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
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			Stack<Integer> VPS = new Stack<>();
			String[] input = br.readLine().split("");
			for(int j=0;j<input.length;j++) {
				if(input[j].equals("(")) VPS.push(0);
				else if(input[j].equals(")")) {
					if(VPS.isEmpty()) {
						VPS.push(1);
						break;
					}
					else VPS.pop();
				}
			}
			
			if(VPS.isEmpty()) bw.write("YES"+"\n");
			else bw.write("NO"+"\n");
		}
		bw.flush();
		bw.close();
	}

}
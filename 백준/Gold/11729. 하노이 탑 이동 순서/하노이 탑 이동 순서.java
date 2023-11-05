import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, N)-1+"\n");
		hanoi(N, 1,2,3, bw);
		bw.flush();
		bw.close();
	} 
	
	public static void hanoi(int number, int from, int by, int to, BufferedWriter bw) throws IOException{ 
		if(number==1) {
			bw.write(from+" "+to+"\n");
		}
		else {
			hanoi(number-1, from, to, by, bw);
			bw.write(from+" "+to+"\n");
			hanoi(number-1, by, from, to, bw);
		}

	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> line = new Stack<>();
		int count=1;
		for(int i=1;i<=N;i++) {
			int student = Integer.parseInt(st.nextToken());
			int stuToggle = 1;
			
			
			while(true) {
				if(stuToggle==0) {
					if(line.isEmpty()||line.peek()!=count) break;
					else {
						line.pop();
						count++;
					}
				}
				else {
					if(student==count) {
						if(line.isEmpty()) {
							count++;
							break;
						}
						else if(line.peek()!=count) {
							count++;
							stuToggle = 0;
						}
						else {
							System.out.println("error");
						}
					}
					else {
						if(line.isEmpty()||line.peek()!=count) {
							line.push(student);
							break;
						}
						else {
							line.pop();
							count++;
						}
					}
				}
			}
		}
		if(line.isEmpty()) System.out.println("Nice");
		else System.out.println("Sad");
		bw.flush();
		bw.close();
	}

}
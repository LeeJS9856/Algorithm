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
		
		while(true) {
			String[] input = br.readLine().split("");
			if(input.length==1&&input[0].equals(".")) break;
			
			Stack<String> stack = new Stack<>();
			for(String i : input) {
				if(i.equals("(")) stack.push("(");
				else if(i.equals("[")) stack.push("[");
				else if(i.equals(")")) {
					if(stack.size()==0 || stack.peek().equals("[")) {
						stack.push("no");
						break;
					}
					else stack.pop();
				}
				else if(i.equals("]"))
					if(stack.size()==0 || stack.peek().equals("(")) {
						stack.push("no");
						break;
					}
					else stack.pop();
			}
			
			if(stack.size()==0) bw.write("yes"+"\n");
			else if(stack.pop().equals("no")) bw.write("no"+"\n");
			else bw.write("no"+"\n");
			
		}
		bw.flush();
		bw.close();
	}

}
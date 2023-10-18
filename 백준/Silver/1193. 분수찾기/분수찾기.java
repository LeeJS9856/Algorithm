import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		int count = 1;
		int number = 1;
		while(X>=number+count) {
			number = number + count;
			count++;
		}
		
		int a = X-number+1;
		
		if(count%2==0) {
			bw.write(a+"/"+(count-a+1)+"\n");
		}
		else {
			bw.write((count-a+1)+"/"+a+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int maxNum = 0, maxCount = 0;
		for(int i=1;i<=9;i++) {
			int number = Integer.parseInt(br.readLine());
			if(number>maxNum) {
				maxNum = number;
				maxCount = i;
			}
		}
		bw.write(maxNum + "\n" + maxCount + "\n");
		bw.flush();
		bw.close();
	}
}
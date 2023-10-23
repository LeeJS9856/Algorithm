import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] numberList = new int[10000];
		Arrays.fill(numberList, 0);
		for(int i=0;i<N;i++) {
			numberList[Integer.parseInt(br.readLine())-1]++;
		}
		
		for(int i=0;i<10000;i++) {
			if(numberList[i]!=0) {
				for(int j=0;j<numberList[i];j++)bw.write((i+1)+"\n");;
			}
		}
		
		bw.flush();
		bw.close();
	}
}

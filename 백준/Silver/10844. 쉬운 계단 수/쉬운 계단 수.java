import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = {0,1,1,1,1,1,1,1,1,1}; //0123456789
		long[] newArr = new long[10];
		
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<10;j++) {
				if(j==0) newArr[1] = newArr[1] + arr[0];
				else if(j==9) newArr[8] = newArr[8] + arr[9];
				else {
					newArr[j-1] = newArr[j-1] + arr[j];
					newArr[j+1] = newArr[j+1] + arr[j];
				}
			}
			for(int j=0;j<10;j++) {
				arr[j] = newArr[j]%(long)Math.pow(10, 9);
				newArr[j] = 0;
			}
		}
		long sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum%(long)Math.pow(10, 9) + arr[i];
		}
		bw.write(sum%(long)Math.pow(10, 9)+"");
		bw.flush();
		bw.close();
		
	}
}
	
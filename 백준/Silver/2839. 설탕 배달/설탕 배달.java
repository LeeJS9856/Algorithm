import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int five = 0, three = 0;
		
		while(true) {
			if((N-three*3)%5==0) {
				while(true) {
					if((three*3+five*5)==N) {
						System.out.println(three+five);
						break;
					}
					five++;
				}
				break;
			}
			else if(3*three==N) {
				System.out.println(three);
				break;
			}
			else if(3*three>N) {
				System.out.println(-1);
				break;
			}
			three++;
		}
		
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> generator = new ArrayList<>();
		if(N>55) {
			for(int i=N-55;i<N;i++) {
				String[] number = String.valueOf(i).split("");
				int sum = 0;
				for(int j=0;j<number.length;j++) {
					sum = sum + Integer.parseInt(number[j]);
				}
				if(i+sum == N) generator.add(i);
			}
		}
		else {
			for(int i=0;i<N;i++) {
				String[] number = String.valueOf(i).split("");
				int sum = 0;
				for(int j=0;j<number.length;j++) {
					sum = sum + Integer.parseInt(number[j]);
				}
				if(i+sum == N) generator.add(i);
			}
		}
		generator.sort(Comparator.naturalOrder());
		
		if(generator.size() == 0) System.out.println(0);
		else System.out.println(generator.get(0));
	}
}
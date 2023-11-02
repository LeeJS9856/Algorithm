import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> average = new ArrayList<>();
		List<Integer> frequence = new ArrayList<>();
		int sum = 0;
		
		
		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(br.readLine());
			average.add(input);
			sum += input;
			
		}
		
		average.sort(Comparator.naturalOrder());
		frequence.sort(Comparator.naturalOrder());
		
		int frequency = 0;
		int stack = 0;
		int save = average.get(0);
		for(int i : average) {
			if(i == save) {
				stack++;
			}	
			else {
				save = i;
				stack = 1;
			}
			
			if(stack==frequency) {
				frequence.add(i);
			}
			else if(stack>frequency) {
				frequence.clear();
				frequence.add(i);
				frequency = stack;
			}
		}
		
		
		bw.write(Math.round((float)sum/N)+"\n");
		bw.write(average.get((N-1)/2)+"\n");
		if(frequence.size()>=2) bw.write(frequence.get(1)+"\n");
		else bw.write(frequence.get(0)+"\n");
		bw.write(average.get(N-1)-average.get(0)+"\n\n");
		bw.flush();
		bw.close();
	}
}
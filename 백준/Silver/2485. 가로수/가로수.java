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
		List<Integer> intervalList = new ArrayList<>();
		int save = 0;
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(br.readLine());
			if(i!=0) intervalList.add(x-save);
			save = x;
		}
		intervalList.sort(Comparator.naturalOrder());
		int divisor = 1;
		for(int i=0;i<intervalList.size();i++) {
			if(i==0) divisor = intervalList.get(0);
			else {
				if(intervalList.get(i)%divisor!=0) divisor = minDivisor(intervalList.get(i), divisor);
			}
			
			if(divisor==1) break;
		}
		
		int sum=0;
		for(int i : intervalList) {
			sum = sum + i/divisor -1;
		}
		
		bw.write(sum+"");
		bw.flush();
		bw.close();
		
	}
	
	public static int minDivisor(int numberA, int numberB) {
		int div = 1;
		for(int i=2;i<=Math.min(numberA, numberB);i++) {
			if(numberA%i==0 && numberB%i==0) {
				div = i;
			}
		}
		return div;
	}

}
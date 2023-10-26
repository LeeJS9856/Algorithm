import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Boolean> primeList = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);
		for(int i=2;i<Math.pow(10, 6);i++) {
			primeList.add(i,true);
		}
		for(int i=2;i<=Math.pow(10,3);i++) {
			if(primeList.get(i)) {
				for(int j= i*i;j<Math.pow(10, 6);j+=i) primeList.set(j, false);
			}
		}
		

		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			if(N==4) {
				bw.write(1+"\n");
				continue;
			}
			int mid = N/2;
			int times = (mid-1)/2;
			int a=mid, b=mid;
			if(mid%2==0) {
				a=mid-1;
				b=mid+1;
				times = (mid-2)/2;
			}
			int count=0;
			for(int j=0;j<times;j++) {
				if(primeList.get(a)&&primeList.get(b)) count++;
				a-=2;
				b+=2;
			}

			bw.write(count+"\n");

		}
		bw.flush();
		bw.close();
	}
}
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String NM = br.readLine();
		StringTokenizer st = new StringTokenizer(NM);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> numberList = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			numberList.add(i);
		}
		
		for(int i=0;i<M;i++) {
			List<Integer> tmpList = new ArrayList<>();
			String IJ = br.readLine();
			StringTokenizer st2 = new StringTokenizer(IJ);
			int I = Integer.parseInt(st2.nextToken());
			int J = Integer.parseInt(st2.nextToken());
			
			int count = I;
			for(int x=I;x<=J;x++) {
				tmpList.add(numberList.get(x-1));
			}
			for(int y=tmpList.size()-1;y>=0;y--) {
				numberList.set(count-1, tmpList.get(y));
				count++;
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(numberList.get(i)+" ");
		}
		bw.flush();
		bw.close();
	}
}
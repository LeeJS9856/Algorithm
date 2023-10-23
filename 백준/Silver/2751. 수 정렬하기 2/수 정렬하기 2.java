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
		List<Integer> numberList = new ArrayList<>();
		for(int i=0;i<N;i++) {
			numberList.add(Integer.parseInt(br.readLine()));
		}
		
		numberList.sort(Comparator.naturalOrder());
		for(int i=0;i<N;i++) {
			bw.write(numberList.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
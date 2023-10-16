import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		List<Integer> studentList = new ArrayList<>();
		for(int j=1;j<=30;j++) {
			studentList.add(j);
		}
		
		for(int i=0;i<28;i++) {
			int n = Integer.parseInt(br.readLine());
			studentList.removeAll(Arrays.asList(n));
		}
		
		Collections.sort(studentList);
		bw.write(studentList.get(0) + "\n" + studentList.get(1) + "\n");
		bw.flush();
		bw.close();
	}
}
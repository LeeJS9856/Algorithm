import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Set<String> emp = new HashSet<String>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String empName = st.nextToken();
			String access = st.nextToken();
			if(access.equals("enter")) emp.add(empName);
			else if(access.equals("leave")) emp.remove(empName);
		}
		
		List<String> empList = new ArrayList<>();
		for(String i : emp) {
			empList.add(i);
		}
		empList.sort(Comparator.reverseOrder());
		for(String i : empList) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}

}
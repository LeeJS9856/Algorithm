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
		
		while(true) {
			String tri = br.readLine();
			StringTokenizer st = new StringTokenizer(tri);
			List<Integer> point = new ArrayList<>();
			for(int i=0;i<3;i++) {
				point.add(Integer.parseInt(st.nextToken()));
			}
			point.sort(Comparator.naturalOrder());
		
			if(point.get(0)==0&&point.get(2)==0) break;
			else if(point.get(0)+point.get(1)<=point.get(2)) bw.write("Invalid\n");
			else if(point.get(0).equals(point.get(1))&&point.get(1).equals(point.get(2))) bw.write("Equilateral\n");
			else if(point.get(1).equals(point.get(2))||point.get(0).equals(point.get(1))) bw.write("Isosceles\n");
			else bw.write("Scalene\n");
		}
	
		bw.flush();
		bw.close();
	}
}
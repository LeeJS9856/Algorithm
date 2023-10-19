import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i=0;i<3;i++) {
			String xy = br.readLine();
			StringTokenizer st = new StringTokenizer(xy);
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		if(x[0]==x[1]) bw.write(x[2]+" ");
		else if(x[0]==x[2]) bw.write(x[1]+" ");
		else if(x[1]==x[2]) bw.write(x[0]+" ");
		
		if(y[0]==y[1]) bw.write(y[2]+" ");
		else if(y[0]==y[2]) bw.write(y[1]+" ");
		else if(y[1]==y[2]) bw.write(y[0]+" ");
		
		bw.flush();
		bw.close();
	}
	
}
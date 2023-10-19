import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] point = new int[3];
		int sum = 0;
		for(int i=0;i<3;i++) {
			point[i] = Integer.parseInt(br.readLine());
			sum = sum + point[i];
		}
		
		if(sum != 180) bw.write("Error\n");
		else if(point[0]!=point[1]&&point[1]!=point[2]&&point[0]!=point[2]) {
			bw.write("Scalene\n");
		}
		else if(point[0]==point[1]&&point[1]==point[2]) bw.write("Equilateral\n");
		else bw.write("Isosceles\n");
	
		bw.flush();
		bw.close();
	}
}
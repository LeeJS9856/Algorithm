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
		
		List<Integer> numberList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			int number = Integer.parseInt(br.readLine());
			int rest = number%42;
			if(numberList.contains(rest) == false) {
				numberList.add(rest);
			}
		}
		bw.write(numberList.size() + "\n");
		bw.flush();
		bw.close();
	}
}
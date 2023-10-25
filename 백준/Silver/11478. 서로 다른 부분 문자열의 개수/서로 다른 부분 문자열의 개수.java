import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		Set<String> setS = new HashSet<String>();
		for(int i=0;i<S.length();i++) {
			for(int j=i;j<=S.length();j++) { 
				setS.add(S.substring(i,j));
			}
		}
		bw.write((setS.size()-1)+"\n");
		bw.flush();
		bw.close();
		
	}

}
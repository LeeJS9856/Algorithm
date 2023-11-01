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
		
		int N = Integer.parseInt(br.readLine());
		int count=0;
		Set<String> user = new HashSet<>();
		for(int i=0;i<N;i++) {
			String chat = br.readLine();
			
			if(!chat.equals("ENTER")) {
				if(!user.contains(chat)) {
					count++;
				}
				user.add(chat);
			}
			else {
				user.clear();
			}
		}
		bw.write(count+"");
		
		bw.flush();
		bw.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> pokemon = new HashMap();
		Map<Integer, String> pokemonNumber = new HashMap();
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			pokemon.put(input, i+1);
			pokemonNumber.put(i+1, input);
		}
		
		for(int i=0;i<M;i++) {
			String question = br.readLine();
			if(pokemon.containsKey(question)) bw.write(pokemon.get(question)+"\n");
			else bw.write(pokemonNumber.get(Integer.parseInt(question))+"\n");
		}
		bw.flush();
		bw.close();
		
	}

}

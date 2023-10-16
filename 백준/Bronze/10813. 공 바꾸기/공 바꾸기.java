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
		String NM = br.readLine();
		StringTokenizer st = new StringTokenizer(NM);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		for(int i = 0;i<N;i++) {
			basket[i] = i+1;
		}
		for(int j = 0;j<M;j++) {
			String exchange = br.readLine();
			StringTokenizer st2 = new StringTokenizer(exchange);
			int firstBasket = Integer.parseInt(st2.nextToken());
			int secondBasket = Integer.parseInt(st2.nextToken());
			int tmp = 0;
			tmp = basket[firstBasket-1];
			basket[firstBasket-1] = basket[secondBasket-1];
			basket[secondBasket-1] = tmp;
		}
		for(int i = 0;i<N;i++) {
			bw.write(basket[i]+" ");
		}
		bw.flush();
		bw.close();
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static Queue<Integer> numberQue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] distance = new int[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		int minPrice = 0;
		BigInteger sum = new BigInteger("0");
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			int price = Integer.parseInt(st2.nextToken());
			
			if(i==0||price<minPrice) {
				minPrice = price;
			}
			sum = sum.add(BigInteger.valueOf(minPrice).multiply(BigInteger.valueOf(distance[i])));

		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
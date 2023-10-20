import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		long five = 0;
		long three = 0;
		
		if(N%5==0) System.out.println(N/5);
		else if(N%3==0){
			five = (N-(N%15))/5;
			three = (N-five*5)/3;
			System.out.println(five+three);
		}
		else {
			int toggle = 0;
			for(int i=1;i<=4;i++) {
				if((N-3*i)%5==0&&(N-3*i)>=0) {
					five = (N-3*i)/5;
					three = i;
					toggle = 1;
					System.out.println(five+three);
				}
				
			}
			if(toggle == 0) System.out.println(-1);
			
		}
		
	}
}

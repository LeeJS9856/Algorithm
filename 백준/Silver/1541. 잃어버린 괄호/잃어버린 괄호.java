import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;



public class Main {
	static Queue<Integer> numberQue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력 
		String[] input = br.readLine().split("");
		int res = 0;
		int toggle = 0; //첫번째 수인지 아닌지 화깅ㄴ
		int sum = 0; //숫자들의 임시 합
		for(int i=0;i<input.length;i++) {
			if(input[i].equals("+")) {
				sum += MakeNumber();
			}
			else if( input[i].equals("-")) {
				sum += MakeNumber();
				if(toggle==0) {
					res = sum;
					sum=0;
					toggle = 1;
				}
				else {
					res -= sum;
					sum=0;
				}
			}
			else if(i==input.length-1) {
				numberQue.add(Integer.parseInt(input[i]));
				sum += MakeNumber();
				if(toggle==0) {
					res = sum;
					sum=0;
					toggle = 1;
				}
				else {
					res -= sum;
					sum=0;
				}

			}
			else {
				numberQue.add(Integer.parseInt(input[i]));
			}
		}
		bw.write(res+"");
		bw.flush();
		bw.close();
	}
	
	public static int MakeNumber() {
		int number = 0;
		int QueSize = numberQue.size();
		for(int i=0;i<QueSize;i++) {
			number += numberQue.poll()*Math.pow(10, QueSize-i-1);
		}
		return number;
	}
}
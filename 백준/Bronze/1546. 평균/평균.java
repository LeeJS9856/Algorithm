import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String Score = br.readLine();
		List<Integer> scoreList = new ArrayList<>();
		List<Double> newScoreList = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(Score);
		for(int i=0;i<N;i++) {
			scoreList.add(Integer.parseInt(st.nextToken()));
		}
		
		scoreList.sort(Comparator.reverseOrder());
		for(int i=0;i<scoreList.size();i++) {
			newScoreList.add((double)scoreList.get(i)*100/scoreList.get(0));
		}
		
		
		bw.write(average(newScoreList) + "\n");
		bw.flush();
		bw.close();
		
	}
	
	public static double average(List<Double> list) {
		
		double sum=0;
		double average;
		for(int i=0;i<list.size();i++) {
			sum = sum + list.get(i);
		}
		average = sum / list.size();
		
		return average;
	}
}
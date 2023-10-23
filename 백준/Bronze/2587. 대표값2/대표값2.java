import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> scoreList = new ArrayList<>();
		int sum = 0;
		for(int i=0;i<5;i++) {
			int score = Integer.parseInt(br.readLine());
			scoreList.add(score);
			sum = sum + score;
		}
		
		scoreList.sort(Comparator.naturalOrder());
		int average = sum / 5;
		System.out.println(average + "\n" + scoreList.get(2));
		
		
	}
}
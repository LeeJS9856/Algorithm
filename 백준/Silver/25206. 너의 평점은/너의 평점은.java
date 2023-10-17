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
		
		double lessonCount = 0;
		double scoreSum = 0;
		for(int i=0;i<20;i++) {
			String lesson = br.readLine();
			StringTokenizer st = new StringTokenizer(lesson);
			String name = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double point = 0;
			if(grade.equals("P")!=true) {
				lessonCount = lessonCount + score;
				scoreSum = scoreSum + (score*toPoint(grade));
			}
		}
		float average = (float)scoreSum / (float)lessonCount;
		bw.write(average + "\n");
		bw.flush();
		bw.close();
	}
	public static double toPoint(String grade) {
		switch(grade) {
		case "A+" : return 4.5;
		case "A0" : return 4.0;
		case "B+" : return 3.5;
		case "B0" : return 3.0;
		case "C+" : return 2.5;
		case "C0" : return 2.0;
		case "D+" : return 1.5;
		case "D0" : return 1.0;
		case "F" : return 0;
		}
		return 0;
	}
}
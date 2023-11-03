import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st2.nextToken());
		}
		int[] sorted = new int[A.length];
		List<Integer> list = new ArrayList<>();
		mergeSort(A, list, sorted);
		if(K<=list.size()) bw.write(list.get(K-1)+"");
		else bw.write(-1+"");
		
		bw.flush();
		bw.close();
	} 
	
	public static void mergeSort(int[] A, List<Integer> list, int[] sorted) {
		mergeSort(A, 0, A.length-1, list, sorted);
	}
	
	public static void mergeSort(int[] A, int left, int right, List<Integer> list, int[] sorted) {
		if(left==right) return;
		int mid = (left+right) / 2;
		mergeSort(A, left, mid, list, sorted);
		mergeSort(A, mid+1, right, list, sorted);
		merge(A, left, mid, right, list, sorted);
	}
	
	public static void merge(int[] A, int left, int mid, int right, List<Integer> list, int[] sorted) {
		int l = left;
		int r = mid +1;
		int idx = left;
		
		
		while(l <= mid&& r<=right) {
			if(A[l]<=A[r]) {
				sorted[idx] = A[l];
				idx++;
				l++;
			}
			else {
				sorted[idx] = A[r];
				idx++;
				r++;
			}
		}
		
		if(l>mid) {
			while(r<=right) {
				sorted[idx] = A[r];
				idx++;
				r++;
			}
		}
		else {
			while(l<=mid) {
				sorted[idx] = A[l];
				idx++;
				l++;
			}
		}
		
		for(int i=left;i<=right;i++) {
			A[i] = sorted[i];
			list.add(sorted[i]);
		}
	}
}
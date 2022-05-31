import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Set<Integer> A = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < N; i++) {
        	
        	A.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++) {
        	
        	if(A.contains(Integer.parseInt(st.nextToken()))) {
        		System.out.println(1);
        	} else {
        		System.out.println(0);
        	}
        }
    }
}
import java.util.*;
public class reArrange {
	
	static void rearrange(int[] A, int N)
    {
        int temp[] = A.clone();
        int low = 0, high = N - 1;
        boolean flag = true;
 
        // Store result in temp[]
        for (int i = 0; i < N; i++) {
            if (flag)
            	 A[i] = temp[low++];
            else
            	A[i] = temp[high--];
 
            flag = !flag;
        }
    }
	
	public static void printArray(int[] A) {
        for (int j : A) {
            System.out.print(j + " ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = scan.nextInt();
        }
        rearrange(A, size);
        printArray(A);

	}

}

// Time complexity: O(N)
// Space COMPLEXITY: O(N)

// TEST CASE

5
8 7 4 3 2
8 2 7 3 4

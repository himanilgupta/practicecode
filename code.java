import java.util.Arrays;

public class code {
    static void searchDuplicate() {
        int[] b = {1,2,1,2,1,3,2};
        System.out.println("array length "+b.length);
        for(int i = 0; i < b.length; i++){
            for(int j = i+i; j<b.length;j++) {
                if(b[i] == b[j]){
                    System.out.println("duplicate values: "+b[j]);
                }
            }
        }
    }
    static void countFreq() { 
        int[] arr = {1,2,1,3,2,1,3,2};
        int n = arr.length;
        boolean visited[] = new boolean[n]; 
        // Arrays.fill(visited, false); 
        // Traverse through array elements and 
        // count frequencies 
        for (int i = 0; i < n; i++) { 
            // Skip this element if already processed 
            if (visited[i] == true) 
                continue; 
            // Count frequency 
            int count = 1; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] == arr[j]) { 
                    visited[j] = true; 
                    count++; 
                } 
            } 
            System.out.println(arr[i] + " " + count); 
        } 
    } 
    static void searchDuplicateByCount() { //best
        int[] b = {1,2,1,3,2,1,3,2};
        int count[] = new int[b.length];
        // Arrays.fill(count,1);
        for(int i = 0; i < b.length; i++) {
            // System.out.println(b[i]+" :value occurrence: "+count[i] + " testcode: "+count[b[i]]);
            int c = 1;
            if(2 == b[i]) { c++; }
            if(count[b[i]] == 1) {
                // System.out.println("Duplicate: "+b[i]);
                continue;
            }
            else { count[b[i]]++; }
            for(int j = i+1;j<b.length;j++) {
                if(b[i] == b[j])
                    count[j] = 1;
                    c++;
            }
            System.out.println(b[i] + " occurs " + c + " times");
            
        }
        // System.out.println("Count Occurrence of 2: "+c);
    }
    public static void main(String a[]) {
        // code.searchDuplicate();
        // code.searchDuplicateByCount();
        code.countFreq();
    }
}
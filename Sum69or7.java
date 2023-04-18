// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 9 or 7
// (every 6 will be followed by at least on 9 or 7). Return 0 for no numbers

class Sum69or7 {
    public int solution(int[] A) {
        int sum = 0;
        int total9 = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 6){
                for (int j = i;A[j]!=9;j++)
                {
                    A[j]=0;
                    total9 = j;
                }
                A[total9+1] = 0;
            }
            else {
                sum+=A[i];
            }
        }
        return sum;
    }
}

class FindLargestNumber {
    static void largest(int a[]){
        int max = a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Largest number is: "+max);
    }
    public static void main(String[] args) {
        int a[] = {100,2,30,4,500,6};
        largest(a);
    }
}
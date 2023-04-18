class ArrayAddition{
    public static void main(String arg[]) {
        int a[] = {1,2,3,4,5,6,7};
        int temp[] = new int[a.length-1];
        for(int i=0; i<a.length-1; i++) {
            int add = a[i] + a[i+1];
            temp[i] = add;
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0;j<temp.length;j++){
                if(temp[j] == a[i]) {
                    System.out.println(temp[j] + " is present in array as "+a[i]);
                }
            }
        }
        for (int j = 0;j<temp.length;j++) {
            if(temp[j] != temp[j]){
                System.out.println(temp[j]);
            }
        }
    }
}
import java.util.Arrays;

class sortArray {
    public static void main(String arg[]){
        int a[] = {5,3,1,9,7};
        int max = 0; 
        // for(int i = 0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
           } 
        }
        // for(int i = 0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        
        String b = "123";
        System.out.println(Integer.valueOf(b));

        String str = "Jaya stays in Pune and Jaya like to travel. Jaya has dancing skills";
        String s[] = str.split("\\s+");
        StringBuilder build = new StringBuilder();
        for(int i = 0;i<s.length;i++){
            if(s[i].equals("Jaya")) {
                s[i] = "Miss "+s[i];
            }
            
            build.append(s[i]);
            str = s[i]+" ";
            System.out.println(String.join(" ", str));
            
        }
        // str = Arrays.toString(s);
        System.out.println(build.toString() + " ");
        
        // if true go::stop

    }
}
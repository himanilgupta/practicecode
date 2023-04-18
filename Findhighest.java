import java.util.HashSet;
import java.util.Queue;

class Findhighest {
    public void find(int b[]) {
        int max = b[0];
        int second = 0;
        Queue<Integer> q = new Queue<Integer>();
        for(int i = 0;i<b.length;i++) {
            if(b[i]>max) {
                max = b[i];
            }   
        }
        System.out.println("The largest number: "+max);
    }
    public void removeDuplicate(int b[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i<b.length;i++){
            s.add(b[i]);
        }
        System.out.println("remove duplicate: "+s);
    }
    public static void main(String[] args) {
        Findhighest fh = new Findhighest();
        // int a[] = {1,2,4,5,63,6};
        int b[] = {1,2,2,3,4,4,4,5,6,6,9};
        // fh.find(a);
        fh.removeDuplicate(b);    
    }

    WebdriverWait wait = new WebdriverWait(60,SECONDS);
    
}
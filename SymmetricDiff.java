import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDiff {
    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer[] {1,2,3}));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(new Integer[] {2,3,4}));

        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of set: "+union);

        Set<Integer> intersetion = new HashSet<Integer>(set1);
        intersetion.retainAll(set2);
        System.out.println("Intersection of set: "+intersetion);

        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("difference of set: "+difference);
        
        Set<Integer> symmDiff = new HashSet<Integer>(set1);
        symmDiff.addAll(set2);
        Set<Integer> temp = new HashSet<Integer>(set1);
        temp.retainAll(set2);
        symmDiff.removeAll(temp);
        System.out.println("Symmetric Difference: "+symmDiff);
        
    }
}
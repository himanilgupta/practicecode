import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindSymetricDifference {
    public void sym(int a[],int b[]) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(a));
    }
    public static void main(String a[]) {
        FindSymetricDifference fsd = new FindSymetricDifference();
        fsd.sym([1,2,3,4],[5,2,1,4]);
    }
}
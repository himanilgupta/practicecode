import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.*;

class TestClass {
    
    public static void main(String arg[]) {
        String str = "My Name is Himanil";
        String a[] = str.split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();
        int count = 0;
        for(int i=0;i<=a.length;i++) {
            if(!m.containsValue(a[i])) {
                count = count++;
                int freq = m.getOrDefault(a[i], 0);
                m.put(a[i], freq++);
            }
        }
        for(Entry<String, Integer> result : m.entrySet()) {
            System.out.println(result.getKey() + " " + result.getValue());
        }
    }
}
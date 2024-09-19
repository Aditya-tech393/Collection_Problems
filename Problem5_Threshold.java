import java.util.*;

public class Problem5_Threshold {
    public static void removeElementsBelowThreshold(Set<Integer> set, int threshold) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element < threshold) {
                iterator.remove();
            }
        }
        System.out.println("TreeSet after removing elements below: \n"+set);
    }
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        int threshold = 3;
        removeElementsBelowThreshold(set, threshold);


    }
}
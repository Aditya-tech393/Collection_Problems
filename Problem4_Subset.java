import java.util.*;

public class Problem4_Subset {
    public static boolean isSubset(Set<Integer> setA,Set<Integer> setB){
        return setB.containsAll(setA);
    }
    public static void main(String[] args) {

        Set<Integer> hashSetOne=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> hashSetTwo=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("HashSet 1 : "+hashSetOne+" and HashSet 2: "+hashSetTwo);
        System.out.println("Subset using HashSet: "+isSubset(hashSetOne,hashSetTwo)+"\n");


        Set<Integer> treeSetOne=new TreeSet<>(Arrays.asList(1,2,3));
        Set<Integer> treeSetTwo=new TreeSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("TreeSet 1 : "+treeSetOne+" and TreeSet 2: "+treeSetTwo);
        System.out.println("Subset using TreeSet: "+isSubset(treeSetOne,treeSetTwo)+"\n");


        Set<Integer> linkedHashSetOne=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> linkedHashSetTwo=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("LinkedHashSet 1 : "+linkedHashSetOne+" and LinkedHashSet 2: "+linkedHashSetTwo);
        System.out.println("Subset using LLinkedHashSet: "+isSubset(linkedHashSetOne,linkedHashSetTwo)+"\n");


        Set<Integer> setOne=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> setTwo=new HashSet<>(Arrays.asList(4,5,6));
        System.out.println("HashSet 1 : "+setOne+" and HashSet 2: "+setTwo);
        System.out.println("Subset: "+isSubset(setOne,setTwo)+"\n");


    }
}

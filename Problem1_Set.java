import java.util.*;

public class Problem1_Set {
    public static List<Integer> setBehaviour(List<Integer> list){
        return list;
    }
    public static Set<Integer> hashSet(List<Integer>list){
        Set<Integer> hashSet=new HashSet<>(list);
        return hashSet;
    }
    public static Set<Integer> linkedHastSet(List<Integer>list){
        Set<Integer> linkedHastSet=new LinkedHashSet<>(list);
        return linkedHastSet;
    }
    public static Set<Integer> treeSet(List<Integer>list){
        Set<Integer> treeSet=new HashSet<>(list);
        return treeSet;
    }

    public static void main(String[] args) {
        List<Integer> myList=Arrays.asList(1,45,23,46);
        System.out.println("My List: "+setBehaviour(myList));
        System.out.println("HashSet : "+hashSet(myList));
        System.out.println("LinkedHashSet: "+linkedHastSet(myList));
        System.out.println("TreeSet: "+treeSet(myList));
    }
}

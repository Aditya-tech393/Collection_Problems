import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Problem3_Sort_Unique_Elements {
    public static TreeSet<Integer> sortElements(List<Integer> myList){
        TreeSet<Integer> treeSet=new TreeSet<>(myList);
        return treeSet;
    }
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(7,2,9,1,2,9);
        System.out.println("The list is : "+list);
        System.out.println("The sorted list is : "+sortElements(list));

    }
}

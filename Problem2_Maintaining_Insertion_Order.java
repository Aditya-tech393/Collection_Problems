import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Problem2_Maintaining_Insertion_Order {
   public static LinkedHashSet<String> removeDuplicate(List<String> list){
       LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(list);
       return linkedHashSet;
   }

    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Apple","Banana","PineApple","Apple","Papaya","Banana");

        System.out.println("My Entered List: "+stringList);
        System.out.println("LinkedHashSet Output: "+removeDuplicate(stringList));
    }
}


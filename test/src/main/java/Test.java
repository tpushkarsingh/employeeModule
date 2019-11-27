import java.util.*;
import java.util.stream.Collectors;

public class Test {


    /*Array
    [1,1,2,4,4,3]
1 - [2,3]
2 - [1,4]

Order asc
    * */
    public static void main(String[] args) {
        List<Integer> lst =Arrays.asList(1,1,2,4,4,3);
        Collections.sort(lst);

        lst.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().forEach(System.out::println);


    }
}

import java.util.*;
public class Q24_1 {
    public static void main(String[] args) {
        List<Integer> iList = Arrays.asList(2,3,4,5,6,7,8);
        iList.stream().filter(i -> i%2==0).forEach(System.out::println);
//        ()->System.out.println(i%2==0);.map(i -> i*i).filter(i->i<50)
    }
}
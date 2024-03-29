package apr23.apr3;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class LaunchSTR
{
    public static void main(String[] args)
    {
//        List<Integer> list= Arrays.asList(2,4,5,8,9);
//        Stream<Integer> streamData=list.stream();
//        streamData.forEach(n-> System.out.println(n));
////      streamData.forEach(n-> System.out.println(n));
        List<Integer> list = Arrays.asList(8,4,2,7,5);
        Stream<Integer> streamData = list.stream();
//        long count=streamData.count();
//        System.out.println(count);
//        Predicate<Integer> pre=i-> i%2==0;

        Stream<Integer> finalStream =streamData
                .filter(n->n%2==0)
                .sorted()
                .map(n->n*2);

//        Stream<Integer> sortedStream = filData.sorted();
//        Stream<Integer> mapStream = sortedStream.map(n->n*2);

        finalStream.forEach(n-> System.out.println(n));

//        streamData.forEach(n-> System.out.println(n));


    }
}

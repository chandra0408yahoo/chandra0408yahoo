package Streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstTest {
    public static <Obj> void main(String args[]) throws IOException {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<String> list1 = Arrays.asList("Chandra", "Ammu", "Nammi", "family", "FOr");
        Stream<String> stream = Stream.of("Geeks", "FOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        IntStream st= IntStream.of(1,2,4,56,66,99);

  // list1.stream().flatMapToInt(x->IntStream.of(x.length())).forEach(System.out::println);


        System.out.println(  list.stream().collect(Collectors.counting()));



      //  System.out.println(result);



    }

}

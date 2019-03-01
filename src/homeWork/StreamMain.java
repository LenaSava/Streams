package homeWork;
import java.util.stream.IntStream;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;


public class StreamMain {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(136, 5, 0, 10, 1, 12, 110);


        double average = intList.stream().mapToInt(x->x).average()
                .getAsDouble();
        System.out.println("average is: " + average);

        int minIdx = IntStream.range(0,intList.size())
                .reduce((i,j) -> intList.get(i) > intList.get(j) ? j : i)
                .getAsInt();
        System.out.println("min index is: " + minIdx);


        long equalsNull = IntStream.range(0,intList.size()).filter(x -> intList.get(x) == 0 ).count();
        System.out.println("Equals of 0: " + equalsNull);

        long moreThanNull = IntStream.range(0,intList.size()).filter(x -> intList.get(x) > 0 ).count();
        System.out.println("Equals more then 0: " + moreThanNull);

        intList.stream().mapToInt(x -> x*5).forEach(System.out::println);



    }
}

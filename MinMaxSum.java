import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public List<Long> findMinMaxSum(List<Integer> arr){
        Collections.sort(arr);
        Long min = 0L, max = 0L;

        List<Long > minMaxList = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            if((1 < arr.get(i)) && (arr.get(i) < Integer.MAX_VALUE)){
                min = min + arr.get(i);
            }
        }

        for (int i = 1; i < arr.size(); i++) {
            if((1 < arr.get(i)) && (arr.get(i) < Integer.MAX_VALUE)) {
                max = max + arr.get(i);
            }
        }

        minMaxList.add(min);
        minMaxList.add(max);

        return minMaxList;
    }
    public static void main(String[] args) {
        MinMaxSum m = new MinMaxSum();
        List<Integer> arr = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
        List<Long> sumList = m.findMinMaxSum(arr);

        for (Long i :
                sumList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

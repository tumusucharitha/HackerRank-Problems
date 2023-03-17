import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr){

        float neg = 0, pos = 0, zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if(((-100 <= arr.get(i)) && (arr.get(i) <= 100)) && ((0 < arr.size()) && (arr.size() < 100))){
                if(arr.get(i)<0){
                    neg++;
                }else if (arr.get(i)>0){
                    pos++;
                }else {
                    zero++;
                }
            }
        }

        System.out.println(String.format("%.6f", (pos/ arr.size())));
        System.out.println(String.format("%.6f", (neg/ arr.size())));
        System.out.println(String.format("%.6f", (zero/ arr.size())));

    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 100, 35, 0, 94, 40, 42, 87, 59, 0);
        plusMinus(arr);
    }
}

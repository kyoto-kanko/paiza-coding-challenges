package levelC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class C154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var qtyAndCoupon = br.readLine().split(" ");
        int coupon = Integer.parseInt(qtyAndCoupon[1]);

        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        if (applyCouponConditions(coupon, Collections.max(numbers))) {
            var tem = applyCoupon(Collections.max(numbers));
            numbers.sort(Collections.reverseOrder());
            numbers.removeFirst();
            numbers.add(tem);
            System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        }

    }

    private static Boolean applyCouponConditions(int coupon, Integer price) {
        return coupon < price;
    }


    private static Integer applyCoupon(Integer price) {
        return price / 2;
    }


}

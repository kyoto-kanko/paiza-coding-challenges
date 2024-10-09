package levelC;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class C086 {
    public static void main(String[] args) {
        final List<String> excludedKeywords = Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");

        List<String> nl = Arrays.asList(new Scanner(System.in).nextLine().split(""));

        BiFunction<List<String>, String, Boolean> checkKeywords = (target, keyword) -> !target.contains(keyword);

        List<String> ans = nl.stream().filter(targetKeyword -> checkKeywords.apply(excludedKeywords, targetKeyword)).toList();
        System.out.println(String.join("", ans));
    }
}

// 出題問題
// https://paiza.jp/career/challenges/416/page/result

// 所感
// C問題の傾向は大体つかめた気がする
// 初めて関数型インターフェースを使ってみたがかなり便利

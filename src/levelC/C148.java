package levelC;

import java.util.*;

public class C148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nl = sc.nextLine().split(" ");
        var count = Integer.parseInt(nl[0]);
        var myLevel = Integer.parseInt(nl[1]);
        for (int i = 0; i < count; i++) {
            var enemyLevel = Integer.parseInt(sc.nextLine());
            if (myLevel - enemyLevel > 0) {
                myLevel += Math.round(enemyLevel / 2);
            } else if (myLevel - enemyLevel < 0) {
                myLevel = Math.round(myLevel / 2);
            } else {
            }
        }
        System.out.println(myLevel);
    }
}

// 出題問題
// https://paiza.jp/career/challenges/724/page/ready

// 所感
// Javaで初めて競プロを解いたが、Rubyと比較して少し面倒な記述が多い印象
// Scannerを使って標準入力を受け取っているが、これは遅くて本来競プロに向いていないらしい
// 次回以降、別の方法を模索してよりパフォーマンスに考慮した設計を心がけたい

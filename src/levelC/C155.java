package levelC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C155 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String filteringWord = br.readLine();
        int inputCount = Integer.parseInt(br.readLine());

        List<String> ans = new ArrayList<>();
        for (int index = 0; index < inputCount; index++) {
            ans.add(br.readLine().contains(filteringWord) ? "Yes" : "No");
        }
        for (int index = 0; index < inputCount; index++) {
            System.out.println(ans.get(index));
        }
    }

}

// 出題問題
// https://paiza.jp/career/challenges/766/page/result

// 所感
// Scannerよりも効率的なBufferedReaderを使って解いた結果、明らかなパフォーマンスの改善が見られた
// ListとArrayで挙動と特性が若干違うので意識しておく
// よく使いそうな処理はこれからTips.mdに追記していくことにする
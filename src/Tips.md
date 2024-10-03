# Tips

競プロで問題を解く際のTipsをまとめておく

## 標準入力

### 結論

ScannerよりもBufferedReaderを使用する

### どうして...??

以下の処理が無駄なので、オーバーヘッドになる

- Scannerはスレッドセーフなので、処理が同期的に行われる
- 入力された値を解析する際に文字列にパースする

### 使用例

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 1行全体を読み込み
String line = br.readLine();

// スペース区切りの値を分割して配列に格納
String[] values = line.split(" ");

// 数字に変換
int values = Integer.parseInt(br.readLine());
```
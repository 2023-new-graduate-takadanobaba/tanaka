 # tanaka
001 数字にする
• 実例1:
• 入力: 10
• 出力: 10
• 実例2:
• 入力: 20
• 出力: 20
• 実例3:
• 入力: 00
• 出力: 数字ではありません
• 実例4:
• 入力: 1111(1000文字続く)
• 出力: 1111(1000文字).
• 実例5:
• 入力: 
• 出力: 

準備作業
• ファイルを作る
• パッケージを決める
• number.javaを作る
• クラスを作る
• numberクラスを書く
• 空のmain()メソッドを作る

入力
• 数字を入力する
• BufferedReaderを作る
• reader.readLine();で文字列(数字)を入力する
• 変数 String str に格納する
• printf()でstrを表示して動作確認

処理

•入力した文字列が数字か判定
• 出力文字列を作る

入力した文字列が数字
• 入力した文字列を数値に変換
• 変数numに数値型にしたstrを格納

入力した文字列が数字ではない
 
出力
• 文字列を表示する
• System.outで変数numを表示する
• 動作確認
• 全体を動かして確認
• 10を入力して確認
• 20を入力して確認

003 足し算
• 実例1:
• 入力: 1 2 3 end 
• 出力: 6
• 実例2:
• 入力: 10 20 end
• 出力: 30
• 実例3:
• 入力: end
• 出力: 0

準備作業
〇ファイルを作る
• パッケージを決める
• calc.javaを作る

〇クラスを作る
• sumクラスを書く
• 空のmain()メソッドを作る

入力
○ 複数数字を入力する
• BufferedReaderを作る
• reader.readLine();で文字列(数字)を入力する
• 変数 String str に格納する
• printf()でstrを表示して動作確認

処理

•入力した文字列が数字か判定
• 出力文字列を作る

入力した文字列が数字
• 入力した文字列を数値に変換
• 変数numに数値型にしたstrを格納

入力した文字列が数字ではない
 
出力
〇合計値を表示する
• System.outで変数sumを表示する

動作確認
• 全体を動かして確認
• 1 2 3 end を入力して確認
• 10 20 end を入力して確認



















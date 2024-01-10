import java.io.*;
import java.nio.charset.Charset;

public class KeyIn {
    String buf = null;                          //①　入力バッファの初期化
    BufferedReader br =                         //②　キーボード入力の準備
            new BufferedReader(new InputStreamReader(System.in,
                    Charset.forName(System.getProperty("native.encoding"))));
    
    /* 文字列を入力するメソッド */
    public String readKey() {
        try {
            buf = br.readLine();                //③　キーボード入力
        } catch (IOException e ) {              //キーボード入力致命的エラー
            System.out.println(e);              //エラー情報の表示
            System.exit(1);              //プログラムの異常終了
        }
        return buf;                             //④　文字列を返却
    }

    /* 入力プロンプトを表示して文字列を入力するメソッド */
    public String readKey(String msg) {
        System.out.print(msg + "=");            //⑤　プロンプト表示
        return readKey();                    //⑥　キーボード入力
    }
}
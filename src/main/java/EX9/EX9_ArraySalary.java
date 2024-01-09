import java.text.*;

public class EX9_ArraySalary {
    public static void main(String[] args) {
        /* 宣言と初期化 */
        DecimalFormat form = new DecimalFormat();
        String[] arrayName = new String[] {"小暮次郎","川村麻衣","北上義徳",
                                           "佐野洋子","松原雅彦"};
        int[] arrayMoney = new int[] {184000,175000,261000,163000,226000};
        double[] arrayRatio = new double[arrayMoney.length];
        int total = 0;
        String buf;

        /* 計算 */
        for (int i = 0; i < arrayMoney.length; i++) {
            total += arrayMoney[i];
        }
        for (int i = 0; i < arrayRatio.length; i++) {
            arrayRatio[i] = (double)arrayMoney[i] / total;
        }

        /* 表示 */
        System.out.println("★　給料の状況　★");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.print(arrayName[i]);

            form.applyPattern("###,###");
            buf = "          " + form.format(arrayMoney[i]);
            buf = buf.substring(buf.length() - 11);
            System.out.print(buf);

            form.applyPattern("約###%");
            buf = "      " + form.format(arrayRatio[i]);
            buf = buf.substring(buf.length() - 7);
            System.out.println(buf);
        }
        form.applyPattern("###,###,### 円");
        buf = "            " + form.format(total);
        buf = buf.substring(buf.length() - 13);
        System.out.print("給料合計");
        System.out.println(buf);
    }    
}

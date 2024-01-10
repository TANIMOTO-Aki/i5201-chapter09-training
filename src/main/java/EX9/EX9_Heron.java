import java.text.*;

public class EX9_Heron {
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat();
        KeyIn ki = new KeyIn();
        String buf;

        System.out.println("4辺の長さから面積を計算します");
        System.out.println("(入力値は整数のみ)");
        System.out.println("4辺の長さと対角線の長さを入力してください。" + "\n");

        try {
            int x1 = Integer.parseInt(ki.readKey("x1"));
            int x2 = Integer.parseInt(ki.readKey("x2"));
            int x3 = Integer.parseInt(ki.readKey("x3"));
            int x4 = Integer.parseInt(ki.readKey("x4"));
            int x = Integer.parseInt(ki.readKey("x "));

            double area1 = Heron(x1, x2, x);
            double area2 = Heron(x3, x4, x);

            form.applyPattern("#####.00");
            buf = form.format(area1 + area2);
            System.out.println("面積 ＝ " + buf);

        } catch (NumberFormatException e){
            System.out.println("整数の値を入力してください。");
        }
    }

    public static double Heron(int a,int b,int c) {
        double d = (a + b + c) / 2.0;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }
}

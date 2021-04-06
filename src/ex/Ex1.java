package ex;

//練習問題
public class Ex1 {
    public static void main(String[] args) {
        int num = 9;//ここは変更して結果を確認

        //３の倍数のとき true それ以外は falseを表示する
        System.out.println("num:" + num);
        System.out.println("３の倍数か？:" + (num%3 == 0));
    }
}

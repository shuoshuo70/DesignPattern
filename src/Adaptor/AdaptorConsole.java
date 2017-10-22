package Adaptor;

/**
 * Created by shuoshu on 2017/10/22.
 */
public class AdaptorConsole {
    public static void main(String[] args) {
        Player p1 = new Centers("aa");
        Player p2 = new Forwards("bb");
        Player p3 = new Translator("cc");

        p1.attack();
        p2.defense();
        p3.attack();
    }
}

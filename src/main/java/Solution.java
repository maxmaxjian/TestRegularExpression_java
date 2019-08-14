import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Solution {

    public static void main(String[] args) {
        String s = "MLVIII";
        Pattern p = compile("(M*)(X[LC]|L?X*)(I[VX]|V?I*)");
        Pattern p1 = compile("(M*)(X[LC]|L?X*)");
        Pattern p2 = compile("M*");
//        String s = "CMXCIV";
//        Pattern p = compile("(C[DM]|D?C*)(X[LC]|L?X*)(I[VX]|V?I*)");

        boolean b = s.matches(p.pattern());
        System.out.println(b);

        Matcher matcher = p.matcher(s);
        System.out.println("matcher.find() = " + matcher.find());
        System.out.println("matcher.group() = " + matcher.group(0));
//        String[] result = s.split(p.pattern());
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("i = " + i + ": " + result[i]);
//        }

        Matcher matcher1 = p1.matcher(s);
        System.out.println(matcher1.find());
        System.out.println("matcher1.group() = " + matcher1.group(0));
//        String[] result1 = s.split(p1.pattern());
//        for (int i = 0; i < result1.length; i++) {
//            System.out.println("i = " + i + ": " + result1[i]);
//        }

        Matcher matcher2 = p2.matcher(s);
        System.out.println(matcher2.find());
        System.out.println("matcher2.group() = " + matcher2.group(0));

        System.out.println("s.substring(0, 0) = " + s.substring(0, 0));

        int x = 1;
        x <<= 0;
        System.out.println(x);

        int y = Integer.MIN_VALUE;
        long yy = Math.abs((long)y);
        System.out.println("yy = " + yy);
    }
}

package Strings;

import java.util.ArrayList;

public class ASCIIvalue {
    public static void main(String[] args) {
        //code to generate ASCII value
        // char ch = 'a';
        // System.out.println(ch+0);


        // subseqASCII("", "abc");
        System.out.println(subseqASCIIarray("", "abc"));
    }
    static void subseqASCII(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqASCII(p+ch, up.substring(1));
        subseqASCII(p, up.substring(1));
        subseqASCII(p+(ch+0), up.substring(1));
    }
    static ArrayList<String> subseqASCIIarray(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqASCIIarray(p+ch, up.substring(1));
        ArrayList<String> second = subseqASCIIarray(p, up.substring(1));
        ArrayList<String> third = subseqASCIIarray(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

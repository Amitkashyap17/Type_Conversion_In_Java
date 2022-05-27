import java.util.Arrays;

public class PracticeQue {
    public static void main(String[] args) {
        //Convert char Array into String
        char[] ch={'H','e','l','l','o',' ','J','a','v','a'};
        String st = String.valueOf(ch);
        System.out.println(st);// "Hello Java"

        //Convert String into char Array
        String st1 = "Hello Java";
        char[] ch1 = st1.toCharArray();
        System.out.println(Arrays.toString(ch1));// [H,e,l,l,o, ,J,a,v,a]

        //Convert "444" into Integer
        String st2 = "444";
        System.out.println(Integer.parseInt(st2));// 444

        //Convert 50 into String
        int n = 50;
        System.out.println(String.valueOf(n));// "50"

        //Check '6' isLetter or not
        char ch2 = '6';
        System.out.println(Character.isLetter(ch2));// false

        //Check 'm' isLetter or not
        char ch3 = 'm';
        System.out.println(Character.isLetter(ch3));// true

        //Check '7' isDigit or not
        char ch4 = '7';
        System.out.println(Character.isDigit(ch4));// true

        //Check 'z' isWhitespace or not
        char ch5 = 'z';
        System.out.println(Character.isWhitespace(ch5));// false

        //Convert 'a' into Integer
        char ch6 = 'a';
        System.out.println((int)ch6);// 97

        //Convert 'r' into toUpperCase
        char ch7 = 'r';
        System.out.println(Character.toUpperCase(ch7));// R

        //Convert 'L' into toLowerCase
        char ch8 = 'L';
        System.out.println(Character.toLowerCase(ch8));// l

        //Convert 'm' into toUpperCase
        char ch9 = 'm';
        System.out.println(Character.toUpperCase(ch9));// M

        //Check 'l' isUpperCase or not
        char ch10 = 'l';
        System.out.println(Character.isUpperCase(ch10));// false

        //Check 'r' isLowerCase or not
        char ch11 = 'r';
        System.out.println(Character.isLowerCase(ch11));// true

        //Convert 'z' into String
        char ch12 = 'z';
        System.out.println(String.valueOf(ch12));// "z"

    }
}

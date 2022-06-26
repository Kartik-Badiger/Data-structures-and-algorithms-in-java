package practice;

public class rotateprefixofword {
    public static void main(String[] args) {
        String word ="abcdef";
        String ans =reversePrefix(word,'d');
        System.out.println(ans);
    }
    public static String reversePrefix(String word, char ch) {
        int length=word.length();
        int end=word.indexOf(ch);
        StringBuilder str = new StringBuilder(word.substring(0,end+1));
        str.reverse();
        StringBuilder endpart= new StringBuilder(word.substring(end+1,word.length()));
        return str.append(endpart).toString();
    }
}

public class LeetCode344 {
    public void reverseString(char[] s) {
        int n=s.length;
        int frist;
        int list;
        for(frist=0,list=n-1;frist<list;frist++,list--) {
            char temp = s[frist];
            s[frist] = s[list];
            s[list] = temp;
        }
    }
}

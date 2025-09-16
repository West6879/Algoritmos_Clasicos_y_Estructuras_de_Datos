package practicas;

public class ProblemasLeet {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));

    }

    public static boolean isPalindrome(int x) {
        boolean palindrome = true;
        int reverse = 0, n = x;
        if(x < 0) palindrome = false;
        while(n > 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        if(reverse - x != 0) palindrome = false;
        return palindrome;
    }

}

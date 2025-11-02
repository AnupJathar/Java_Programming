class Logic
{
    void checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if(rev == temp)
            System.out.println(temp + " is a Palindrome number");
        else
            System.out.println(temp + " is NOT a Palindrome number");
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
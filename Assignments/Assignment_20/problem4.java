class Logic
{
    void findLargestDigit(int num)
    {
        int largest = 0;
        int digit;
        while(num > 0)
        {
            digit = num % 10;
            if(digit > largest)
                largest = digit;
            num = num / 10;
        }
        System.out.println("Largest digit is: " + largest);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
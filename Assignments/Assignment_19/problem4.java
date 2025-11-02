class Logic
{
    void printDigits(int num)
    {
        int digit;
        while(num > 0)
        {
            digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
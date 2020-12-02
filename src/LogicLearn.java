import java.util.Scanner;
public class LogicLearn {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int number2;
        int count=1,count2=1;
        //number2=number/10;
        while (true)
        {
            count++;
            number2=number/1;
            System.out.println (count);
            if (number2<1)
            {
                break;
            }
        }
    }
}

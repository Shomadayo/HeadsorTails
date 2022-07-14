import java.util.Random;
import java.util.Scanner;

class ayanobu
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);

        System.out.println("who are you?");
        System.out.println(">");

        String namae = scanner.nextLine();
        System.out.println("Hello, "+namae+"!");
        
        System.out.println("Tossing a coin... ");

        int i = 0;
        int Headsman = 0;
        int Tailswoman = 0;

        for(i=0;i<3;i++)
        {
            int j = i + 1;

            Random rand = new Random();
            int num = rand.nextInt(2);

            if(num==0)
            {
                System.out.println("Round " + j + ": Heads");
                Headsman++;
            }

            else {
                System.out.println("Round " + j + ": Tails");
                Tailswoman++;
            } 
        }
        
        System.out.println("Heads : " + Headsman + ", " + "Tails : " + Tailswoman);
	/*if(Headsman > Tailswoman)System.out.println("you won");
	  else System.out.println("you lose");*/
    }
}

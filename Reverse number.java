import java.io.*;

import java.util.*;

public class reverse

{

    public static void main(String arg[])

    {

          try

          {

               Scanner sc=new Scanner(System.in);

               int n,re=0,rem;

               System.out.println("Enter a number:");

               n=sc.nextInt();

               while(n!=0)

               {

                  rem=n%10;

                  re=re*10+rem;

                  n=n/10;

                }

               

               System.out.println("The reversed number is:"+re);

            }

           catch(Exception e)

           {

               System.out.println("Enter a valid number");

           }

      }

}


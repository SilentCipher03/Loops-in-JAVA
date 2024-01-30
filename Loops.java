import java.util.*;
public class Loops {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        // While loop

        int counter = 0;
        while( counter <10){
            System.out.println(" Hello Universe ");
            counter++;
        }

        // print num from 1 to 10

        int count =1;
        System.out.println(" give last number");
        int n = sc.nextInt();
        while(count <= n){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Sum of first n numbers

        System.out.println(" Enter the last natural num for sum");
        int n1= sc.nextInt();
        int sum = 0;
        int i = 1 ;
        while (i <= n1){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        // for loop 
        for (int j = 1 ; j <= 5; j++){
            System.out.print(" Hello Universe" + " ");
        }

        // Print Square pattern by for loop 
        for(int j=0; j<4; j++){
            System.out.println("****");
        }

        // Print Square pattern by while loop
        int k = 0;
        while(k<4){
            System.out.println("****");
            k++;
        }
        
        // Print reverse of the number

        System.out.println(" Enter the number");
        int n2 = sc.nextInt();

        while (n2 > 0){
            int ls = n2 %10;
            System.out.print(ls);
             n2 = n2/10;
           }
           System.out.println();
        
        // by for loop
        System.out.println(" Enter the num");
        int n3 = sc.nextInt();
        for (; n3>0; n3 = n3/10){
            int ls = n3%10;
            System.out.print(ls);

        }

        // Reverse the given number
        System.out.println(" Enter the number");
        int n4= sc.nextInt();
        int rev =0;

        while(n4>0){
            int ls = n4%10;
            rev = (rev *10) + ls;
            n4 = n4/10;
        }
        System.out.println(rev); 

        // do- while loop

        // Hello Universe
        int l = 1;
        do{
            System.out.println(" Hello Universe");
            l++;
        }while( l<= 10);

        // break statement  break and countinue are only used with loops

        //Keep entering numbers till user enters multiple of 10

        System.out.println("Enter the number ");
        int num1= sc.nextInt();

        while(true){
            System.out.println(num1);
            if(num1 % 10 == 0){
                System.out.println(" User entered multiple of 10");
                break;
            }
            System.out.println(" Enter the next num");
            num1 = sc.nextInt();

        }
        System.out.println("  so out of loop");

        // countinue statement 

        for(int p = 0; p<=4; p++){
            if(p==3){
                continue;
            }
            System.out.println(p);
         }

         // Print all numbers by user except multiples of 10

         
        do {
            System.out.print(" Enter the number ");
            int m = sc.nextInt();
            if(m ==0){
                break;
            }

            if(m%10 == 0){
                continue;
            }
            System.out.println(" number was" + m);

        }while(true);

        // check if number is prime or not 

        System.out.println(" Enter the number");
        int z = sc.nextInt();
        boolean isPrime = true;
        if(z==2){
            System.out.println(" Is prime");
        }else{

        for (int g = 2; g<= Math.sqrt(z); g++){// root n < (n-2) using root z make the code optimized

            if(z%g ==0){
                isPrime = false; // This shows number is composite no.
            }
        }

        if(isPrime == true){
            System.out.println(" number is Prime");
        }else{
            System.out.println(" Number is not prime");
        }
    }

        

    }
}

import java.util.Scanner;

   




public class main{
    public static void main(String[] args){


int y;
System.out.println("enter value for() x");
Scanner sc=new Scanner(System.in);
y=sc.nextInt();
System.out.println("the value for x is "+y);
double [] x=new double[12];

for(int i=0;i<x.length;i++){
    System.out.println("enter the value for "+(i+1));
    x[i]=sc.nextDouble();

    }



for (int i=0;i<x.length;i++){
    System.out.println("the value for x is  "+i+"is"+x[i]);

    

}
    }
}



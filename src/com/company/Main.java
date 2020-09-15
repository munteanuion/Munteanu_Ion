/*
//Introducerea de la tastatura exemplu

package com.company;
import java.util.Scanner;

public class Main
{
    //Exemplu pentru numere
    public static void main(String[] args)
    {
	    Scanner num = new Scanner(System.in);
	    int i;
	    i = num.nextInt();
	    System.out.println("My variable is :" + i);
    }
    //Exemplu pentru cuvinte
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);
        String text;
        str = str.nextLine();    //"str"este variabila la care adaugam-> str.nextLine = cuvinte; str.nextIn = numere integer; ...
        System.out.println("My text is :" + str);
    }
}
*/

package com.company;
//import java.lang.String;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Exemplu pentru numere
        System.out.println(" Introduceti un numar integer : ");
        Scanner num1 = new Scanner(System.in);
        int i1;
        float i2;
        i1 = num1.nextInt();
        System.out.println(" Introduceti un numar float : ");
        Scanner num2 = new Scanner(System.in);
        i2 = num2.nextFloat();
        System.out.println("My variable is: " + i1 + " and " + i2);
        //Exemplu pentru cuvinte
        System.out.println(" Introduceti un text : ");
        Scanner str = new Scanner(System.in);
        String text;
        text = str.nextLine();    //"str"este variabila la care adaugam-> str.nextLine = cuvinte; str.nextIn = numere integer; ...
        System.out.println("My text is :" + text);
    }
}


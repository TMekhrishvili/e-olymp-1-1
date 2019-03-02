// Stepan Friends


import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n--;
        System.out.println(n);
    }
}


// Buy the water

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); n*=100;
        int k=0, ans=0;
        while(n>=120){
            k += n%120;
            ans += n/120;
            n /= 120;
            n*=20;
            n+=k;
            k=0;
        }
        System.out.println(ans);
    }
}


// Canaries

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();

        long max = 0, min = 0;

        if(n % k == 0){
            min = n/k;
        } else {
            min = n/k + 1;
        }

        if(n==k) max = 1;
        else max = n-k+1;
        System.out.println(min + " " + max);
    }
}


// Divide the apples - 2

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(k%n);
    }
}


// Divide the apples - 1

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(k/n);
    }
}


// Sum of integers on the interval

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long k = b-a+1;
        long n = k/2*(a+b);
        if(k%2!=0) n+=((a+b)/2);
        System.out.println(n);
    }
}


// Rabbits in the cells

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long k = m/n;
        if(m%n!=0)k++;

        System.out.println(k);
    }
}

// Young gardener

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n *= ++n;

        System.out.println(n+1);
    }
}

// Anfisa and the flowers

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();

        m--;
        n--;
        System.out.println(m * n + 1);

    }
}
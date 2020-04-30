package javalearning.basics;

public class Array {

    public static void main(String[] args) {

        int a1[]; //declare an array

        int[] a2; //another syntax to declare an array

        // Create an array of 10 elements
        a1 = new int[10];

        // Declare and create an array
        int a3[] = new int[10];

        /* create an array where size of the array is determined by
        the value of variable n */
        int n = 10;
        int a4[] = new int[n];

        // create an array
        int arr[] = new int[10];
        //Array arr points to a new array of 5 elements.
        arr = new int[5];

        System.out.println("arr lenth: " + arr.length);

        int mda[][] = new int[5][5];

        int mda1 [][]  = new int[5][];
        mda1[0] = new int[5];
        mda1[1] = new int[10];

        int ar [] = {10,20,30,40,50};
        for (int num: ar)
            System.out.println (num);

        // initializes array a to given three values
        int a[] = {10,20,30};
        // initializes array b to given five values
        int b[] = new int[] {10,20,30,40,50};
        // initializes double dimensional array – 2 X 3
        int bb[][]= {{1,2,3},{4,5,6}};







    }
}

package com.lambda.exam;

public class FrequencyString {
    /* Returns count of occurrences of s in arr[] */
    static int search(String[]arr, String s)
    {
        int counter = 0;
        for (int j = 0; j < arr.length; j++)

                /* checking if string given in query is
                  present in the given string. If present,
                  increase times*/
            if (s.equals(arr[j]))
                counter++;

        return counter;
    }

    static void answerQueries(String[] arr, String q[])
    {
        for (int i=0;i<q.length; i++)
            System.out.print(search(arr, q[i]) + " ");
    }

    /* driver code*/
    public static void main(String[] args) {

        String[] arr = {"ab","ab","abc"};
        String[] q   = {"ab","abc","bc"};
        answerQueries(arr, q);
    }
}

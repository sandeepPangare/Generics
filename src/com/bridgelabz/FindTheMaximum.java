package com.bridgelabz;

public class FindTheMaximum {


    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){ //method for Integer
        /*
        compare three integer to find max value
         */
        Integer max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static Float maxOfFloat(Float a1, Float a2, Float a3){ //method for Float

        Float max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static String maxOfString(String a1, String a2, String a3){ //method for String

        String max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static void main(String[] args) {

        System.out.println("**Welcome to Find Maximum Problem Using Generics**\n");
        System.out.println("The maximum value between the three integer is: " + maxOfInteger(3, 8, 5));
        System.out.println("The maximum value between the three Float is: " + maxOfFloat(3.1f, 8.1f, 5.1f));
        System.out.println("The maximum value between the three String is: " + maxOfString("Apple", "Peach", "Banana"));
    }
}

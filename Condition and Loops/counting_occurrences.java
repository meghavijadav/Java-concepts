package com.meghavi;

public class counting_occurrences {
    public static void main(String[] args) {
        int n = 455789444;
        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if (rem == 4) {
                count++;
            }
            n = n/10;
        }
        System.out.println("The number of times 4 occurs is");
        System.out.print(count);
    }
}

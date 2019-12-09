package codingame.findlargest;

import java.util.Arrays;

public class FindLargest {

    /**
     * @return the largest number of the given array
     */
    static int findLargest(int[] numbers) {
        if (numbers.length == 1)
            return numbers[0];
        else
            return Arrays.stream(numbers).max().getAsInt();
    }

    public static void main(String args[]){
        int[] array = {1,2,8};
        System.out.println(findLargest(array));
    }
}

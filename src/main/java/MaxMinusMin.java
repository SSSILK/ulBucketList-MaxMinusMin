
import java.util.List;
import java.util.ListIterator;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

        ListIterator<Integer> iterator = nums.listIterator();
        int min = iterator.next();
        int max = min;

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current < min) min = current;
            if (current > max) max = current;
        }

        return max - min;
      
    }
}

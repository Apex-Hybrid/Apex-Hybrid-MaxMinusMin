import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        
        List<Integer> newlist = new ArrayList<>(nums);
        Collections.sort(newlist);
        int low = newlist.get(0);
        int high = newlist.get(newlist.size()-1);

        
        
        return high - low;
}}

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityElement = null;
        for (Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityElement == null || entry.getValue() > majorityElement.getValue()) {
                majorityElement = entry;
            }
        }
        return majorityElement.getKey();
    }

}

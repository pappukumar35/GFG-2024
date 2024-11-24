import java.util.HashMap;

class Array_Pair_Sum_Divisibility {
    public boolean canPair(int[] nums, int k) {

        // Code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)

        {

            int rem = num % k;

            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }

        for (int key : map.keySet())

        {

            if (key == 0)

            {

                if (map.get(key) % 2 != 0)

                {

                    return false;

                }

            }

            else

            {

                if (!map.containsKey(k - key) || map.get(key) != map.get(k - key))

                {

                    return false;

                }

            }

        }

        return true;

    }

}
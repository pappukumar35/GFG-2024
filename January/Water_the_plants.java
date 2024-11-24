import java.util.Arrays;

class Water_the_plants {
    int min_sprinklers(int gallery[], int n) {
        int[][] rangeArray = new int[n][2];

        for(int index=0; index < n; index++) {
            
            if(gallery[index] == -1)
                continue;
                
            rangeArray[index][0] = index - gallery[index];
            if(rangeArray[index][0] < 0)
                rangeArray[index][0] = 0;

            rangeArray[index][1] = index + gallery[index];
            if(rangeArray[index][1] >= n)
                rangeArray[index][1] = n;
        }
        
       Arrays.sort(rangeArray, (a1,a2) -> a1[0] == a2[0] ? a2[1] - a1[1] : a1[0]-a2[0]);  

        int start=0, index=0, answer=0;
        int currentMax=Integer.MIN_VALUE;

        while(start < n) {

            while(index < n) {

                if(rangeArray[index][0] > start)
                    break;

                currentMax=Math.max(currentMax, rangeArray[index][1]);
                index++;
            }

            if(currentMax < start)
                return -1;

            answer++;
            start=currentMax+1;

        }

        return answer;
    }s
}
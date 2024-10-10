class Largest_Sum_Subarray_of_Size_at_least_K{

    public long maxSumWithK(long a[], long n, long k)
    {
        long maxi = Long.MIN_VALUE, sum = 0, prevSum = 0;
        int j = 0;
        
        for(int i = 0; i < k; i++)  
            sum += a[i];
            
        maxi = Math.max(maxi, sum);
        for(int i = (int) k; i < n; i++)
        {
            sum += a[i];
            prevSum += a[j++];
            maxi = Math.max(maxi, sum);
            
            if(prevSum < 0) 
            {
                sum -= prevSum;
                maxi = Math.max(maxi, sum);
                prevSum = 0;
            }
        }
        
        return maxi;       
    }
}
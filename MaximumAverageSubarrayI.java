public class MaximumAverageSubarrayI {
    public static void main(String[] args)
    {
      
                int[] arr = {2, 1, 5, 1, 3, 2};
                int k = 3;
        
                int windowSum = 0;
                for (int i = 0; i < k; i++) {
                    windowSum += arr[i];
                }
        
                int maxSum = windowSum;
        
                for (int i = k; i < arr.length; i++) {
                    windowSum += arr[i] - arr[i - k];
                    if (windowSum > maxSum) {
                        maxSum = windowSum;
                    }
                }
        
                System.out.println("Maximum sum of 3 numbers = " + maxSum);
          
        
    
    }
    
}

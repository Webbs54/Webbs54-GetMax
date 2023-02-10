public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr)
    {
        int max_num = arr[0]; // this will be the max num. set to 0 index of array.
        for (int i = 0; i < arr.length; i++) // itterate through array.
        {
            if (arr[i] > max_num) // if value in array is greater than current max num.
            {
                max_num = arr[i]; // that value will become the new max num.
            }
        }
        return max_num;
    }
}

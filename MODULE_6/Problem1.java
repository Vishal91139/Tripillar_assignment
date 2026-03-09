// Find the maximum subarray sum using Kadane’s Algorithm.
package MODULE_6;

public class Problem1 {
    static int kadaneAlgo(int[] arr){
        int cMax = 0;
        int gMax = 0;
        for(int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax+arr[i]);
            gMax = Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println(kadaneAlgo(arr));
    }
}

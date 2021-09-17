public class TrappingWaterApp {
    public static void main (String[] args){
        int[] height = new int[]{4,2,0,3,2,5};
        int waterAmount = trappingWater(height);
        System.out.println(waterAmount);
    }

    private static int trappingWater(int[] height) {

        int n = height.length;

       int[] maxLeft = new int[n];
       int[] maxRight = new int[n];

       maxLeft[0] = height[0];
       maxRight[n-1] = height[n-1];

       int waterAmount = 0;

       for(int l = 1 ; l < n ; l++){
            maxLeft[l] = Math.max(maxLeft[l-1],height[l]);
       }
       for(int r = n-2 ; r >= 0 ; r-- ){
           maxRight[r] = Math.max(maxRight[r+1],height[r]);
       }

       for(int i = 0 ; i < n ; i++){
           waterAmount += Math.min(maxLeft[i],maxRight[i])-height[i];
       }
        return waterAmount;
    }
}

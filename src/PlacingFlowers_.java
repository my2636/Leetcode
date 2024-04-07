public class PlacingFlowers_ {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {0, 0}, 2));
    }
        // недорешена
    // https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int count2 = 0;
        int lgth = flowerbed.length;
        if (n == 0) return true;
        if(lgth == 1 && n == 1 && flowerbed[0] == 1) return false;
        if(lgth == 1 && flowerbed[0] == 0 && n == 1) return true;
        if(lgth == 2) { return flowerbed[0] == 0 && flowerbed[1] == 0 && n <= 1 ? true : false;}
        for(int i = 0; i < lgth; i++) {
            if(flowerbed[i] == 0) { count++; }
            if(flowerbed[i] == 1) { count = 0; }
            if(count > 1 && count % 2 != 0) { count2++; }
            if(i == 1 && count == 2 || (flowerbed[lgth - 1] == 0 && flowerbed[lgth - 2] == 0)) count2++;

        }
        if(count2 >= n) return true;
        else return false;
    }
}

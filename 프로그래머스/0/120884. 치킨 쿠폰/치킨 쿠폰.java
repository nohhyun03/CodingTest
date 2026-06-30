class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int total = 0;
        while (coupon >= 10){
            int service = coupon/10;
            total += service;
            coupon %= 10;
            coupon += service;
        }
        return total;
        
    }
}
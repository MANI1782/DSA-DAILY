class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        StringBuilder sb=new StringBuilder();
        long volume=(long)length*width*height;
        boolean bulky = volume >= 1_000_000_000L || length >= 10_000 || width >= 10_000 || height >= 10_000;

        boolean heavy = mass >= 100;

        if(bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}
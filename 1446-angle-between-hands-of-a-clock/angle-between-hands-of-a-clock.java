class Solution {
    public double angleClock(int hour, int minutes) {

        double hourTime=(hour*30)+(minutes*0.5);
        double minuteTime=(minutes*6);

        double dig=Math.abs(hourTime-minuteTime);

        if(dig>=180){
            double res= 360-dig;
            return Math.abs(res);
        }
        return Math.abs(dig);      
    }
    
}
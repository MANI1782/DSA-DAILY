class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String hour1 = startTime.substring(0,1+1);
        String minutes1=startTime.substring(3,4+1);
        String second1=startTime.substring(6,7+1);

        int startingans=Integer.parseInt(hour1)*60*60+Integer.parseInt(minutes1)*60+Integer.parseInt(second1);

        String hour2 = endTime.substring(0,1+1);
        String minutes2=endTime.substring(3,4+1);
        String second2=endTime.substring(6,7+1);

        int endingans=Integer.parseInt(hour2)*60*60+Integer.parseInt(minutes2)*60+Integer.parseInt(second2);

        return Math.abs(endingans-startingans);

        
    }
}
package Courses;

public class Overlap {
    public static boolean nooverlap(String[] days1, String[] days2, String hours1, String hours2){
        boolean nooverlap = false;
        boolean daysOverlap = false;
        for (String day1:days1){
            for (String day2:days2){
                if(day1.equals(day2)){
                    daysOverlap = true;
                    String start1 = hours1.split("-")[0];
                    String start2 = hours2.split("-")[0];
                    String end1 = hours1.split("-")[1];
                    String end2 = hours2.split("-")[1];
                    int start1hour = Integer.parseInt(start1.split(":")[0]);
                    int start2hour = Integer.parseInt(start2.split(":")[0]);
                    int start1min = Integer.parseInt(start1.split(":")[1]);
                    int start2min = Integer.parseInt(start2.split(":")[1]);
                    int end1hour = Integer.parseInt(end1.split(":")[0]);
                    int end2hour = Integer.parseInt(end2.split(":")[0]);
                    int end1min = Integer.parseInt(end1.split(":")[1]);
                    int end2min = Integer.parseInt(end2.split(":")[1]);
                    if (end2hour<start1hour){
                        nooverlap = true;
                    } else if (end2hour==start1hour && end2min<start1min) {
                        nooverlap = true;
                    } else if (end1hour<start2hour) {
                        nooverlap = true;
                    } else if (end1hour == start2hour && end1min<start2min) {
                        nooverlap = true;
                    }
                }
            }
        }
        return !daysOverlap || nooverlap;
    }
    public static boolean isExamdateoverlap(String examdate1, String examdate2){
        String year1= examdate1.split("-")[0];
        String year2 = examdate2.split("-")[0];
        String month1=examdate1.split("-")[1];
        String month2=examdate2.split("-")[1];
        String day1=examdate1.split("-")[2];
        String day2=examdate2.split("-")[2];
        String hour1=examdate1.split("-")[3].split(":")[0];
        String hour2=examdate2.split("-")[3].split(":")[0];
        String min1=examdate1.split("-")[3].split(":")[1];
        String min2=examdate2.split("-")[3].split(":")[1];
        if (year1.equals(year2)&&month1.equals(month2)&&day1.equals(day2)&&hour1.equals(hour2)&&min1.equals(min2)){return true;}else {return false;}
    }
}

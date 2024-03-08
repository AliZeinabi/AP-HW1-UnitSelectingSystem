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
}

package courses;
public class course {
    private int code ;
    // code dars
    private int capacity ;
    // zarfite dars
    private int worth ;
    // in dars chand vahede?
    private String name ;
    //esme dars to interface chie?
    private String instructor ;
    // ostade dars
    private   String examdate;
    //tarikhe emteahne final
    private String day ;
    //roozhaye bargozarie class
    private String hour ;
    //saate bargozarie class
    public course(int code, int capacity, int worth, String name,String instructor, String day,String hour){
        this.code = code ;
        this.capacity = capacity ;
        this.worth = worth;
        this.name = name ;
        this.instructor = instructor ;
        this.day = day ;
        this.hour = hour ;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getWorth(){
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getExamdate() {
        return examdate;
    }

    public void setExamdate(String examdate) {
        this.examdate = examdate;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getday() {
        return day;
    }

    public void setday(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }


}
package courses;
import java.util.LinkedList ;

public class mechcourselist {
    public LinkedList<course> lecture = new LinkedList<course>();
    public LinkedList<course> getLecture() {
        return lecture;
    }

    public void setLecture(LinkedList<course> lecture) {
        this.lecture = lecture;
    }
    public void init(LinkedList<course> lecture){

        lecture.add(new propercourse(28461,35,3,"Fluid Mechanics I","Amir Shamloo","Sunday-Tuesday","9:00-10:30"));
        lecture.add(new propercourse(28462,30,3,"Fluid Mechanics II","Bahar Firoozabadi","Saturday-Monday","10:30-12:00"));
        lecture.add(new propercourse(28416,41,3,"Automatic Control","Arya Alasti", "Sunday-Tuesday","9:00-10:30"));
    }
}


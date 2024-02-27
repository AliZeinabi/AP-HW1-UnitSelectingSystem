package Student;// this class is made to receive student commands !
import java.util.LinkedList ;
public class Student {
    //set a list of allowed students
    private LinkedList<Id> studentslist = new LinkedList<Id>();
    public LinkedList<Id> getstudentslist() {
        return studentslist;
    }
    public void setstudentslist(LinkedList<Id> studentslist) {
        this.studentslist = studentslist;
    }
    {
        studentslist.add(new Id(400105711,"400105711"));
    }



    //show the courselist

}

package Student;
// this class is created to create an ID card for Student
public class Id {
    private int studentnumber ;
    private String password ;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setstudentnumber(int studentnumber) {
        this.studentnumber = studentnumber;
    }

    public int getstudentnumber() {
        return studentnumber;
    }
    public  Id(int studentnumber, String password){
        this.studentnumber = studentnumber;
        this.password = password ;
    }
}

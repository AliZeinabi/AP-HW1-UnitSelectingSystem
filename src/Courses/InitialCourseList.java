package Courses;
public class InitialCourseList {
    public static void InitialCourseList(){
        {
//        list.add(new propercourse(22815, 120, 4, "Advanced Programming", "Hossein Boomari", "Saturday-Monday", "13:00-15:00", "Mathematics"));
//        list.add(new generalcourse(22015, 260, 4, "General Mathematics I", "Mohsen Jamali", "Saturday-Monday", "13:00-15:00", "Mathematics"));
//        list.add(new generalcourse(22016, 80, 4, "General Mathematics II", "Mohsen Jamali", "Saturday-Monday", "10:30-12:30", "Mathematics"));
//        list.add(new propercourse(40424, 50, 3, "Operating System", "Rasool Jalili", "Sunday-Tuesday", "15:00-16:30", "Computer engineering"));
//        list.add(new propercourse(40419, 60, 3, "Web Programming", "Yahya Poorsoltani", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
//        list.add(new generalcourse(40153, 70, 3, "Fundamentals of Programming", "Mohsen Kazemi", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
//        list.add(new generalcourse(31119, 55, 3, "Introduction To Persian Literature", "Maryam Seyyedan", "Sunday-Tuesday", "10:30-12:00", "Language Center"));
//        list.add(new generalcourse(31123, 25, 3, "Foreign Language", "Ali Jahangard", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
//        list.add(new generalcourse(31109, 25, 3, "Introductory Spanish", "Homa Atashi", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
//        list.add(new generalcourse(24011, 11, 3, "Physics I", "Abdollah Langari", "Saturday-Monday", "07:30-09:00", "Physics"));
//        list.add(new propercourse(24213, 0, 3, "ElectroMagnetics I", "Mariam Mirkamali", "Saturday-Monday", "10:30-12:00", "Physics"));
//        list.add(new propercourse(24313, 1, 3, "Quantum Mechanics II", "Laleh Memarzadeh", "Sunday-Tuesday", "09:00-10:30", "Physics"));

            CourseList.getGenerallist().put("31119",new GeneralCourse("31119", 55, 3, "Introduction To Persian Literature", "Maryam Seyyedan", "Sunday-Tuesday", "10:30-12:00", "Language Center","1402-3-30-13:30"));
            CourseList.getGenerallist().put("31123",new GeneralCourse("31123", 25, 3, "Foreign Language", "Ali Jahangard", "Sunday-Tuesday", "15:00-16:30", "Language Center","1403-3-22-13:30"));
            CourseList.getGenerallist().put("31109",new GeneralCourse("31109", 25, 3, "Introductory Spanish", "Homa Atashi", "Sunday-Tuesday", "15:00-16:30", "Language Center","1403-3-20-9:00"));
            CourseList.getGenerallist().put("24011",new GeneralCourse("24011", 11, 3, "Physics I", "Abdollah Langari", "Saturday-Monday", "07:30-09:00", "Physics","1403-3-31-9:00"));
            CourseList.getGenerallist().put("22015",new GeneralCourse("22015", 260, 4, "General Mathematics I", "Mohsen Jamali", "Saturday-Monday", "13:00-15:00", "Mathematics","1403-3-29-15:30"));
            CourseList.getGenerallist().put("40153",new GeneralCourse("40153", 70, 3, "Fundamentals of Programming", "Mohsen Kazemi", "Saturday-Monday", "13:30-15:00", "Computer engineering","1403-4-2-15:30"));
            CourseList.getGenerallist().put("22016",new GeneralCourse("22016", 80, 4, "General Mathematics II", "Mohsen Jamali", "Saturday-Monday", "10:30-12:30", "Mathematics","1403-3-24-9:00"));
            CourseList.getProperlist().put("22815",new ProperCourse("22815", 120, 4, "Advanced Programming", "Hossein Boomari", "Saturday-Monday", "13:00-15:00", "Mathematics","1403-3-26-15:30"));
            CourseList.getProperlist().put("40424",new ProperCourse("40424", 50, 3, "Operating System", "Rasool Jalili", "Sunday-Tuesday", "15:00-16:30", "Computer engineering","1403-3-31-15:30"));
            CourseList.getProperlist().put("40419",new ProperCourse("40419", 60, 3, "Web Programming", "Yahya Poorsoltani", "Saturday-Monday", "13:30-15:00", "Computer engineering","1403-3-23-9:00"));
            CourseList.getProperlist().put("24213",new ProperCourse("24213", 0, 3, "ElectroMagnetics I", "Mariam Mirkamali", "Saturday-Monday", "10:30-12:00", "Physics","1403-3-26-9:00"));
            CourseList.getProperlist().put("24313",new ProperCourse("24313", 1, 3, "Quantum Mechanics II", "Laleh Memarzadeh", "Sunday-Tuesday", "09:00-10:30", "Physics","1403-3-27-9:00"));

        }

    }
}

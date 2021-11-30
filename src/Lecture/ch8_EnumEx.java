package Lecture;

public class ch8_EnumEx {
    public static void main(String[] args) {
        Student student = Student.University;

        if (student == Student.HighSchool)
            System.out.println(Student.HighSchool + "은 수능시험을 본다.");
        else
            System.out.println(Student.University + "은 도서관에서 공부한다.");

        for(Student g : Student.values())
            System.out.println(g.name());

        System.out.println(Student.valueOf("MiddleSchool"));
        System.out.println(Student.valueOf("University"));
        System.out.println(Student.valueOf("HighSchool"));
        System.out.println(Student.valueOf("ElementarySchool"));
    }
}
enum Student {
    University("대학생"), HighSchool("고등학생"), MiddleSchool("중학생"),
    ElementarySchool("초등학생");

    private String s;

    Student(String s) {

        this.s = s;

    }

    public String toString() {
        return s;
    }
}
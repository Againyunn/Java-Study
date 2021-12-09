package Lecture;

public class ch8_Subject {
    public String subjectName;
    public int subjectTime;

    public void print(){

        System.out.println("수업받는 과목은 "+this.subjectName+ "이고, "
                + "수업 시간은 " + this.subjectTime+"시간입니다.");
    }
}

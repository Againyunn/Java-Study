package Lecture;

public class ch8_University {
    String className;
    String subjectName;
    int subjectTime;


    public void print(){
        System.out.println("수업받는 과목은 "+this.subjectName+ "이고, "
                + "수업 시간은 " + this.subjectTime+"시간입니다.");
        System.out.println(this.subjectName+"수업은 "+
                this.className+" 교수님이 담당입니다.");
    }
}

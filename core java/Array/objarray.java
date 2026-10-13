class student {
    String name;
    int rollno;
    int marks;
}

public class objarray {
    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Aryan";
        s1.rollno = 11;
        s1.marks = 80;

        student s2 = new student();
        s2.name = "navin";
        s2.rollno = 15;
        s2.marks = 89;

        student s3 = new student();
        s3.name = "kiran";
        s3.marks = 98;
        s3.rollno = 2;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (student s : students) {
            System.out.println(s.name + " : " + s.marks + " : " + s.rollno);
        }

    }
}

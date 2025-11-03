
public class StudentApp {
    public static void main (String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(
            "Maximilian",
            "Hacker",
            "Game Development",
            28,
            33333,
            false 
        );

        Student s3 = new Student(s2);

        Student students[] = { s1, s2, s3 };

        for (int i=0; i < students.length; i++) {
            Student student = students[i];
            student.print();

            System.out.println("setFirstName: Hannelore"); 
            student.setFirstName("Hannelore");
            System.out.println("getFirstName: " + student.getFirstName());
            System.out.println("setLastName: Thinking");
            student.setLastName("Thinking");
            System.out.println("getLastName: " + student.getLastName());
            System.out.println("setCourseOfStudy: Technische Informatik"); 
            student.setCourseOfStudy("Technische Informatik");
            System.out.println("getCourseOfStudy: " + student.getCourseOfStudy());
            System.out.println("setAge: 20");
            student.setAge(20);
            System.out.println("getAge: " + student.getAge());
            System.out.println("setMatriculationNumber: 7777777");
            student.setMatriculationNumber(7777777);
            System.out.println("getMatriculationNumber: " + student.getMatriculationNumber());
            System.out.println("setPayedTutionFee: true");
            student.setPayedTutionFee(true);
            System.out.println("getPayedTutionFee: " + student.getPayedTutionFee());
        }
    }
}

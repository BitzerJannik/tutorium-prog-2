
public class Student {
    private String firstName;
    private String lastName;
    private String courseOfStudy;
    private int age;
    private int matriculationNumber;
    private boolean payedTutionFee;

    public Student () {
        this.firstName = "Max";
        this.lastName = "Mustermann";
        this.courseOfStudy = "Studiengang";
        this.age = 100;
        this.matriculationNumber = 123456;
        this.payedTutionFee = true;
    }

    public Student (
        String firstName,
        String lastName,
        String courseOfStudy,
        int age,
        int matriculationNumber,
        boolean payedTutionFee
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseOfStudy = courseOfStudy;
        this.age = age;
        this.matriculationNumber = matriculationNumber;
        this.payedTutionFee = payedTutionFee;
    }

    public Student ( Student other ) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.courseOfStudy = other.courseOfStudy;
        this.age = other.age;
        this.matriculationNumber = other.matriculationNumber;
        this.payedTutionFee = other.payedTutionFee;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getCourseOfStudy () {
        return this.courseOfStudy;
    }

    public void setCourseOfStudy (String course) {
        this.courseOfStudy = course;
    }

    public int getAge () {
        return this.age;
    }

    public void setAge (int age) {
        if ( age >= 0 ) {
            this.age = age;
        }
    }
    
    public int getMatriculationNumber () {
        return this.matriculationNumber;
    }

    public void setMatriculationNumber (int number) {
        this.matriculationNumber = number;
    }

    public boolean getPayedTutionFee () {
        return this.payedTutionFee;
    }

    public void setPayedTutionFee (boolean value) {
        this.payedTutionFee = value;
    }

    public void print () {
        System.out.println(
            "Student ( firstName=" 
            + this.firstName
            + ", lastName="
            + this.lastName
            + ", courseOfStudy="
            + this.courseOfStudy
            + ", age="
            + this.age
            + ", matriculationNumber="
            + this.matriculationNumber
            + ", payedTutionFee="
            + this.payedTutionFee
            + " )"
        );
    }
}

public class student_static_main {
    public static void main(String[] args) {

        student_static s1 = new student_static("Dushyant", 84);
        student_static s2 = new student_static("Gaurav", 99);
        student_static s3 = new student_static("Sehaj", 88);
        System.out.println("Total number of student: " + student_static.get_total_student());
        System.out.println("Average score: " + student_static.get_average_score());

        s1.student_details();
        s2.student_details();
        s3.student_details();
    }
}

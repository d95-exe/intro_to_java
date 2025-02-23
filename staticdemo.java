public class student_static {
    private static int totalstudent = 0;
    private static int totalscore = 0;
    private String name;
    private int score;

    student_static(String a, int b) {
        name = a;
        score = b;
        totalstudent++;
        totalscore += b;
    }

    public void student_details(){
        System.out.println("Name: " + name + "\nScore: " + score);
    }

    public static int get_total_student(){
        return totalstudent;
    }

    public static int get_average_score(){
        return totalscore/totalstudent;
    }
}

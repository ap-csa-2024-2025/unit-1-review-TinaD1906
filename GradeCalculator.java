public class GradeCalculator
{
  public static void main(String[] args)
  {
    System.out.println("Course: AP Computer Science A");
    int TimeinWeek = 313;
    System.out.println("Average time spent in a week for this course in minutes: " + TimeinWeek);
    System.out.println("Homework grades for this course:");

    int firstHW = 75;
    int secHW = 40;
    int thirdHW = 65;
    int fourthHW = 90;

    System.out.println(firstHW);
    System.out.println(secHW);
    System.out.println(thirdHW);
    System.out.println(fourthHW);

    double avgHW = (firstHW + secHW + thirdHW + fourthHW)/4;

    System.out.println("Quiz grades for this course:");

    double quiz1 = 70.1;
    double quiz2 = 97.4;
    
    System.out.println(quiz1);
    System.out.println(quiz2);

    double avgQuiz = (quiz1 + quiz2)/2;

    double finalExam = 75.4;
    System.out.println("Final exam grade for this course:");
    System.out.println(finalExam);

    int hrs = (TimeinWeek / 60);
    int mins = (TimeinWeek % 60);
    System.out.println("Weekly time spent: " + hrs + "h" + mins);
    System.out.println("Average homework grade: " + avgHW);
    System.out.println("Average quiz grade: " + avgQuiz);
    System.out.println("Final exam grade: " + finalExam);

    double finalGrade = (avgHW * 0.35) + (avgQuiz * 0.15) + (finalExam * 0.50);
    System.out.println("Overall Grade: " + finalGrade);
    
  }
}

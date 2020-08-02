package quizApp;

public class Exercise {
    
    public static void main()
    {
        Student student1 = new Student(101,"ABC","ABC University");
        Student student2 = new Student(102,"LMN","LMN University");
        Student student3 = new Student(103,"PQR","PQR University");
        Student student4 = new Student(104,"UVW","UVW University");
        Student student5 = new Student(105,"XYZ","ZYZ University");
        Student studentArray[] = {student1, student2, student3, student4, student5};
        
        Result2 result1 = new Result2(111,101,70,"A");
        Result2 result2 = new Result2(222,102,30,"D");
        Result2 result3 = new Result2(333,103,90,"A+");
        Result2 result4 = new Result2(444,104,55,"B");
        Result2 result5 = new Result2(555,105,45,"C");
        Result2 resultArray[] = {result1, result2, result3, result4, result5};
        
        String topStudentName = getTopStudentName(studentArray,resultArray);
        System.out.println("Student who topped the quiz: "+topStudentName);
    }
    
    
    static String getTopStudentName(Student studentArray[], Result2 resultArray[])
    {
        String topStudentName = "";
        
        
        
        
      //   WRITE YOUR CODE HERE !!
        
        
        
        
        return topStudentName;
    }
   
}

class Student
{
    int studentId;
    String studentName;
    String studentUniversity;
    
    Student(int studentId, String studentName, String studentUniversity)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentUniversity = studentUniversity;
    }
    
}


class Result2
{
    int resultId;
    int studentId;
    int score;
    String grade;
    
    Result2(int resultId, int studentId, int score, String grade)
    {
        this.resultId = resultId;
        this.studentId = studentId;
        this.score = score;
        this.grade = grade;
    }
}
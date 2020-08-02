package quizApp;

import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
		
		Quiz quiz = new Quiz();
		quiz.begin();
	}	
}

class Quiz {
	void begin() {
		Question q1 = new Question("Why are Americans so special?","Arrogance","Ignorance","McDonalds","All of the above", new Answer("All of the above"));
		Question q2 = new Question("Does America stand a chance?","Yes","No","Maybe","AF", new Answer("AF"));
		Question q3 = new Question("What is the cause af American downfall?","White people","Asians","Blacks","Karens", new Answer("White people"));
		Question q4 = new Question("What is the meaning of life?","Family","Pizza","43","Cats", new Answer("Pizza"));
		Question q5 = new Question("How many cookies in the cookie jar","1","5","7","13", new Answer("13"));
		Question q6 = new Question("How many attempts will it take","1","2","3","4", new Answer("1"));
		
		Question questionsArr[] = {q1,q2,q3,q4,q5,q6};
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;
		
		for(Question q:questionsArr) {
			System.out.println(q.getQuestion());
			System.out.println("A. " + q.getOption1());
			System.out.println("B. " + q.getOption2());
			System.out.println("C. " + q.getOption3());
			System.out.println("D. " + q.getOption4());
			System.out.println("\nEnter an option: ");
	
			Scanner input = new Scanner(System.in);
			char option = input.next().charAt(0);
			String answer = " ";
			
			switch(option) {
			
			case 'A':
				answer = q.getOption1();
				break;
			case 'B':
				answer = q.getOption2();
				break;
			case 'C':
				answer = q.getOption3();
				break;
			case 'D':
				answer = q.getOption4();
				break;
			default:break;
			}
			
			if(answer.contentEquals(q.answer.getAnswer())) {
				System.out.println("-------------------------------------");
				System.out.println("Correct Answer!");
				System.out.println("-------------------------------------");
				countCorrect ++;
			} else {
				System.out.println("-------------------------------------");
				System.out.println("Wrong!");
				System.out.println("-------------------------------------");
				countWrong++;
			}
			System.out.println("==============================================================\n");
			countTotal++;
		}
		
		Result result = new Result(countTotal, countCorrect, countWrong);
		result.showResult();
	}
}



class Question {
	// Variables
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	Answer answer;
	
	// Constructor
	public Question(String question, String option1, String option2, String option3, String option4, Answer answer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}
	
	// Getters
	public String getQuestion() {return question;}
	public String getOption1() 	{return option1;}
	public String getOption2() 	{return option2;}
	public String getOption3() 	{return option3;}
	public String getOption4() 	{return option4;}
	public Answer getAnswer() 	{return answer;}
}

class Answer {
	String answer;
	public Answer(String answer) {super(); this.answer = answer;}
	public String getAnswer() {return answer;}
}

interface IResult {
	void showResult();
	double showPrecentage(int correctAnswers, int totalQuestions);
	String showPerformance(double percentage);
}

class Result implements IResult {
	int totalQuestions;
	int correctAnswers;
	int wrongAnswers;

	public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
		super();
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
	}
	
	public void showResult() {
		System.out.println("Your results: ");	
		System.out.println("Total questions:      " + totalQuestions);	
		System.out.println("Corresct answers:     " + correctAnswers);	
		System.out.println("Wrong answers:        " + wrongAnswers);	
		System.out.println("Percentage:           " + showPercentage(correctAnswers,totalQuestions));
		System.out.println("Overall performance:  " + showPerformance(showPercentage(totalQuestions,correctAnswers)));	
	}

	public double showPercentage(int correctAnswers, int totlaQuestions) {
		return ((double)correctAnswers / totalQuestions) * 100;
	}
	
	public String showPerformance(double percentage) {
		String performance = "";
		if(percentage > 60) {
			performance = "Good";
		} else if(percentage < 40) {
			performance = "Poor";
		} else {
			performance = "Average";
		}
		return performance;	
	}

	@Override
	public double showPrecentage(int correctAnswers, int totalQuestions) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}





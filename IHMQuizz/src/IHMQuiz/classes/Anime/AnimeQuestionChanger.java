


package IHMQuiz.classes.Anime;



public class AnimeQuestionChanger {
	static String q = null;
	static String op1 = null;
	static String op2 = null;
	static String op3 = null;
	static String op4 = null;
	static int solution = 0;

	static Anime quiz;
	static AnimeQuestions questions;
	static String currQuestion;
        
        public int difficulty;
	public AnimeQuestionChanger(int diff) {
		quiz = new Anime(diff);
                quiz.resetScore();
                quiz.setVisible(true);
                quiz.setResizable(false);
                quiz.setLocationRelativeTo(null);
                AnimeQuestions.list.clear();
                AnimeQuestions.listN.clear();
                AnimeQuestions.listH.clear();
                
		if(diff==0)
                    newEasyQuestion();
                else {
                    if (diff==1)
                        newNormalQuestion();
                    else
                        newHardQuestion();
                }
                
	}

	public static void newEasyQuestion() {
                
                questions = new AnimeQuestions();
		currQuestion = questions.easyQuestion;
		
		parser();
		sendText();
	}
        public static void newNormalQuestion() {
                
                questions = new AnimeQuestions(1);

		currQuestion = questions.normalQuestion;
		
		parser();
		sendText();
	}
        public static void newHardQuestion() {
                
                questions = new AnimeQuestions(1,2);
  

		currQuestion = questions.hardQuestion;
		
		parser();
		sendText();
	}

	public static void sendText() {
		quiz.changeLabelText(q);
		quiz.solution = solution;
		quiz.changeButtonText(quiz.jButton2, op1);
		quiz.changeButtonText(quiz.jButton5, op2);
		quiz.changeButtonText(quiz.jButton7, op3);
		quiz.changeButtonText(quiz.jButton6, op4);
	}

	public static void parser() {
		String question[] = currQuestion.split("\\$");
		for (int i = 0; i < question.length; i++) {
			switch (i) {
			case 0:
				q = question[i];
				break;
			case 1:
				op1 = question[i];
				break;
			case 2:
				op2 = question[i];
				break;
			case 3:
				op3 = question[i];
				break;
			case 4:
				op4 = question[i];
				break;
			case 5:
				solution = Integer.parseInt(question[i]);
				break;

			}
		}
	}
        

}

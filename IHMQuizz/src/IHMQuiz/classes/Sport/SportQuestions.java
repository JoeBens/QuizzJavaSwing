/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.Sport;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class SportQuestions {

	int guess;

	int j = 0;
	String[] easyQuestions = new String[14];
        String[] normalQuestions = new String[14];
        String[] hardQuestions = new String[14];
	String easyQuestion;
        String normalQuestion;
        String hardQuestion;
        int difficulty;
	public static ArrayList<Integer> list = new ArrayList<Integer>();
        public static ArrayList<Integer> listN = new ArrayList<Integer>();
        public static ArrayList<Integer> listH = new ArrayList<Integer>();
        
        
        
        
        
	public SportQuestions() {
            
              
                easyQuestions[1] = "Dans quel sport doit-on marquer des paniers ?$A. Football$B. Basket-ball$C. Tennis $D. volley-Ball$2";
                easyQuestions[2] = "De combien de joueurs se compose une équipe de basket-ball ?$A. 4$B. 5$C. 7 $D. 6$2";
                easyQuestions[3] = "Dans quel sport joue-t-on au pied ?$A. Football$B. Basket-ball$C. Natation$D. Golf$1";
                easyQuestions[4] = "Dans quel sport joue-t-on à la main et doit-on marquer des buts ?$A. Rugby$B. Handball$C. Football$D. Tennis$2";
                easyQuestions[5] = "Dans quel sport joue-t-on avec un ballon ovale ?$A. Basket-Ball$B. Handball$C. Rugby$D. Tennis$3";
                easyQuestions[6] = "Dans quel sport joue-t-on avec une raquette ?$A. Basket-Ball$B. Natation$C. Rugby$D. Tennis$4";
                easyQuestions[7] = "Dans quel sport faut-il être souple ?$A. Gymnastique$B. Athlétisme$C. Rugby$D. Tennis$1";

		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public SportQuestions(int diff){
                normalQuestions[1] = "Quelle est la nationalitée du joueur de Tennis roger federer ? $A. Française$B. Suisse$C. Espagnole$D. Américaine$2";
		normalQuestions[2] = "Qui est Zlatan Ibrahimovic ?$A. Un footballeur algérien.$B. Un footballeur suédois.$C. Un footballeur serbe.$D. Un footballeur croate.$1";
		normalQuestions[3] = "Quelle est la périodicité des jeux Olympiques d’été ?$A. Tous les 2 ans$B. Tous les 3 ans$C. Tous les 4 ans$D. Tous les 6 ans$3";
                normalQuestions[4] = " Quel nom porte un terrain de tennis ?$A. Le tennis$B. Le basket-ball$C. Le Football$D. Le volley-ball$4";
                normalQuestions[5] = "Au judo, quel est le grade le plus élevé parmi ces ceintures ?$A. Bleue$B. Orange$C. Verte$D. Jaune$1";
                normalQuestions[6] = "Quel sport doit-on jouer pendant 2 mi-temps de 40 minutes ?$A. Au Foot $B. Au Rugby $C. Handball$D. Au Basket-Ball$2";
                normalQuestions[7] = "Quel pays est spécialiste du lancer de tronc d'arbre ou de poutre ?$A. L'Irlande$B. L'Australie$C. Le Canada$D. L'Ecosse$4";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public SportQuestions(int diff,int diffi){
                hardQuestions[1] = "Avant le combat, que jettent les sumotoris au centre de la piste ?$A. Du sel$B. Du sucre$C. Du sable$D. De l'eau $1";
                hardQuestions[2] = "Quelle est la largeur d'un but de football ?$A. 7,20 m$B. 7,32 m$C. 8 m$D. 7,90 m$2";
                hardQuestions[3] = "Dans quelle discipline doit-on toucher une cible de 5 cm de diamètre ?$A. Au tir à l'arc$B. Au ball-trap$C. Aux fléchettes$D. En parachutisme$4";
                hardQuestions[4] = "Quelle technique utilise une canne de plus de 11 m ?$A. La pêche à la mouche$B. La pêche à l'anglaise$C. La pêche au lancer$D. La pêche au coup$4";
                hardQuestions[5] = "\"Field Goal\", \"Kick off\", \"Touchdown\" sont des termes de ...$A. Football américain$B. Rugby$C. Trial$D. Polo$1";
                hardQuestions[6] = "Avant de prendre le rôle de Tarzan, John Weissmuller était champion...$A. De lutte$B. De natation$C. De gymnastique$D. D'athlétisme$2";
                hardQuestions[7] = "Le score maximum pour une partie de bowling est de :$A. 200 points$B. 400 points$C. 300 points$D. 600 points$3";


		hardQuestion = hardQuestions[rngH(1, 7)];
                
                
                
              
        }


	public int rng(int min, int max) {

		

		guess = (int) ((max - min) * Math.random() + min);

		if (list.contains(guess)) {
			rng(1, 7);
		}

		else {
			addToList(guess);
		}

		return guess;

	}

	public void addToList(int g) {

		list.add(g);

	}
        public int rngN(int min, int max) {

		

		guess = (int) ((max - min) * Math.random() + min);

		if (listN.contains(guess)) {
			rngN(1, 7);
		}

		else {
			addToListN(guess);
		}

		return guess;

	}

	public void addToListN(int g) {

		listN.add(g);

	}
        public int rngH(int min, int max) {

		

		guess = (int) ((max - min) * Math.random() + min);

		if (listH.contains(guess)) {
			rngH(1, 7);
		}

		else {
			addToListH(guess);
		}

		return guess;

	}

	public void addToListH(int g) {

		listH.add(g);

	}
        public void clearList(){
            list.clear();
        }
         static void shuffleArray(String[] ar)
        {
            // If running on Java 6 or older, use `new Random()` on RHS here
            Random rnd = ThreadLocalRandom.current();
            for (int i = ar.length - 1; i > 0; i--)
            {
            int index = rnd.nextInt(i + 1);
            // Simple swap
             String a = ar[index];
             ar[index] = ar[i];
             ar[i] = a;
            }
        }

}

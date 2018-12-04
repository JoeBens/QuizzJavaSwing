/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.Sante;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class SanteQuestions {

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
        
        
        
        
        
	public SanteQuestions() {
            
              
                easyQuestions[1] = "Qu'est-ce que le diaphragme ?$A. Un os $B. Un muscle $C. Une vertèbre$D. Un tendon$2";
                easyQuestions[2] = "Comment nomme-t-on l’effet d’une glycémie trop élevée ?$A. L’hypoglycémie $B. Les triglycérides $C. L’hyperglycémie$D. L’aérophagie$3";
                easyQuestions[3] = "Qui a découvert la pénicilline ?$A. Louis Pasteur$B. Alexander Fleming$C. Marie Curie$D. Robert Koch$2";
                easyQuestions[4] = "A quoi est allergique un patient souffrant de maladie coeliaque ?$A. Au lait$B. Aux protéines$C. Au gluten$D. Aux acariens$3";
                easyQuestions[5] = "Quel(s) organe(s) peuve(nt) être touché(s) d'un infarctus ?$A. Le coeur$B. L'os$C. Le poumon$D. Tous$4";
                easyQuestions[6] = "Comment appelle-t-on le fait de saigner du nez ?$A. Un asterixis$B. Une épistaxis$C. Une épistaxis$D. Un nasohemesis$2";
                easyQuestions[7] = "Quelle plante a des vertus anti-dépressives ?$A. Le millepertuis$B. La chélidoine$C. La verveine$D. La menthe$1";

		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public SanteQuestions(int diff){
		normalQuestions[1] = "Quel est l'outil que porte le médecin autour du cou ?$A. Stéthoscope $B. Caléidoscope $C. Télescope $D. Fibroscope$1";
		normalQuestions[2] = "Comment appelle-t-on l'os du genou ?$A. La clavicule $B. L'humérus $C. Le sacrum $D. La rotule$4";
		normalQuestions[3] = "Quelle est la durée de vie d'un spermatozoïde ?$A. 4 à 6 heures $B. 12 à 14 heures $C. 24 à 48 heures $D. 3 à 4 semaines$3";
		normalQuestions[4] = "Combien de fausses côtes avons-nous ?$A. 7$B. 5$C. 3$D. 2$3";
		normalQuestions[5] = "Où se trouvent les sutures dans le corps ?$A. Le crâne$B. Les pieds$C. La cage thoracique$D. Les mains$1";
		normalQuestions[6] = "Quelle plante était utilisée pour dilater les pupilles des jeunes femmes ?$A. La digitale$B. La Belladone$C. La chélidoine$D. Le chardon$2";
		normalQuestions[7] = "Sur quel os se trouve l'olécrane ?$A. Radius$B. Ladius$C. Cubitus$D. Humérus$3";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public SanteQuestions(int diff,int diffi){
		hardQuestions[1] = "À quel scientifique doit-on l’œuvre « Canon de la médecine » ?$A. Hippocrate $B. Averroès $C. Averroès$D. Avicenne $4";
		hardQuestions[2] = "Dans quelle partie du corps humain se trouve la malléole ?$A. La cheville $B. Le coude $C. L'épaule $D. Le cou$1";
		hardQuestions[3] = "Selon leur positionnement, les aponévroses sont aussi nommées...$A. Coiffes$B. Fascias$C. Muscles$D. Os$2";
		hardQuestions[4] = "Sur quel os se trouve l'olécrane ?$A. Radius$B. Ladius$C. Cubitus$D. Humérus$3";
		hardQuestions[5] = "Quel organe fait partie de l'appareil manducateur ?$A. La langue$B. La vessie$C. Le foie$D. Le coeur$1";
		hardQuestions[6] = "Quel est l'autre nom du péroné ?$A. Fibula$B. Scapula$C. Patella$D. Zygomia$1";
		hardQuestions[7] = "Comment s'appelle la phase de contraction du coeur ?$A. La diastole$B. La projection$C. L'expulsion$D. La systole$4";


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

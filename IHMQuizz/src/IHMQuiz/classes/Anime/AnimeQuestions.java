/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.Anime;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class AnimeQuestions {

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
        
        
        
        
        
	public AnimeQuestions() {
            
              
                easyQuestions[1] = "Dans \"Code Geass\", le héro s'appelle...$A. Koichi Sakakibara$B. Mello$C. Jean Kirschtein$D. Lelouch Lamperouge$4";
                easyQuestions[2] = "Qui dit cette phrase : «Je serai le dieu car je suis la justice !» ?$A. Light Yagami$B. Naruto$C. Yasuo$D. Luffy$1";
                easyQuestions[3] = "Qui dit cette phrase : «Yes, my Lord» ?$A. Lucy Heartfilia$B. Sebastian Michaelis$C. Kirito$D. Izumi Aizawa$2";
                easyQuestions[4] = "\"Attrapez-les tous\", il s'agit du slogan de :$A. Bleach$B. Pokémon$C. Naruto$D. Code Geass$2";
                easyQuestions[5] = "De quel anime vient cet opening : «Oshiete Oshiete yo sono shikumi wo...» ?$A. Kill La Kill$B. Dragon Ball Z$C. Tokyo Ghoul$D. Jojo$3";
                easyQuestions[6] = "Dans \"Pokémon\", le type favori d'Ondine est...$A. Psy$B. Eau$C. Feu$D. Sol$2";
                easyQuestions[7] = "Au contact de l'eau froide, ce personnage masculin se transforme en une ravissante jeune fille: $A. Dragon Ball$B. Naruto$C. Ranma 1/2$D. Bleach$3";


		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public AnimeQuestions(int diff){
		normalQuestions[1] = "Dans Noragami, l'héroïne s'appelle...$A. Ayakashi$B. Yukine$C. Hiyori$D. Sakura$3";
		normalQuestions[2] = "Le frère de Sasuke ( Naruto ) s'appelle...$A. Kisame$B. Itachi$C. Pain$D. Nagato$2";
		normalQuestions[3] = "Le Mangaka de Naruto est$A. Masashi Kishimoto$B. Eichiro Oda$C. Tite Kubo$D. Hiro Mashima$1";
		normalQuestions[4] = "Qui est le père de Luffy ( One Piece )?$A. Garp$B. Gol D Roger$C. Ace$D. Dragon$4";
		normalQuestions[5] = "Dans Deadman Wonderland, le «surnom» de Shiro est...$A. WhiteSkin$B. Destroy$C. Péché Originel$D. Rainy$3";
		normalQuestions[6] = "Le Quirk de Izuku Midoriya dans MHA est:$A. All for One$B. One For All$C. Engine$D. Zero Gravity$2";
		normalQuestions[7] = "Le vilain principal de Naruto Shippuden est:$A. Nagato$B. Madara$C. Obito$D. Kaguya$4";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public AnimeQuestions(int diff,int diffi){
		hardQuestions[1] = "Trouvez l'intrus :$A. Goku$B. Freezer$C. Vegeta$D. Gohan$2";
		hardQuestions[2] = "Qui est Cell dans Dragon Ball Z?$A. Un Saiyan$B. Le frère de Boubou$C. Un cyborg$D. Un Namékien$3";
		hardQuestions[3] = "Trouve la bonne orthographe :$A. Gendikama$B. Genkidama$C. Genkadima$D. Gendakima$2";
		hardQuestions[4] = "Qui tue Nappa ?$A. Goku$B. Piccolo$C. Vegeta$D. Gohan$3";
		hardQuestions[5] = "Qui a aidé Obito à donner son Sharingan à Kakashi ?$A. Naruto$B. Rin$C. Tsunade$D. Kunai$2";
		hardQuestions[6] = "Quel est le vrai nom du \"Croc Blanc de Konoha\" ?$A. Shakimi$B. Daroso$C. Sakumo$D. Obito$3";
		hardQuestions[7] = "Qui est Asuma dans Naruto?$A. un Sensei$B. Le fils de Sandaime$C. Le mari de Tsunade$D. L'ermite$1";


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

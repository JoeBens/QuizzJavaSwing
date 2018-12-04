/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.Musique;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class MusicQuestions {

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
        
        
        
        
        
	public MusicQuestions() {
            
              
                easyQuestions[1] = "De quel groupe Fergie est-elle la chanteuse ?$A. Evanescence$B. Black Eyed Peas $C. No Doubt$D. Pussycat Dolls$2";
                easyQuestions[2] = "Quel acteur et chanteur français a pour vrai nom Ivo Livi ?$A. Yves Montand$B. Charles Aznavour$C.Eddy Mitchell$D. Serge Reggiani$1";
                easyQuestions[3] = "De quel groupe Muriel Moreno est-elle la chanteuse ?$A. La Compagnie Créole$B. Les Rita Mitsouko $C. Autour de Lucie$D. Niagara$4";
                easyQuestions[4] = "Quel est l'instrument de prédilection de Jerry Lee Lewis ?$A. La guitare$B. Le saxophone $C. Le piano$D. La trompette$3";
                easyQuestions[5] = "Qui a remporté la finale de \"Nouvelle Star\" en 2007 ?$A. Amandine Bourgeois $B. Julien Doré $C. Christophe Willem$D. Soan$2";
                easyQuestions[6] = "Quel chanteur a réalisé l’album \"Finistériens\" en 2009 ?$A. Yann Tiersen $B. Renan Luce $C. Christophe Miossec$D. Alan Stivell$3";
                easyQuestions[7] = "En 1989, quel groupe sort la chanson \"Mandela Day\" ?$A. Tears for fears$B. The Who$C. U2$D. Simple Minds$4";
  

		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public MusicQuestions(int diff){
                normalQuestions[1] = "Quel chanteur est marié au mannequin Heidi Klum ?$A. Seal$B. Justin Timberlake $C. Daniel Powter $D. Eagle Eye Cherry$1";
                normalQuestions[2] = "Quel groupe interprète le titre « Breathless » ?$A. Spice Girls $B. Destiny's Child $C. Pussycat Dolls $D. The Corrs$4";
                normalQuestions[3] = "Quelle chanteuse a interprété le titre « Hot'N Cold » ?$A. Nelly Furtado $B. Shania Twain$C. Duffy$D. Katy Perry$4";
                normalQuestions[4] = "Quelle chanteuse a interprété le titre « Tu trouveras » ?$A. Amel Bent $B. Natasha St Pier $C. Isabelle Boulay$D. Zazie$2";
                normalQuestions[5] = "Quel DJ a sorti le tube « Love is gone » ?$A. Bob Sinclar$B. Laurent Garnier$C. Martin Solveig$D. David Guetta$4";
                normalQuestions[6] = "À quel groupe doit-on le tube « The Reason » ?$A. Incubus$B. Hoobastank$C. Linkin Park$D. The Rasmus$2";
                normalQuestions[7] = "À quelle chanteuse doit-on le titre « Toxic » ?$A. Madonna$B. Sharleen Spiteri$C. Shania Twain$D. Britney Spears$4";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public MusicQuestions(int diff,int diffi){
                hardQuestions[1] = "Quel groupe de rock a chanté  « Walk like an Egyptian » ?$A. Bananarama$B. The Bangles $C. The Smiths$D. Depeche Mode$2";
                hardQuestions[2] = "Quel est le premier tube d’Elsa ?$A. Jour de neige$B. Toi$C. T’en va pas $D. Un roman d’amitié$3";
                hardQuestions[3] = "Qui a interprété « le Youki » ?$A. Richard Gotainer$B. Carlos$C. Le Grand Orchestre$D. Francis Lalanne$1";
                hardQuestions[4] = "Quel chanteur a interprété « Master Blaster » ?$A. Ray Charles$B. Michael Jackson$C. Billy Joel$D. Stevie Wonder$4";
                hardQuestions[5] = "Quelle chanson n’a pas été interprétée par Sade ?$A. I don’t want a lover$B. Sweetest Taboo $C. Your love is King $D. Smooth Operator$1";
                hardQuestions[6] = "Quel a été le premier tube du groupe Gold ?$A. Ville de lumière $B. Plus près des étoiles $C. Capitaine abandonné $D. Laissez-nous chanter$2";
                hardQuestions[7] = "Qui a chanté le titre « Under Pressure » avec le groupe Queen ?$A. Iggy Pop$B. Bono$C. David Bowie$D. Prince$3";



		hardQuestion = hardQuestions[rngH(1, 7)];
                
                
                
              
        }


	public int rng(int min, int max) {

		

		guess = (int) ((max - min) * Math.random() + min);

		if (list.contains(guess)) {
			rng(1, 8);
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

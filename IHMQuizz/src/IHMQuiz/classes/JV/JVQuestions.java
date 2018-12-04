/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.JV;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class JVQuestions {

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
        
        
        
        
        
	public JVQuestions() {
            
              
                easyQuestions[1] = "Dans \"Mario Kart\", quel personnage n'existe pas ?$A. Bébé Kong$B. Koopa$C. Daisy$D. Waluigi$1";
                easyQuestions[2] = "Qui est le développeur de \"Clash of Clans\" ?$A. Nintendo$B. Ubisoft$C. RobTop Games$D. Supercell$4";
                easyQuestions[3] = "Quelle est la monnaie des \"Sims\" ?$A. Simcity$B. Simflouz$C. Simdollars$D. Simish$2";
                easyQuestions[4] = "Dans \"Minecraft\", combien de points de vie le joueur possède-t-il ?$A. 30$B. 45$C. 20$D. 15$3";
                easyQuestions[5] = "Combien existe-t-il de jeux de la série \"Five Nights at Freddy's\" ?$A. 3$B. 6$C. 2$D. 7$1";
                easyQuestions[6] = "Quelle princesse se fait enlever dans \"New Super Mario Bros\" ?$A. Daisy$B. Peach$C. Harmonie$D. Pauline$2";
                easyQuestions[7] = "De quelle célèbre série d’infiltration Sam Fisher est-il le héros ??$A. Metal Gear$B. Splinter Cell$C.  Tenchu$D. Hitman$2";

		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public JVQuestions(int diff){
		normalQuestions[1] = "Lequel de ces personnages n'est pas issu de l'univers de Mario?$A. Peach$B. Tails$C. Bowser$D. Toad$2";
		normalQuestions[2] = "Dans la série Devil May Cry, comment Dante a t’il baptisé ses pistolets ?$A. Black & White$B. Agni & Rudra$C. Jackal & Casull$D. Ebony & Ivory$4";
		normalQuestions[3] = "Quelle est la profession de Gordon Freeman, le héros de Half-Life ?$A. Policier$B. Marine$C. Espion$D. Scientifique$4";
		normalQuestions[4] = "Comment se nomme le troisième volet de la série The Elder Scrolls ?$A. Skyrim$B. Oblivion$C. Morrowind$D. Daggerfall$3";
		normalQuestions[5] = "Lequel de ces jeux n’est pas issu de la licence « Tom Clancy’s » ?$A. Ghost Recon$B. Rainbow Six$C. Call Of Duty$D. Splinter Cell$3";
		normalQuestions[6] = "Dans Halo, qu'est ce qu'un « Covenant » ?$A. Un vaisseau spacial$B. Un extra-terrestre$C. Un pistolet laser$D. Un grade militaire$2";
		normalQuestions[7] = "Dans Beyond Good & Evil, avec quelle arme Jade, l'héroïne, se bat-elle ?$A. Un revolver$B. Un katana$C. Une hache$D. Un bâton$4";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public JVQuestions(int diff,int diffi){
		hardQuestions[1] = "Dans quel lieu se déroule entièrement l'action de Bioshock ?$A. Cité sous-marine $B. Une base militaire$C. Un vaisseau$D. Jungle tropicale$1";
		hardQuestions[2] = "Quel jeu propose d'incarner une déesse réincarnée en loup ?$A. Okami$B. Ico$C. God Hand$D. Genji$1";
		hardQuestions[3] = "Quel est le dernier opus de la franchise Assassin's Creed?$A. Syndicate$B. Unity$C. Odyssey$D. Black Flag$3";
		hardQuestions[4] = "Comment se nomme le personnage principal de la série Metroid?$A. Dante$B. Samus$C. Ray$D. Sonic$2";
		hardQuestions[5] = "Quel est le meilleur jeu de l'année 2017?$A. Horizon$B. Persona 5$C. Origins$D. Zelda$4";
		hardQuestions[6] = "Quelle est la profession de Max Payne, héros du jeu d'action éponyme $A. Policier$B. Espion$C. Scientifique$D. Marine$1";
		hardQuestions[7] = "Dans la série Hitman, que représente le tatouage que Code 47 a sur la nuque ?$A. Une croix$B. Un code-barres$C. Le nombre 47$D. Un dragon$2";


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

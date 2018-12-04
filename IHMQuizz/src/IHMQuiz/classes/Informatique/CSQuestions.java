/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMQuiz.classes.Informatique;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joe
 */
public class CSQuestions {

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
        
        
        
        
        
	public CSQuestions() {
            
              
                easyQuestions[1] = "Un écran est composé de:$A. Pixels$B. Points$C. Cubis$D. Tris$1";
                easyQuestions[2] = "Lequel de ces langages n'est pas un langage de POO?$A. C++$B. Java$C. C#$D. C$4";
                easyQuestions[3] = "Une adresse IP se code sur :$A. 4 bits$B. 8 bits$C. 16 bits$D. 32 bits$4";
                easyQuestions[4] = "40 s'écrit en binaire :$A. 00000001$B. 00010000$C. 00101000$D. 10000000$3";
                easyQuestions[5] = "8 bit forment combien d'octets ? $A. 1 Kilo octet$B. 1 octet$C. 2048 octets$D. 1024 octets$2";
                easyQuestions[6] = "Que signifie l’action \"Drag and Drop\" ?$A. Copier/coller$B. Couper/coller$C. Couper/déposer$D. Glisser/déposer$4";
                easyQuestions[7] = "Comment appelle-t-on l´écran de l’ordinateur ?$A. L´unité centrale$B.  Le CPU$C. Le GPU$D. Le moniteur$4";

		easyQuestion = easyQuestions[rng(1, 7)];
                
                


	}
        public CSQuestions(int diff){
		normalQuestions[1] = "On mesure la fréquence d'un microprocesseur :$A. En Ko$B. En MHz$C. En GHz$D. En décibels$2";
		normalQuestions[2] = "Que tape t-on sous linux en mode console pour redémarrer son ordinateur ?$A. reboot$B. shutdown$C. sh$D. sleep$2";
		normalQuestions[3] = "Les disques durs peuvent être au format :$A. SATA (serial ATA)$B. IDE$C. SCSI$D. CI Express$1";
		normalQuestions[4] = "Les programmes sont aussi appelés:$A. Partitions$B. Interfaces$C. Logiciels$D. Exécutables$3";
		normalQuestions[5] = "Quelle est la combinaison de touches qui permet de sélectionner tout?$A. Ctrl + A$B. Ctrl + B$C. Ctrl + C$D. Ctrl + S$1";
		normalQuestions[6] = "Quel est le langage le plus courant utilisé pour écrire les pages web ?$A. XML$B. Java$C. C++$D. HTML$4";
		normalQuestions[7] = "Qu’est-ce qu’un CPU ?$A. Une alimentation$B. Un disque dur$C. Une carte video$D. Un processeur$4";

		normalQuestion = normalQuestions[rngN(1, 7)];
                
                
              
        }
        public CSQuestions(int diff,int diffi){
		hardQuestions[1] = "Quelle est l'autre dénomination des écrans plats ?$A. Cathodiques$B. TFT$C. CRT$D. Photoniques$2";
		hardQuestions[2] = "Mon écran affiche 1280 pixels en largeur et 1024 pixels en hauteur, ça s'appelle:$A. Sa définition$B. Sa taille$C. Sa résolution$D. Sa révolution$3";
                hardQuestions[3] = "Quel est le langage le plus utilisé dans le développement des jeux vidéos?$A. C++$B. Java$C. HTML$D. CSS$1";
		hardQuestions[4] = "Quel est le nom du système d'exploitation mis au point par Google ?$A. Google OS$B. Chrobuntu$C. Chrome$D. Chrome OS$4";
		hardQuestions[5] = "Que veut dire IP?$A. Internet Protocol$B. Internet Postal$C. Internet Pratique$D. Internet Place$1";
		hardQuestions[6] = "Le CEO d'Amazon est:$A. Bill Gates$B. Steve Jobs$C. Elon Musk$D. Jeff Bezos$4";
		hardQuestions[7] = "Lequel de ces langages n'est pas un langage de programmationd de bas-niveau?$A. C$B. C++$C. Python$D. Assembly$3";


		hardQuestion = hardQuestions[rngH(1, 7)];
                
                
                
              
        }


	public int rng(int min, int max) {

		

		guess = (int) ((max - min) * Math.random() + min);

		if (list.contains(guess)) {
			rng(1,7);
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

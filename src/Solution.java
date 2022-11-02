/**
 * 
 * @author alexis__memo
 * 
 */
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException{
	Scanner in = new Scanner(System.in);
	Scanner inFile= new Scanner(new File("poem1.txt"));//can also try poem 2
	int score=0;
	int i=0;
	int syllable=0;
	int pos=0;
	String line;
	while(inFile.hasNextLine()) {
		line=(inFile.nextLine());
		String[] linewords = line.split(" ");


		if (linewords.length==6) {
			score+=5;

		}
		else if(linewords.length<6) {
			score-=3;

		}
		else  {
			score-=5;

		}
		System.out.println(score);
		while (i<linewords.length) {
			while(pos<linewords[i].length()) {
				if (((linewords[i].charAt(pos)=='a')||(linewords[i].charAt(pos)=='i')||
						(linewords[i].charAt(pos)=='u')||(linewords[i].charAt(pos)=='e')||
						(linewords[i].charAt(pos)=='o'))) {
					
				syllable+=1;
					pos+=1;
					
				}
				
					
				else {
					
					pos+=1;
				}
			}
				if (syllable==2) {
					score+=2;
				}
					else if(syllable<2) {
						score+=1;
					}
					else {
						score-=5;
					}
			//}
			
				i+=1;
				
				pos=0;
		
		}
	}

	System.out.println(score);

}	
}





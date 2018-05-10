/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	            	 Player player=new Player();
	                String line = scanner.nextLine();
	                String[] Player=line.split(",",0);
	               
	                player.setPosition(Player[0]);
	                player.setName(Player[1]);
	                player.setCountry(Player[2]);
	                player.setTeam(Player[3]);  
	                array.add(player);
	                }
	                
	            } catch (FileNotFoundException e) {
	            	e.printStackTrace();
				}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        ArrayList<String> ALL=new ArrayList<>();
	        for(Player player:array) {
        		ALL.add(player.toString());
        	}
	        Collections.shuffle(ALL);
	        for(String GK:ALL) {
	        	if(GK.contains("GK")) {
	        		System.out.println(GK);
	        		break;
	        	}
	        }
	        int df=0;	
	        for(String DF:ALL) {
		        if(DF.contains("DF")) {
		        	System.out.println(DF);
		        	df++;
	            }
		        if(df==4) {
		        	break;
		        }
	        }
		        int mf=0;	
		        for(String MF:ALL) {
			        if(MF.contains("MF")) {
			        	System.out.println(MF);
			        	mf++;
		            }
			        if(mf==4) {
			        	break;
			        } 
		        }
			        int fw=0;	
			        for(String FW:ALL) {
				        if(FW.contains("FW")) {
				        	System.out.println(FW);
				        	fw++;
			            }
				        if(fw==2) {
				        	break;
				        }
			        }
	}
}
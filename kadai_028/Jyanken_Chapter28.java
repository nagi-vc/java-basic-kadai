package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private Scanner scanner = new Scanner(System.in);
	
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String choice = scanner.nextLine();
		while(!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
			System.out.println("正しく入力してください");
			choice = scanner.nextLine();
		}
		
		return choice;
	}
	public String getRandom() {
		String[] fightHands = {"r" , "s" , "p"};
		int i = (int) (Math.floor(Math.random() * 3));
		return fightHands[i];
	}
	
	public void playGame() {
		HashMap <String,String> handsMap = new HashMap<>();
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		String myChoice = getMyChoice();
		String pcChoice = getRandom();
		
		System.out.println("自分の手は" + handsMap.get(myChoice) + ",対戦相手の手は" + handsMap.get(pcChoice));
		
		if (myChoice.equals(pcChoice)) {
			System.out.println("あいこです");
		}else if ((myChoice.equals("r") && pcChoice.equals("s")) ||
				  (myChoice.equals("s") && pcChoice.equals("p")) ||
				  (myChoice.equals("p") && pcChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}

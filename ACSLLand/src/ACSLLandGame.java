import java.util.*;
public class ACSLLandGame {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean checkA = true;
	boolean checkB = true;
	Player A = new Player();
	Player B = new Player();
//	for(int i = 0; i < 5; i++){
	System.out.println(input.nextInt());
		while((checkA || checkB) && input.nextInt() != 0){
			movePlayer(A, input.nextInt());
			if(A.getPosition() == B.getPosition()){
				B.setPosition(0);
			}
			movePlayer(B, input.nextInt());
			if(B.getPosition() == A.getPosition()){
				A.setPosition(0);
			}
			checkA = checkIfEnd(A);
			checkB = checkIfEnd(B);
		}
	}
	

//	}
	public static void movePlayer(Player player, int currentRoll){
		int addToPosition = checkPenalty(currentRoll, player);
		player.setPosition(player.getPosition() + addToPosition);
	}
	public static int checkPenalty(int currentRoll, Player player){
		if(currentRoll == 4 || currentRoll == 6){
			if(player.getPosition() - currentRoll < 0){
				return -player.getPosition();
			}else{
				return -currentRoll;
			}
		}else{
			return currentRoll;
		}
}
	public static boolean checkIfEnd(Player player){
		if(player.getPosition() >= 41){
			return false;
		}else{
			return true;
		}
	}
	

}

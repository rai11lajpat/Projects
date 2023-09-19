import java.util.Random;
import java.util.Scanner;
class PlayGame {
    private int rand;
    int targetNum;
    int count;
    int attempts=4;
    int score=0;
    public void takeInput() {
        Random randomGenerator = new Random();
        this.rand =randomGenerator.nextInt(21);
        Scanner sc=new Scanner(System.in);
        do{
            count++;
            System.out.print("guess the number btween(1 to 20):");
            targetNum=sc.nextInt();
            checkIsCorrectNumber(targetNum);
            if(attempts==0){
                break;
            }
        }while(rand!=targetNum);
        
    }

    public void checkIsCorrectNumber(int targetNum) {
        if(rand==targetNum){
            System.out.println("CONGRATS");
            score++;
        }
        else{
           attempts--;
           {
            if(targetNum>rand){
                System.out.println("Guess is too high");
            }
            else if(targetNum<rand){
                System.out.println("Guess is too low");
            }
           }
           if(attempts!=0){
                System.out.println("Try again");
            }
           System.out.println("Remaing attempts: "+ attempts);
        }
    }

    
}

//main Class
public class guessGame{
	public static void main(String[] args) {
        int totalPlay=0;
        PlayGame game= new PlayGame();
        Scanner s= new Scanner(System.in);
        int n;
        do{
            System.out.println("____________________________________");
            System.out.println("Game played:"+ totalPlay);
            System.out.println("Score:"+ game.score);
            System.out.println("____________________________________"); 
            System.out.println("play Game?");
            System.out.print("If yes Enter 1:");
            n=s.nextInt();
            
            if(n==1){
                totalPlay++;
                game.attempts=4;
                game.takeInput();
            }
            else{
                break;
            }
            }while(n!=0);
            System.out.println("____________________________________");
            System.out.println("Game played:"+ totalPlay);
            System.out.println("Score:"+ game.score);
            System.out.println("____________________________________"); 
}

}
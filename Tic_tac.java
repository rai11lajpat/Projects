import java.util.Scanner;

public class Tic_tac {
    public static void print(char[][] a){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void player1(char a,char[][] t){
        switch (a){
            case '1':{t[0][0]='X';}
                break;
            case '2':{t[0][1]='X';}
                break;
            case '3':{t[0][2]='X';}
                break;
            case '4':{t[1][0]='X';}
                break;
            case '5':{t[1][1]='X';}
                break;
            case '6':{t[1][2]='X';}
                break;
            case '7':{t[2][0]='X';}
                break;
            case '8':{t[2][1]='X';}
                break;
            case '9':{t[2][2]='X';}
                break;
        }
    }
    public static void player2(char a,char[][] t){
        switch (a){
            case '1':{t[0][0]='O';}
                break;
            case '2':{t[0][1]='O';}
                break;
            case '3':{t[0][2]='O';}
                break;
            case '4':{t[1][0]='O';}
                break;
            case '5':{t[1][1]='O';}
                break;
            case '6':{t[1][2]='O';}
                break;
            case '7':{t[2][0]='O';}
                break;
            case '8':{t[2][1]='O';}
                break;
            case '9':{t[2][2]='O';}
                break;
        }
    }
    public static boolean win(char[][] a){
        if(a[0][0]=='X'&&a[0][1]=='X'&&a[0][2]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[1][0]=='X'&&a[1][1]=='X'&&a[1][2]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[2][0]=='X'&&a[2][1]=='X'&&a[2][2]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][0]=='X'&&a[1][0]=='X'&&a[2][0]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][1]=='X'&&a[1][1]=='X'&&a[2][1]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][2]=='X'&&a[1][2]=='X'&&a[2][2]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X'){
            System.out.println("player 1 win.");
            return false;
        }
        else if(a[0][0]=='O'&&a[0][1]=='O'&&a[0][2]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[1][0]=='O'&&a[1][1]=='O'&&a[1][2]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[2][0]=='O'&&a[2][1]=='O'&&a[2][2]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[0][0]=='O'&&a[1][0]=='O'&&a[2][0]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[0][1]=='O'&&a[1][1]=='O'&&a[2][1]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[0][2]=='O'&&a[1][2]=='O'&&a[2][2]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        else if(a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O'){
            System.out.println("player 2 win.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.err.println();
        char[][] t={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        Scanner s=new Scanner(System.in);
        print(t);
        while(win(t)){
        System.out.print("player 1:");
        char p1=s.next().charAt(0);
        player1(p1, t);
        System.out.println();
        print(t);
        if(!win(t)==false){
        System.out.print("player 2:");
        char p2=s.next().charAt(0);
        player2(p2, t);
        print(t);
        }
    }

    }
}
 
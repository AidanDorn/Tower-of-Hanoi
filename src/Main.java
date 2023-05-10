//Aidan Dorn, CS 145, May 10, 2023
public class Main {
    public static void main(String[] args) {
        move(4,"tower1","tower2","tower3");
    }
    public static void move(int n, String t1, String t2, String t3){
        if(n==1){
            System.out.println("Moved "+t1+" to "+t3);
        } else{
            move(n-1,t1,t3,t2); //Recursion
            System.out.println("Moved "+t1+" to "+t3);
            move(n-1,t2,t1,t3); //Recursion
        }
    }
}
/* Aidan Dorn, CS 145, May 10, 2023
When writing this code I thought it was important to remember that the goal
is to generate a solution to the Hanoi tower problem for the user to read
rather than generating the disks and the towers as objects that had to be
Move around within the code. This realization that the goal is not to
actually move objects within the program but rather to tell the user a solution
helped to keep the code simple.
 */

public class Main {
    // The main method here only initiates the recursion loop, this main method runs only once.
    public static void main(String[] args) {
        move(4,"tower1","tower2","tower3");
    }
    // Parameters: n represents the disk quantity, t stands for tower, where the disks stack.
    public static void move(int n, String t1, String t2, String t3){
         /*
             When there is only one disk it moves the top disk from tower 1 to tower 3
             it is also important to note that a tower may be empty but this does
             not interfere with the successful completion of the problem.
            */
        if(n==1) {
            System.out.println("Move " + t1 + " to " + t3);
        }
        else{
            move(n-1,t1,t3,t2); //Recursion
            System.out.println("Move "+t1+" to "+t3);
            move(n-1,t2,t1,t3); //Recursion
        }
    }
}
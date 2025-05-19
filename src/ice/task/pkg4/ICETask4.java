/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg4;

/**
 *
 * @author RC_Student_lab
 */
public class ICETask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int i = 1; i<=50; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}

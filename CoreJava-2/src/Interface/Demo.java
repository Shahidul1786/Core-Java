/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Shahidul
 */
public class Demo implements FirstInterface,SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("first interfaces"); 
    }

    @Override
    public void SecondMethod() {
        
        System.out.println("second intertfaces");
        
    }
    
}

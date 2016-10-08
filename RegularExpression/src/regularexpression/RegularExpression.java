/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author saiful
 */
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        findDigit();
    }
    
    private static void findDigit(){
        String input = "Your account has been refilled successfully by TK40.0. "
                + "Your Transaction ID is BD7100817320631..";
        String REGEX = "(.TK)(\\d+)(.\\d+)";
        
        
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(input);
        
        if(m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("No Match");
        }
        
    }
    
}

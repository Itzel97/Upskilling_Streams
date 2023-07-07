
package upskilling_streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Upskilling_Streams {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <Integer> num = new ArrayList();
        num.add(1);
        num.add(785);
        num.add(224);
        num.add(35);
        num.add(86);
        num.add(320);
        num.add(15);
        num.add(26);
        num.add(46);
        num.add(78);
        
        List <Integer> numPar = num.stream()
                                  .filter(e -> e%2 == 0)
                                  .collect(Collectors.toList());
        
                                  
        System.out.println(numPar.toString());
        
         List <Integer> numInPar = num.stream()
                                  .filter(e -> e%2 != 0)
                                  .collect(Collectors.toList());
        
                                  
        System.out.println(numInPar.toString());
        
        
        Integer second = num.stream()
                                .distinct()
                                .sorted ((a,b)-> Integer.compare(b,a))
                                .skip(1)
                                .findFirst()
                                .orElse(null);
        
    }
    
}

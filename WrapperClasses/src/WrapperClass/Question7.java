package WrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class Question7 {
    static void main(String[] args) {
        double[] prices={10.5,20.0,35.75,5.5};
        ArrayList<Double> list=new ArrayList<Double>();
        for(double p:prices){
            list.add(p);
        }
        double max= Collections.max(list);
        double sum=0;
        for(double p:list){
            sum+=p;
        }
        double avg=sum/list.size();
        System.out.println("Highest price: "+max);
        System.out.println("Average price: "+avg);
    }
}

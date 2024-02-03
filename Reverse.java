import java.lang.String;
import java.util.Arrays;

class DaysWeek {
    String days;
    DaysWeek(String days){
        this.days=days;
    }
    void reverse(){
        String daysArray[]=days.split(" ");
        int l=daysArray.length;
        StringBuilder daysWeek=new StringBuilder();
        for(int i=l-1; i>=0; i--){
            daysWeek.append(daysArray[i]).append(" ");
        }
        System.out.println(daysWeek.toString().trim());
    }
}

public class Reverse{
    public static void main(String args[]){
        DaysWeek d1=new DaysWeek("Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
        d1.reverse();  
    }
}

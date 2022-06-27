package LogicalPrograme;

public class LeapYear {
    public static void main(String[] args){
        //A year which is divisible by 4 for all the century years-> ending with 00 like;2000, 1800
        //Century Year is a leap year only when it's perfectly divisible by 400
        //1900 is not a leap year because it is not divisible by 4
        //2012 is a leap year,but it is not a Century Year -> because it is divisible by 4
        int year=2012;
        boolean leap= false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            else {
                leap=true;
            }
        }
        else {
            leap=false;
        }
        if(leap){
            System.out.println(year+" "+"is a leap year");
        }
        else {
            System.out.println(year+" "+"is not a leap year");
        }
    }
}

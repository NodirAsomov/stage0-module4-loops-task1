package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        String s1 = "\n"+"writing the same code doesn't have much impact, and it's also time-consuming"+"\n";
        String s3 = s1 + s1 + s1;
        String s10 = s3 + s3 + s3 + s1;
        String s20 = s10 + s10 ;
        //String s100 = s30 + s30 + s30 + s10;
        //String s300 = s100 + s100 + s100;
        //String s1000 = s300 + s300 + s300 + s100;
        System.out.print(s20);
        //System.out.println("writing the same code doesn't have much impact, and it's also time-consuming");


    }



    public static void main(String[] args) {
        RepeatIsBad repeatIsBad1 = new RepeatIsBad();
        repeatIsBad1.repeatIsBad();
    }
}

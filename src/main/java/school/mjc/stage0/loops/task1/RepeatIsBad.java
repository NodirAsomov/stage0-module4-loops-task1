package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {

        System.out.print( "writing the same code doesn't have much impact, and it's also time-consuming\n");
        repeatIsBad();}








    public static void main(String[] args) {
        RepeatIsBad repeatIsBad1 = new RepeatIsBad();
        repeatIsBad1.repeatIsBad();
    }
}

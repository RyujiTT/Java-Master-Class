public class MegaBytesAndKiloByetsConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {

            System.out.println("Invalid Value");

            return;

        }



        int megaBytes = kiloBytes / 1024;

        int remainingKB = kiloBytes % 1024;



        System.out.println(kiloBytes + " KB = " +

                megaBytes + " MB and " +

                remainingKB + " KB");
    }
}

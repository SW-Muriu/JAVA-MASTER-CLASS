package HelloWorld;

public class MegBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-50);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        System.out.println(((kiloBytes)<0)? "Invalid Value" : (kiloBytes +
                " KB = " +
                ((kiloBytes - (kiloBytes%1024))/1024) +
                " MB and " + (kiloBytes%1024) + " KB"));
    }
}



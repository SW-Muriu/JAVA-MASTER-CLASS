package Encapsulation.Challenges.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(76,true);
        printer.printPages(5);
        System.out.println(printer.getPagesPrinted());
        printer.addToner(76);
        System.out.println(printer.getTonerLevel());
    }
}

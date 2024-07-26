package Encapsulation.Challenges.Printer;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this(tonerLevel, duplex);
        this.pagesPrinted = pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int newLevel = this.tonerLevel + tonerAmount;
        this.tonerLevel = (newLevel < 0 || newLevel > 100) ? -1 : newLevel;
        return this.tonerLevel;

    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }


}

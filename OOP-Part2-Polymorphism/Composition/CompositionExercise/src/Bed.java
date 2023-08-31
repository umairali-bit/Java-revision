public class Bed {

    private String style;
    private int sheets;
    private int quilt;
    private int pillows;
    private int height;

    public Bed(String style, int sheets, int quilt, int pillows, int height) {
        this.style = style;
        this.sheets = sheets;
        this.quilt = quilt;
        this.pillows = pillows;
        this.height = height;
    }

    public void make(){
        System.out.print("Bed -> Making | ");

    }

    public String getStyle() {
        return style;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }
}

public class UC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Combine O O P S into banner lines
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method to build O pattern
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to build P pattern
    public static String[] getPPattern() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to build S pattern
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }
}
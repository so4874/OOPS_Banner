public class UC5 {

    public static void main(String[] args) {

        // Inline declaration and initialization using String.join()
        String[] banner = {
                String.join("", " OOO  ", "  OOO  ", " PPPP  ", "  SSSS "),
                String.join("", "O   O ", " O   O ", " P   P ", " S     "),
                String.join("", "O   O ", " O   O ", " PPPP  ", "  SSS  "),
                String.join("", "O   O ", " O   O ", " P     ", "     S "),
                String.join("", " OOO  ", "  OOO  ", " P     ", " SSSS  ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
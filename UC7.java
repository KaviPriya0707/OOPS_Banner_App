public class UC7 {

    /**
     * Inner Static Class to store Character and its Pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap getOPattern() {
        return new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    public static CharacterPatternMap getPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    public static CharacterPatternMap getSPattern() {
        return new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}
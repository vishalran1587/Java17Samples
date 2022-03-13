public class TextBlocks {
    public static void main(String[] args) {
        String textBlockSample = """
                Hello World!
                Hello \
                World
                "Hello World!"
                Hello %s
                """.formatted("World!");
        System.out.println(textBlockSample);
    }
}

//MEHMET MERT MENEVŞE 02205076048
public class MainApp {

    public static void main(String[] args) {

        Huffman huffman = new Huffman("aaaaaaaabbbbbbbccccdd");

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);

    }
}
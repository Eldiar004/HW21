import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("alphabet.txt");
        writer.write("1:A a\n");
        writer.write("2:B b\n");
        writer.write("3:C c\n");
        writer.write("4:D d\n");
        writer.write("5:E e\n");
        writer.write("6:F f\n");
        writer.write("7:G g\n");
        writer.write("8:H h\n");
        writer.write("9:I i\n");
        writer.write("10:J j\n");
        writer.write("11:K k\n");
        writer.write("12:L l\n");
        writer.write("13:M m\n");
        writer.write("14:N n\n");
        writer.write("15:O o\n");
        writer.write("16:P p\n");
        writer.write("17:Q q\n");
        writer.write("18:R r\n");
        writer.write("19:S s\n");
        writer.write("20:T t\n");
        writer.write("21:U u\n");
        writer.write("22:V v\n");
        writer.write("23:W w\n");
        writer.write("24:X x\n");
        writer.write("25:Y y\n");
        writer.write("26:Z z\n");
        writer.write("27:0\n");
        writer.write("28:1\n");
        writer.write("29:2\n");
        writer.write("30:3\n");
        writer.write("31:4\n");
        writer.write("32:5\n");
        writer.write("33:6\n");
        writer.write("34:7\n");
        writer.write("35:8\n");
        writer.write("36:9\n");
        writer.close();
        FileReader reader = new FileReader("alphabet.txt");
        Scanner s = new Scanner(reader);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        reader.close();
    }
}

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       /* test Hello World
       System.out.println("Java Collections!");

       MyArray<String> ma = new MyArray<>();
       Lista<String> l = new Lista<>();
       ListaOrdinata<String> lo = new ListaOrdinata<>();

       File file = new File("data/province.txt");
       try (Scanner scan = new Scanner(file)) {
              while (scan.hasNextLine()) {
                  String line = scan.nextLine();
                  ma.add(line);
                  l.add(line);
                  lo.add(line);
              }
       }
       System.out.println();
       System.out.println(ma);
       System.out.println();
       System.out.println(l);
       System.out.println();
       System.out.println(lo);

       System.out.println(l.getLength());
       l.removePosition(1);
       l.removePosition(l.getLength());
       System.out.println(l); */

        ListaB<Integer> l = new ListaB<>();

        l.addHead(8);
        l.addHead(2);
        l.addHead(5);
        l.addTail(7);
        l.addPosition(1, 3);
        l.addPosition(3, 13);
        System.out.println(l);
    }
}

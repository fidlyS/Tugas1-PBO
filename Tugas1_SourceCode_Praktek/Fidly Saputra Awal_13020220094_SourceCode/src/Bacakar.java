/*
Nim  : 13020220094
Nama : Fidly Saputra Awal
--Sabtu, 25/02/2024--
 */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bacakar {
    public static void main(String[] args) throws IOException{
        char cc; int bil;
        InputStreamReader isr = new
                InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);

        System.out.print("Hello\n");
        System.out.print("Baca 1 Karakter : ");

        cc = dataIn.readLine() .charAt(0);
        System.out.print("Baca 1 Bilangan : ");

        bil = Integer.parseInt(dataIn.readLine());

        String kar = JOptionPane.showInputDialog(null,"hello");
        System.out.println(kar);

        JOptionPane.showMessageDialog(null,"hello");

        System.out.print(cc +"\n" +bil+"\n");
        System.out.print("bye \n");


    }

}

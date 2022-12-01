import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card c = new Card();
        crearProductostocard(c);
        //Menú de las funcionalidades
        System.out.println("Menu:");
        System.out.println("0 Salir");
        System.out.println("1 Añadir nuevo producto");
        System.out.println("2 Eliminar un producto");
        System.out.println("3 Enseñar productos");
        System.out.println("4 Eliminar todos los productos");

        //Se crea la variable TTL , la cual cada 10 minutos se va eliminando
        Timer timer = new Timer(1000*60*10, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han pasado 10 minutos, se elimina la card");
                Card c = new Card();
                c.showCard();
            }
        });
        timer.start();
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();

        while (str != 0 ){// Lectura indefinida hasta que el usuario elija la opción 0
            if(str == 1 ){
                sc = new Scanner(System.in);
                System.out.println("Añade una descripcion del producto");
                String desc = sc.nextLine();
                sc = new Scanner(System.in);
                System.out.println("Añade un valor");
                String val = sc.nextLine();
                c.addCart(new Product(c.maxID(),desc,Integer.parseInt(val)));
            }
            if(str == 2 ){
                sc = new Scanner(System.in);
                sc = new Scanner(System.in);
                System.out.println("Añade el id que se quiere eliminar");
                int val = sc.nextInt();
                c.deleteElement(val);
            }
            if(str == 3 ){
                c.showCard();
            }
            if(str == 4 ){
                c.deleteAllElement();

            }
             sc = new Scanner(System.in);
             str = sc.nextInt();

        }
    }



    public static void crearProductostocard(Card c ){
        for(int i = 0 ; i< 3 ; i++){
            int id = i ;
            String description = "Product" + id;
            double amount = 10 * id;
            Product p = new Product(id,description,amount);
            c.addCart(p);
        }
    }

}
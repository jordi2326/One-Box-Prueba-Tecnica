import java.util.ArrayList;
import java.util.List;

public class Card {


     private List<Product> ProductList = new ArrayList<Product>();


    //Función para añadir un producto
    public void addCart (Product p ){

         try {
             ProductList.add(p);
             System.out.println("Producto añadido");
         } catch (Exception e) {
            System.out.println("No se añade ningun producto");
        }


    }

    //Función para eliminar un producto determinado según su id
    public void  deleteElement(int id ) {
        try {

            for (int i = 0  ; i < ProductList.size() ; i++){
                Product p = ProductList.get(i);
                int id1 = p.getId();
                if (id1 == id){
                    ProductList.remove(i);

                }
            }
            System.out.println("Producto eliminado");
        } catch (Exception e) {
            System.out.println("No existe la id");
        }
    }

    // Eliminar todos los elementos de la Card
    public void  deleteAllElement( ){
        ProductList = new ArrayList<Product>();
        System.out.println("Todos los elementos eliminados");
    }

    // Mostrar los productos que forman la Card
    public void showCard(){
        int size = ProductList.size();
        if(size == 0 ) System.out.println("Empty");

        for (int i = 0  ; i < size ; i++){
            Product p = ProductList.get(i);
            System.out.println("Id: " + p.getId() + " description:" + p.getDescription() + " amount: " +p.getAmount());
        }
        System.out.println("");
    }

    //Función para encontrar el size de la lista
    public int maxID(){
        int size = ProductList.size();
        return size;

    }

}

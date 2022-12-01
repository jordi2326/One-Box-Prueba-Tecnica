public class Product {

    private int id = 0;
    private  String description="";
    private double amount = 0;

    // Crear un producto (Constructor)
    public Product( int id,String descripcion ,double amount) {
        this.id = id;
        this.description=descripcion;
        this.amount = amount;
    }

    //Obtener el id del producto
    public int getId() {
        return id;
    }

    //Setter del id
    public void setId(int id) {
        this.id = id;
    }

    //Obtener la descripción
    public String getDescription() {
        return description;
    }

    //Settear la descripción

    public void setDescription(String description) {
        this.description = description;
    }

    //Obtener el amount
    public double getAmount() {
        return amount;
    }

    // Settear el amount
    public void setAmount(double amount) {
        this.amount = amount;
    }
}

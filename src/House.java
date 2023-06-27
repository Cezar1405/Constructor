public class House {
    //deiniendo variables
    String adress;
    int numberOfFloors;

    //Metodo Constuctor
    public House(String adress, int numberOfFloors) {
        this.adress = adress;
        this.numberOfFloors = numberOfFloors;
    }

    //Metodo para mostrar datos en pantalla
    public void mostrarDatos(){
        System.out.println("Direccion: "+adress);
        System.out.println("Pisos: "+numberOfFloors);
    }
}

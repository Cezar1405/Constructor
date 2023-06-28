public class Tester {
    public static void main(String[] args){
        /*
        Cree una clase llamada Casa que tenga 3 variables de instancia:
        una String address.
        un int numberOfFloors.
        Defina un método constructor para House que imprimirá en la consola un mensaje
        tan pronto como se cree un objeto House.
        Defina una clase de prueba
        (por ejemplo, Tester, Start u otro nombre razonable que prefiera) con un método principal donde:
        declarar dos variables House house1 y house2
        creas dos objetos House y los asignas a las variables house1 y house2
         */
        //Creando mi objeto y asignando datos.
        House house1, house2;

        house1 = new House("Giussepe Garibaldi, 4", 5);
        house2 = new House("Tibaldi, 15", 3);
    }
}

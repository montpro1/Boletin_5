
package boletin_5;

public class Boletin_5 {

   
    public static void main(String[] args) {
       Conta novacont=new Conta("Pepe","12ab",1230);
       novacont.Amosar();
       novacont.ingreso(1234);
        System.out.println(novacont.getSaldo());
        novacont.reintegro(300);
                System.out.println(novacont.getSaldo());
              Conta novacont2=new Conta("Pepito","13cd",3291);
        System.out.println("Saldo da novacont " + novacont2.getSaldo() + "\n saldo da novacont2 " + novacont2.getSaldo());
       novacont.transferencia(novacont2, 200);
        System.out.println("Actualizacion da novacont " + novacont.getSaldo()
                + "\nActualizacion da novacont2  " + novacont2.getSaldo());

    }

}
    
    


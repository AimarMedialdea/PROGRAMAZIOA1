public class PrintDayInWord {
    
    public static void main(String[] args) {
        int number = 2;  // Set the value of "number" here!

        // Using switch-case-default
        switch(number) {
           case 1: 
              System.out.println( "Lunes" ); break;  // Don't forget the "break" after each case!
           case 2: 
              System.out.println( "Martes" ); break;
           case 3: 
              System.out.println( "Miercoles" ); break;
           case 4: 
              System.out.println( "Jueves" ); break;
           case 5: 
              System.out.println( "Viernes" ); break;
           case 6: 
              System.out.println( "Sabado" ); break;
           case 7: 
              System.out.println( "Domigo" ); break;
           default: System.out.println( "No ha introducido un numero de dia valido" ); 
        }
     }
  }

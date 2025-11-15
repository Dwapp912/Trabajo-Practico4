package trabajo.practicon4;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Creando empleados ---");
        
        Empleado e1 = new Empleado(101, "Ana Gomez", "Desarrolladora", 90000.0);
        
        Empleado e2 = new Empleado("Carlos Ruiz", "Becario");
        
        Empleado e3 = new Empleado(102, "Maria Diaz", "Analista", 85000.0);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\n--- Actualizando salarios ---");
        

        e1.actualizarSalario(10); 
        
    
        e2.actualizarSalario();

        System.out.println("Salario actualizado de Ana: " + e1.getSalario());
        System.out.println("Salario actualizado de Carlos: " + e2.getSalario());

        System.out.println("\n-----------------------------");
        
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}

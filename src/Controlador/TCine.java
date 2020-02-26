package Controlador;

import Entidades.Ecine;
import Entidades.Ecliente;
import Entidades.ESalas;
import Entidades.Easientos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class TCine {

    public static List<Ecliente> Tcliente = new ArrayList<Ecliente>();

    public static List<Ecine> TCinex = new ArrayList<Ecine>();

    public static List<Easientos> Tasientos = new ArrayList<>();

    public static List<ESalas> Tsalas = new ArrayList<>();

    public static void Ingresar1(Ecliente oe ) {
        Tcliente.add(oe);

    }

    public static void Ingresar2(Ecine ox) {
        TCinex.add(ox);
    }

    public static void Ingresar3(Easientos oy) {
        Tasientos.add(oy);
    }

    public static void Ingresar4(ESalas oz) {
        Tsalas.add(oz);
    }

    public static int BuscarCliente(String Cedula) {
        int pos = -1;
        for (int i = 0; i < Tcliente.size(); i++) {
            if (Tcliente.get(i).getCedula().equals(Cedula)) {
                pos = i;

            }
        }
        return pos;
    }

    public static Easientos BuscarAsientos(int asiento) {
        for (int i = 0; i < Tasientos.size(); i++) {
            if (Tasientos.get(i).getAsiento() == asiento) {
                return Tasientos.get(i);
            }
        }
        return null;
    }

    public static void modificar(int asiento) {
        for (int i = 0; i < Tasientos.size(); i++) {
            if (Tasientos.get(i).getAsiento() == asiento) {
                Tasientos.get(i).setOcupad(true);
            }
        }

    }

    public static DefaultTableModel MostrarDatosCliente() {
        String[] T = {"Cédula", "Nombre", "Apellidos", "Telefono", "Edad", "Sexo", "Cantidad Boletos"};
        String[] registro = new String[7];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, T);

        for (int i = 0; i < Tcliente.size(); i++) {
            registro[0] = Tcliente.get(i).getCedula();
            registro[1] = Tcliente.get(i).getNombre();
            registro[2] = Tcliente.get(i).getApellido();
            registro[3] = String.valueOf(Tcliente.get(i).getTelefono());
            registro[4] = String.valueOf(Tcliente.get(i).getEdad());
            registro[5] = String.valueOf(Tcliente.get(i).getSexo());
            registro[6] = String.valueOf(Tcliente.get(i).getCantidad());
            modelo.addRow(registro);

        }

        return modelo;
    }

    public static Ecliente getEcliente(int pos) {
        return Tcliente.get(pos);
    }

    public static DefaultTableModel MostrarCompraBoleto() {
        String[] T = {"ID", "Nombre", "Edad", "Tipo Pelicula", "Servicio", "Costo", "Nombre Pelicula", "Sala", "Día"};
        String[] registr = new String[9];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, T);
        for (int i = 0; i < TCinex.size(); i++) {

            registr[0] = String.valueOf(getEcine(i).getID());
            registr[1] = Tcliente.get(i).getNombre();
            registr[2] = String.valueOf(Tcliente.get(i).getEdad());
            registr[3] = getEcine(i).getTipo();
            registr[4] = getEcine(i).getLocalidad();
            registr[5] = String.valueOf(getEcine(i).getTotal());
            registr[6] = getEsalas(i).getNPeli();
            registr[7] = String.valueOf(getEsalas(i).getSala());
            registr[8] = getEsalas(i).getDia();

            modelo.addRow(registr);

        }
        return modelo;
    }

    public static Ecine getEcine(int pos) {
        return TCinex.get(pos);
    }

    public static ESalas getEsalas(int pos) {
        return Tsalas.get(pos);
    }

    public static Easientos getEasientos(int pos) {
        return Tasientos.get(pos);
    }

    public static DefaultTableModel Facturacion() {
        String[] T = {"ID", "Nombre", "Edad", "Tipo Pelicula", "Servicio", "Costo", "Nombre Pelicula", "Sala", "Asiento", "Día"};
        String[] registr = new String[10];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, T);
        for (int i = 0; i < TCinex.size(); i++) {

            registr[0] = String.valueOf(getEcine(i).getID());
            registr[1] = Tcliente.get(i).getNombre();
            registr[2] = String.valueOf(Tcliente.get(i).getEdad());
            registr[3] = getEcine(i).getTipo();
            registr[4] = getEcine(i).getLocalidad();
            registr[5] = String.valueOf(getEcine(i).getTotal());
            registr[6] = getEsalas(i).getNPeli();
            registr[7] = String.valueOf(getEsalas(i).getSala());
            registr[8] = String.valueOf(Tasientos.get(i).getAsiento());
            registr[9] = getEsalas(i).getDia();

            modelo.addRow(registr);

        }
        return modelo;
    }

    public static void GuardarLista() {
        FileWriter flwriter = null;
        try {
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter("C:/Users/Usuario/Documents/Vasquez/fichero.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bf = new BufferedWriter(flwriter);
            for (int i = 0; i < TCinex.size(); i++) {
                //escribe los datos en el archivo
                bf.write(getEcine(i).getID() + "," + getEcliente(i).getNombre() + "," + getEcliente(i).getEdad() + "," + getEcine(i).getTipo() + "," + getEcine(i).getLocalidad() + "," + getEcine(i).getTotal() + "," + getEsalas(i).getNPeli() + "," + getEsalas(i).getSala() + "," + getEasientos(i).getAsiento() + "," + getEsalas(i).getDia() + "\r\n");
            }
            //cierra el buffer intermedio
            bf.close();
            System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void LeerLista() throws IOException {
        // crea el flujo para leer desde el archivo
        File file = new File("C:/Users/Usuario/Documents/Vasquez/fichero.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            System.out.println("Archivo existente");
        }
        Scanner sc;
        try {
            //se pasa el flujo al objeto scanner
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = sc.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");

                String Cedula = delimitar.next();
                String Nombre = delimitar.next();
                String Apellido = delimitar.next();
                int Telefono = delimitar.nextInt();
                int Edad = delimitar.nextInt();
                char Sexo = delimitar.next().charAt(0);
                int Cantidad = delimitar.nextInt();
                int ID = delimitar.nextInt();
                String Tipo = delimitar.next();
                String Localidad = delimitar.next();
                double Total = delimitar.nextDouble();
                String NPeli = delimitar.next();
                int Sala = delimitar.nextInt();
                String Dia = delimitar.next();
                int Asiento = delimitar.nextInt();
       
                Ecliente oe = new Ecliente(Cedula, Nombre, Apellido, Telefono, Edad, Sexo, Cantidad);
                Ecine ox = new Ecine(ID, Tipo, Localidad, Total);
                ESalas oz = new ESalas(NPeli, Sala, Dia);
                Easientos oy = new Easientos(Asiento, true);
                Ingresar1(oe);
                Ingresar2(ox);
                Ingresar3(oy);
                Ingresar4(oz);
                

            }
            //se cierra el ojeto scanner
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

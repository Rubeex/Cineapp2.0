package Controlador;

import Entidades.Ecine;
import Entidades.Ecliente;
import Entidades.ESalas;
import Entidades.Easientos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TCine {

    public static List<Ecliente> Tcliente = new ArrayList<Ecliente>();

    public static List<Ecine> TCinex = new ArrayList<Ecine>();

    public static List<Easientos> Tasientos = new ArrayList<>();

    public static List<ESalas> Tsalas = new ArrayList<>();

    public static void Ingresar1(Ecliente oe) {
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
}

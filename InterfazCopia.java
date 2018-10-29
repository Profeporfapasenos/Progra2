
package progra2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class InterfazCopia extends javax.swing.JFrame {
    Cola colaVerdes = new Cola();
    Cola colaAmarillos = new Cola();
    Cola colaRojos = new Cola();
    Cola salida = new Cola();
    Cola salidaEmergencia = new Cola();
    Pacientes pacientes;
    Pacientes atiende;
    int contadorVerde = 0;
    int contadorAmarillo = 0;
    int contadorRojo = 0;
    int maximoVerde;
    int maximoAmarillo;
    int maximoRojo;  
    String numFicha;
    int consulV = 1;
    int consulA = 1;
    int consulR = 1;
    
    int contadorFichaPacienteVerde = 0;
    int contadorFichaPacienteAmarillo = 0;
    int contadorFichaPacienteRojo = 0;
    static int contadorPacienteVerde = 0;
    static int contadorPacienteAmarillo = 0;
    static int contadorPacienteRojo = 0;
    static int contadorInfarto =0;
    static int contadorHerida =0;
    static int contadorParto =0;
    static int contadorDolor = 0;
    static int contadorQuebradura = 0;
    static int contadorOtros=0;
    
    int maximo;
    int minimo;
           

    /**
     * Creates new form Interfaz
     */
    public InterfazCopia() {
        initComponents();
        CbDia.removeAllItems();
        CbDia.addItem("1");
        CbDia.addItem("2");
        CbDia.addItem("3");
        CbDia.addItem("4");
        CbDia.addItem("5");
        CbDia.addItem("6");
        CbDia.addItem("7");
        CbDia.addItem("8");
        CbDia.addItem("9");
        CbDia.addItem("10");
        CbDia.addItem("11");
        CbDia.addItem("12");
        CbDia.addItem("13");
        CbDia.addItem("14");
        CbDia.addItem("15");
        CbDia.addItem("16");
        CbDia.addItem("17");
        CbDia.addItem("18");
        CbDia.addItem("19");
        CbDia.addItem("20");
        CbDia.addItem("21");
        CbDia.addItem("22");
        CbDia.addItem("23");
        CbDia.addItem("24");
        CbDia.addItem("25");
        CbDia.addItem("26");
        CbDia.addItem("27");
        CbDia.addItem("28");
        CbDia.addItem("29");
        CbDia.addItem("30");
        CbDia.addItem("31");
        
        CbMes.removeAllItems();
        CbMes.addItem("Enero");
        CbMes.addItem("Febrero");
        CbMes.addItem("Marzo");
        CbMes.addItem("Abril");
        CbMes.addItem("Mayo");
        CbMes.addItem("Junio");
        CbMes.addItem("Julio");
        CbMes.addItem("Agosto");
        CbMes.addItem("Septiembre");
        CbMes.addItem("Octubre");
        CbMes.addItem("Noviembre");
        CbMes.addItem("Diciembre");
        
        CbAño.removeAllItems();
        CbAño.addItem("2009");
        CbAño.addItem("2008");
        CbAño.addItem("2007");
        CbAño.addItem("2006");
        CbAño.addItem("2005");
        CbAño.addItem("2004");
        CbAño.addItem("2003");
        CbAño.addItem("2002");
        CbAño.addItem("2001");
        CbAño.addItem("2000");
        CbAño.addItem("1999");
        CbAño.addItem("1998");
        CbAño.addItem("1997");
        CbAño.addItem("1996");
        CbAño.addItem("1995");
        CbAño.addItem("1994");
        CbAño.addItem("1993");
        CbAño.addItem("1992");
        CbAño.addItem("1991");
        
        CbPadecimiento.removeAllItems();
        CbPadecimiento.addItem("Infarto");
        CbPadecimiento.addItem("Perdida de sangre por herida");
        CbPadecimiento.addItem("Parto");
        CbPadecimiento.addItem("Dolor estomacal");
        CbPadecimiento.addItem("Quebradura");
        CbPadecimiento.addItem("Otro");
        
        CbCondicion.removeAllItems();
        CbCondicion.addItem("Verde");
        CbCondicion.addItem("Amarillo");
        CbCondicion.addItem("Rojo");
    }

    public void setMaximoVerde(int maximoVerde) {
        this.maximoVerde = maximoVerde;
    }

    public void setMaximoAmarillo(int maximoAmarillo) {
        this.maximoAmarillo = maximoAmarillo;
    }

    public void setMaximoRojo(int maximoRojo) {
        this.maximoRojo = maximoRojo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    
    public String generadorFicha (String condicion,String padecimiento){
            switch (condicion) {
                case "Verde":
                    switch (padecimiento){
                        case "Infarto":
                            numFicha=("V-I-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorInfarto++;
                            break;
                        case "Perdida de sangre por herida":
                            numFicha=("V-H-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorHerida++;
                            break;
                        case "Parto":
                            numFicha=("V-P-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorParto++;
                            break;
                        case "Dolor estomacal":
                            numFicha=("V-D-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorDolor++;
                            break;
                        case "Quebradura":
                            numFicha=("V-Q-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorQuebradura++;
                            break;
                        case "Otro":
                            numFicha=("V-O-"+contadorFichaPacienteVerde);
                            contadorFichaPacienteVerde++;
                            contadorPacienteVerde++;
                            contadorOtros++;
                            break;
                    }
                    break;
                case "Amarillo":
                    switch (padecimiento){
                        case "Infarto":
                            numFicha=("A-I-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorInfarto++;
                            break;
                        case "Perdida de sangre por herida":
                            numFicha=("A-H-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorDolor++;
                            break;
                        case "Parto":
                            numFicha=("A-P-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorParto++;
                            break;
                        case "Dolor estomacal":
                            numFicha=("A-D-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorDolor++;
                            break;
                        case "Quebradura":
                            numFicha=("A-Q-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorQuebradura++;
                            break;
                        case "Otro":
                            numFicha=("A-O-"+contadorFichaPacienteAmarillo);
                            contadorFichaPacienteAmarillo++;
                            contadorPacienteAmarillo++;
                            contadorOtros++;
                            break;
                    }
                    break;
                case "Rojo":
                    switch (padecimiento){
                        case "Infarto":
                            numFicha=("R-I-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorInfarto++;
                            break;
                        case "Perdida de sangre por herida":
                            numFicha=("R-H-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorDolor++;
                            break;
                        case "Parto":
                            numFicha=("R-P-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorParto++;
                            break;
                        case "Dolor estomacal":
                            numFicha=("R-D-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorDolor++;
                            break;
                        case "Quebradura":
                            numFicha=("R-Q-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorQuebradura++;
                            break;
                        case "Otro":
                            numFicha=("R-O-"+contadorFichaPacienteRojo);
                            contadorFichaPacienteRojo++;
                            contadorPacienteRojo++;
                            contadorOtros++;
                            break;
                    }
                    break;
                default:
                    break;
            }
                    return numFicha;
        }
//    public int generadorPrioridad(String padecimiento){
//        switch (padecimiento){
//            case "Infarto":
//                numP=(6);
//                break;
//            case "Perdida de sangre por herida":
//                numP=(5);
//                break;
//            case "Parto":
//                numP=(4);
//                break;
//            case "Dolor estomacal":
//                numP=(3);
//                break;
//            case "Quebradura":
//                numP=(2);
//                break;
//            case "Otro":
//                numP=(1);
//                break;
//        }
//        return numP;
//    }
    

    public void salir(){
        while(!salida.isEmpty()){   
            if(salidaEmergencia.isEmpty()){
                Pacientes egresado = (Pacientes) salida.frente();
                String nombre = egresado.getNombre();
                String condicion = egresado.getCondicion();
                
                DefaultTableModel model = (DefaultTableModel)TbEgresos.getModel();
                model.addRow(new Object[]{nombre,condicion});
                
                int valor = (int)(Math.random()*(maximo-minimo+1)+minimo);
                int valorDado = valor*1000;
                System.out.println(valorDado);
                System.out.println(egresado.toString());
                    
                try {
                    //Thread.sleep (valorDado*1000);
                    Thread.sleep (valorDado);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InterfazCopia.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                salida.desencolar();
                
                

            }
            else{
                Pacientes egresado = (Pacientes) salidaEmergencia.frente();
                String nombre = egresado.getNombre();
                String condicion = egresado.getCondicion();
                
                DefaultTableModel model = (DefaultTableModel)TbEgresos.getModel();
                model.addRow(new Object[]{nombre,condicion});
                
                //int valorDado = (int) Math.floor(Math.random()*9);
                int valor = (int)(Math.random()*(maximo-minimo+1)+minimo);
                int valorDado = valor*1000;
                System.out.println(valorDado);
                System.out.println(egresado.toString());
                    
                try {
                    //Thread.sleep (valorDado*1000);
                    Thread.sleep (valorDado);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InterfazCopia.class.getName()).log(Level.SEVERE, null, ex);
                }
              
                salidaEmergencia.desencolar();
            }
            
        }
    }
    
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) TbEgresos.getModel();
        int a = TbEgresos.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        }         
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRojos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaVerdes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAmarillos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BttIngreso = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtDetalle = new javax.swing.JTextArea();
        CbDia = new javax.swing.JComboBox<>();
        CbMes = new javax.swing.JComboBox<>();
        CbAño = new javax.swing.JComboBox<>();
        CbPadecimiento = new javax.swing.JComboBox<>();
        CbCondicion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BttLiberarA = new javax.swing.JButton();
        BttAtenderA = new javax.swing.JButton();
        BttLiberaryAtenderA = new javax.swing.JButton();
        BttLiberarV = new javax.swing.JButton();
        BttAtenderV = new javax.swing.JButton();
        BttLiberaryAtenderV = new javax.swing.JButton();
        BttLiberarR = new javax.swing.JButton();
        BttAtenderR = new javax.swing.JButton();
        BttLiberaryAtenderR = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TbEgresos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaRojos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane1.setViewportView(TablaRojos);

        TablaVerdes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane2.setViewportView(TablaVerdes);

        TablaAmarillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane3.setViewportView(TablaAmarillos);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de pacientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Padecimiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Detalle del paciente");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Condicion");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        BttIngreso.setText("Ingresar");
        BttIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttIngresoActionPerformed(evt);
            }
        });

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        TxtDetalle.setColumns(20);
        TxtDetalle.setRows(5);
        jScrollPane4.setViewportView(TxtDetalle);

        CbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbPadecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbPadecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbPadecimientoActionPerformed(evt);
            }
        });

        CbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel8.setText("Gestion de consultorios");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setText("Consultorios Verdes");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel10.setText("Consultorios Amarillos");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel11.setText("Consultorios Rojos");

        BttLiberarA.setText("Liberar");
        BttLiberarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberarAActionPerformed(evt);
            }
        });

        BttAtenderA.setText("Atender");
        BttAtenderA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttAtenderAActionPerformed(evt);
            }
        });

        BttLiberaryAtenderA.setText("Liberar y atender");
        BttLiberaryAtenderA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberaryAtenderAActionPerformed(evt);
            }
        });

        BttLiberarV.setText("Liberar");
        BttLiberarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberarVActionPerformed(evt);
            }
        });

        BttAtenderV.setText("Atender");
        BttAtenderV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttAtenderVActionPerformed(evt);
            }
        });

        BttLiberaryAtenderV.setText("Liberar y atender");
        BttLiberaryAtenderV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberaryAtenderVActionPerformed(evt);
            }
        });

        BttLiberarR.setText("Liberar");
        BttLiberarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberarRActionPerformed(evt);
            }
        });

        BttAtenderR.setText("Atender");
        BttAtenderR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttAtenderRActionPerformed(evt);
            }
        });

        BttLiberaryAtenderR.setText("Liberar y atender");
        BttLiberaryAtenderR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttLiberaryAtenderRActionPerformed(evt);
            }
        });

        TbEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pacientes", "Categoria"
            }
        ));
        jScrollPane5.setViewportView(TbEgresos);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel12.setText("Egresos");

        jButton1.setText("Realizar egreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbPadecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(BttIngreso))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(39, 39, 39)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel12)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(178, 178, 178)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BttLiberaryAtenderA)
                                        .addComponent(BttLiberarA, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BttAtenderA, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BttLiberaryAtenderV)
                                        .addComponent(BttAtenderV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BttLiberarV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BttLiberaryAtenderR)
                                        .addComponent(BttAtenderR, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BttLiberarR, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CbPadecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(BttIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttLiberarV)
                                .addGap(16, 16, 16)
                                .addComponent(BttAtenderV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BttLiberaryAtenderV))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttLiberarA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BttAtenderA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BttLiberaryAtenderA)))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttLiberarR)
                                .addGap(18, 18, 18)
                                .addComponent(BttAtenderR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BttLiberaryAtenderR)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void BttIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttIngresoActionPerformed
        // TODO add your handling code here:
        //Ingreso del paciente a la cola
        String nombre = TxtNombre.getText();
        //Fecha de nacimiento
        String padecimiento = CbPadecimiento.getSelectedItem().toString();
        String detalle = TxtDetalle.getText();
        String condicion = CbCondicion.getSelectedItem().toString();
        String numero = TxtTelefono.getText();
        //AQUI VA EL GENERADOR DE FICHAS
        String ficha = generadorFicha(condicion, padecimiento);
        Pacientes paciente = new Pacientes(nombre, condicion, numero, padecimiento, detalle, ficha);
        
        if(condicion.equals("Verde")){
            colaVerdes.encolar(paciente);
            System.out.println(colaVerdes.toString());
            JOptionPane.showMessageDialog(this, "El paciente ha sido registrado exitosamente");
        }
        else if(condicion.equals("Amarillo")){
            colaAmarillos.encolar(paciente);
            System.out.println(colaAmarillos.toString());
            JOptionPane.showMessageDialog(this, "El paciente ha sido registrado exitosamente");
        }
        else if(condicion.equals("Rojo")){
            colaRojos.encolar(paciente);
            System.out.println(colaRojos.toString());
            JOptionPane.showMessageDialog(this, "El paciente ha sido registrado exitosamente");            
        }

    }//GEN-LAST:event_BttIngresoActionPerformed

    private void BttLiberarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberarVActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaVerdes.getModel();
        
        int count= TablaVerdes.getModel().getRowCount(); 
        if(count > 0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salida.encolar(egresado);
            contadorVerde--;

            ((DefaultTableModel)TablaVerdes.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
    }//GEN-LAST:event_BttLiberarVActionPerformed

    private void BttAtenderVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttAtenderVActionPerformed
        // TODO add your handling code here:
        if (!colaVerdes.isEmpty() && contadorVerde < maximoVerde){
            atiende = (Pacientes) colaVerdes.frente();
            colaVerdes.desencolar();
            String consultorio = Integer.toString(consulV);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulV == maximoVerde){
                consulV = 1;
            }else{
                consulV++;
            }
            contadorVerde++;
            System.out.println(contadorVerde);
            System.out.println(maximoVerde);

            DefaultTableModel model = (DefaultTableModel)TablaVerdes.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }
        else if(colaVerdes.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
        else{
            JOptionPane.showMessageDialog(this,"No hay más consultorios disponibles");
        }
    }//GEN-LAST:event_BttAtenderVActionPerformed

    private void BttLiberaryAtenderVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberaryAtenderVActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaVerdes.getModel();
        
        int count= TablaVerdes.getModel().getRowCount(); 
        if(count !=0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salida.encolar(egresado);

            ((DefaultTableModel)TablaVerdes.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
        
        if (!colaVerdes.isEmpty()){
            atiende = (Pacientes) colaVerdes.frente();
            colaVerdes.desencolar();
            String consultorio = Integer.toString(consulV);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulV == maximoVerde){
                consulV = 1;
            }else{
                consulV++;
            }

            DefaultTableModel model = (DefaultTableModel)TablaVerdes.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }else{
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
    }//GEN-LAST:event_BttLiberaryAtenderVActionPerformed

    private void BttLiberarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberarAActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaAmarillos.getModel();
        
        int count= TablaAmarillos.getModel().getRowCount(); 
        if(count !=0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salida.encolar(egresado);
            contadorAmarillo--;

            ((DefaultTableModel)TablaAmarillos.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
    }//GEN-LAST:event_BttLiberarAActionPerformed

    private void BttAtenderAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttAtenderAActionPerformed
        
        if (!colaAmarillos.isEmpty() && contadorAmarillo < maximoAmarillo){
            atiende = (Pacientes) colaAmarillos.frente();
            colaAmarillos.desencolar();
            String consultorio = Integer.toString(consulA);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulA == maximoAmarillo){
                consulA = 1;
            }else{
                consulA++;
            }
            contadorAmarillo++;
            System.out.println(contadorAmarillo);
            System.out.println(maximoAmarillo);

            DefaultTableModel model = (DefaultTableModel)TablaAmarillos.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }else if(colaAmarillos.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay más consultorios disponibles");
        }
    }//GEN-LAST:event_BttAtenderAActionPerformed

    private void BttLiberaryAtenderAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberaryAtenderAActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaAmarillos.getModel();
        
        int count= TablaAmarillos.getModel().getRowCount(); 
        if(count !=0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salida.encolar(egresado);

            ((DefaultTableModel)TablaAmarillos.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
        
        if (!colaAmarillos.isEmpty()){
            atiende = (Pacientes) colaAmarillos.frente();
            colaAmarillos.desencolar();
            String consultorio = Integer.toString(consulA);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulA == maximoAmarillo){
                consulA = 1;
            }else{
                consulA++;
            }            

            DefaultTableModel model = (DefaultTableModel)TablaAmarillos.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }else{
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
    }//GEN-LAST:event_BttLiberaryAtenderAActionPerformed

    private void BttLiberarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberarRActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaRojos.getModel();
        
        int count= TablaRojos.getModel().getRowCount(); 
        if(count !=0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salidaEmergencia.encolar(egresado);
            contadorRojo--;

            ((DefaultTableModel)TablaRojos.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
    }//GEN-LAST:event_BttLiberarRActionPerformed

    private void BttAtenderRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttAtenderRActionPerformed
        // TODO add your handling code here:
        if (!colaRojos.isEmpty() && contadorRojo < maximoRojo){
            atiende = (Pacientes) colaRojos.frente();
            colaRojos.desencolar();
            String consultorio = Integer.toString(consulR);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulR == maximoRojo){
                consulR = 1;
            }else{
                consulR++;
            }             
            contadorRojo++;
            System.out.println(contadorRojo);
            System.out.println(maximoRojo);

            DefaultTableModel model = (DefaultTableModel)TablaRojos.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }
        else if(colaRojos.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay más consultorios disponibles");
        }
    }//GEN-LAST:event_BttAtenderRActionPerformed

    private void BttLiberaryAtenderRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttLiberaryAtenderRActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TablaAmarillos.getModel();
        
        int count= TablaRojos.getModel().getRowCount(); 
        if(count !=0){
            String ficha = (String) modelo.getValueAt(0, 1);
            String nombre = (String) modelo.getValueAt(0, 2);
            String condicion = (String) modelo.getValueAt(0, 3);
            String telefono = (String) modelo.getValueAt(0, 4);
            String padecimiento = (String) modelo.getValueAt(0, 5);
            String detalle = (String) modelo.getValueAt(0, 6);

            Pacientes egresado = new Pacientes(nombre, condicion, telefono, padecimiento, detalle, ficha);
            System.out.println(egresado.toString());
            salidaEmergencia.encolar(egresado);

            ((DefaultTableModel)TablaRojos.getModel()).removeRow(0);
        }else{
           JOptionPane.showMessageDialog(this, "No hay más pacientes siendo atendidos");
        }
        
        if (!colaRojos.isEmpty()){
            atiende = (Pacientes) colaRojos.frente();
            colaRojos.desencolar();
            String consultorio = Integer.toString(consulR);
            String ficha = atiende.getFicha();
            String nombre = atiende.getNombre();
            String condicion = atiende.getCondicion();
            String telefono = atiende.getTelefono();
            String padecimiento = atiende.getPadecimiento();
            String detalle = atiende.getDetallesdepadecimiento();
            
            if(consulR == maximoRojo){
                consulR = 1;
            }else{
                consulR++;
            }               

            DefaultTableModel model = (DefaultTableModel)TablaRojos.getModel();
            model.addRow(new Object[]{consultorio, ficha, nombre, condicion, telefono, padecimiento, detalle});
        }else{
            JOptionPane.showMessageDialog(this, "No hay más pacientes que atender");
        }
    }//GEN-LAST:event_BttLiberaryAtenderRActionPerformed

    private void CbPadecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbPadecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbPadecimientoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        eliminar();
        salir();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazCopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCopia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttAtenderA;
    private javax.swing.JButton BttAtenderR;
    private javax.swing.JButton BttAtenderV;
    private javax.swing.JButton BttIngreso;
    private javax.swing.JButton BttLiberarA;
    private javax.swing.JButton BttLiberarR;
    private javax.swing.JButton BttLiberarV;
    private javax.swing.JButton BttLiberaryAtenderA;
    private javax.swing.JButton BttLiberaryAtenderR;
    private javax.swing.JButton BttLiberaryAtenderV;
    private javax.swing.JComboBox<String> CbAño;
    private javax.swing.JComboBox<String> CbCondicion;
    private javax.swing.JComboBox<String> CbDia;
    private javax.swing.JComboBox<String> CbMes;
    private javax.swing.JComboBox<String> CbPadecimiento;
    private javax.swing.JTable TablaAmarillos;
    private javax.swing.JTable TablaRojos;
    private javax.swing.JTable TablaVerdes;
    private javax.swing.JTable TbEgresos;
    private javax.swing.JTextArea TxtDetalle;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}

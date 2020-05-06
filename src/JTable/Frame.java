package JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Frame extends JFrame {
    private JPanel panel = new JPanel();
    public Frame(){
        super("Formulario empleados");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponentes();
        //JPanel2();
    }
    private void initComponentes(){
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.add(panel);
        //------------------------------------------------
        //Tabla creacion
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        modelo.addColumn("Pitp");
        modelo.addColumn("brian");
        String[] p1={"","",""};
        String[] p2={"daniel","cabrera","19"};
        String[] p3={"daniel","cabrera","19"};
        String[] p4={"daniel","cabrera","19"};
        String[] p5={"daniel","cabrera","19"};
        String[] p6={"daniel","cabrera","19"};
        String[] p7={"daniel","cabrera","19"};
        String[] p8={"daniel","cabrera","19"};
        String[] p9={"daniel","cabrera","19"};
        String[] p10={"daniel","cabrera","19"};
        String[] p11={"daniel","cabrera","19"};
        String[] p12={"daniel","cabrera","19"};
        String[] p13={"daniel","cabrera","19"};
        String[] p14={"daniel","cabrera","19"};
        String[] p15={"daniel","cabrera","19"};
        String[] p16={"daniel","cabrera","19"};
        String[] p17={"daniel","cabrera","19"};
        String[] p18={"daniel","cabrera","19"};
        String[] p19={"daniel","cabrera","19"};
        String[] p20={"daniel","cabrera","19"};
        String[] p21={"daniel","cabrera","19"};
        String[] p22={"daniel","cabrera","19"};
        String[] p23={"daniel","cabrera","19"};

        modelo.addRow(p1);
        modelo.addRow(p2);
        modelo.addRow(p3);
        modelo.addRow(p4);
        modelo.addRow(p5);
        modelo.addRow(p6);
        modelo.addRow(p7);
        modelo.addRow(p8);
        modelo.addRow(p9);
        modelo.addRow(p10);
        modelo.addRow(p11);
        modelo.addRow(p12);
        modelo.addRow(p13);
        modelo.addRow(p14);
        modelo.addRow(p15);
        modelo.addRow(p16);
        modelo.addRow(p17);
        modelo.addRow(p18);
        modelo.addRow(p19);
        modelo.addRow(p20);
        modelo.addRow(p21);
        modelo.addRow(p22);
        modelo.addRow(p23);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane.add(tabla);
        scrollPane.setViewportView(tabla);
        scrollPane.setBackground(Color.ORANGE);
        scrollPane.setBounds(0, 0, 200, 200);
        panel.add(scrollPane);
        //------------------------------------------------
    }
    private void JPanel2(){
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.add(panel);
        //------------------------------------------------
        //Tabla creacion
        String[] encabezados = {"titulo1", "titulo 2", "titulo 3","titulo 4"};
        DefaultTableModel modelo = new DefaultTableModel(null,encabezados);
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(tabla);
        scrollPane.setViewportView(tabla);
        scrollPane.setBounds(0, 0, 200, 200);
        panel.add(scrollPane);

    }
}

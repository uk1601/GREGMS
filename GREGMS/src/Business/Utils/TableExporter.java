/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Mukul
 */
public class TableExporter {
    
    public static void exportToCSV(JTable table, Component parentComponent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        
        int userSelection = fileChooser.showSaveDialog(parentComponent);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.toString().endsWith(".csv")) {
                fileToSave = new File(fileToSave.toString() + ".csv"); // Append .csv if not present
            }
            
            try (PrintWriter pw = new PrintWriter(new FileWriter(fileToSave))) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int colCount = model.getColumnCount();
                
                // Writing header
                for (int i = 0; i < colCount; i++) {
                    pw.print(model.getColumnName(i));
                    if (i < colCount - 1) {
                        pw.print(",");
                    }
                }
                pw.println();
                
                // Writing data
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < colCount; j++) {
                        pw.print(model.getValueAt(i, j).toString());
                        if (j < colCount - 1) {
                            pw.print(",");
                        }
                    }
                    pw.println();
                }
                
                JOptionPane.showMessageDialog(parentComponent, "Data exported successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentComponent, "Error occurred while exporting data.");
                ex.printStackTrace();
            }
        }
    }
}

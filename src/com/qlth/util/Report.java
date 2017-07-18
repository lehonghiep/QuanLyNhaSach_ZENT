/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.util;

import com.qlth.frm.FrmSach;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hong Hiep
 */
public class Report {

    public void xuatExcel(DefaultTableModel tableModel, Object obj) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog((Component) obj);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
//                FileWriter out=new FileWriter(file+".xls");
                FileOutputStream fos = new FileOutputStream(file + ".xls");
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//                BufferedWriter bw = new BufferedWriter(out);
                BufferedWriter bwriter = new BufferedWriter(osw);
//                DefaultTableModel model=(DefaultTableModel)tblSach.getModel();

//                for (int j = 0; j < tableModel.getColumnCount(); j++) {
//                    bwriter.write(tableModel.getColumnName(j) + "\t");
//                }
                bwriter.write("\n");
                for (int j = 0; j < tableModel.getRowCount(); j++) {
                    for (int k = 0; k < tableModel.getColumnCount(); k++) {
                        bwriter.write(tableModel.getValueAt(j, k) + "\t");
                    }
                    bwriter.write("\n");
                }
                bwriter.close();
                JOptionPane.showMessageDialog((Component) obj, "xuất file thành công");
            } catch (Exception e) {
            }
        }
    }
}

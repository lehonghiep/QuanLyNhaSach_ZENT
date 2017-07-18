/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.util;

import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Hong Hiep
 */
public class PasswordCellRenderer extends JPasswordField implements TableCellRenderer{
    public PasswordCellRenderer() {
        super();
        // This displays astericks in fields since it is a password.
        // It does not affect the actual value of the cell.
        this.setText("filler123");
    }

    public Component getTableCellRendererComponent(
    JTable arg0,
    Object arg1,
    boolean arg2,
    boolean arg3,
    int arg4,
    int arg5) {
        return this;
    }
}

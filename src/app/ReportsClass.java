/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Dimension;
import java.io.InputStream;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author user
 */
public class ReportsClass {
     JasperReport report;
            Connection con;
         
public void repMethod(){
    try {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("./reports/List.jasper");
              JasperPrint print = JasperFillManager.fillReport(is, null, con);
              JRViewer viewer = new JRViewer(print);
              JFrame ReportFrame= new JFrame();
              ReportFrame.getContentPane().add(viewer);
              ReportFrame.validate();
              ReportFrame.setSize(new Dimension(800,600));
              ReportFrame.setLocation(300,100);
              ReportFrame.setVisible(true);
         } catch (JRException ex) {
             Logger.getLogger(ReportsClass.class.getName()).log(Level.SEVERE, null, ex);
            }

} 

    public ReportsClass()
            {
                 con = mysqlconnect.ConnectDb();
                         }
    
    public static void main(String s[])
    {
        ReportsClass a= new ReportsClass();
        a.repMethod();
    }
}

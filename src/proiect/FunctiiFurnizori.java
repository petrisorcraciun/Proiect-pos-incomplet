package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class FunctiiFurnizori {
    String databaseURL = "jdbc:ucanaccess://" + System.getProperty("user.dir") + "\\bd_practica1.accdb";
    String sql = "SELECT * FROM Furnizori";
    public DefaultTableModel tabel_date_furnizori() {
        DefaultTableModel tabel_completat=new DefaultTableModel();
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ResultSetMetaData rsmd=result.getMetaData();
            
            int coloane=rsmd.getColumnCount();
            String c[]=new String[coloane];
            for(int i=0;i<coloane;i++)
            {
            c[i]=rsmd.getColumnName(i+1);
            tabel_completat.addColumn(c[i]);
            }
            Object row[]=new Object[coloane];
            while(result.next()){
             for(int i=0;i<coloane;i++){
                    row[i]=result.getString(i+1);
                }
            tabel_completat.addRow(row);
            }
            
         return tabel_completat;
        }catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public void StergeFurnizor(int furnizor_id)
    {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String sterge_linia = "DELETE FROM Furnizori WHERE id_furnizor=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sterge_linia);
            Statement statement = connection.createStatement();
            preparedStatement.setInt(1,furnizor_id);
            preparedStatement.executeUpdate(); 
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

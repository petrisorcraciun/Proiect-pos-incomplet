package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FunctiiAngajati {
    public int nr_inregistrari;
    String databaseURL = "jdbc:ucanaccess://" + System.getProperty("user.dir") + "\\bd_practica1.accdb";
    String sql = "SELECT * FROM Angajati";
    int id_nou;

    public DefaultTableModel tabel_date_angajati() {
        DefaultTableModel tabel_completat=new DefaultTableModel();
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ResultSetMetaData rsmd=result.getMetaData();
            
            int coloane=rsmd.getColumnCount();
            Object col[] = { "ID", "Username", "Parola", "Nume", "Prenume", "Adresa", "Email", "Telefon", "Data angajare", "Salariu"};
            String c[]=new String[coloane];
            for(int i=0;i<col.length;i++)
            {
            tabel_completat.addColumn(col[i]);
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
    public int AdaugaCont(String[] date)
    {
        
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            String insert = "INSERT INTO Angajati VALUES " + "(" + id_utilizator_nou() +",'" + date[1] 
                +"','"+ date[2] +"','"+ date[3] +"','"+ date[4] +"','"+ date[5] +"','"+ date[6] +"','"+ date[7] +"'," + "DATE '"+ date[8]+"'," + date[9] +");";
            statement.executeUpdate(insert);
            return 1;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public int id_utilizator_nou()
    {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String nr_linii = "SELECT COUNT(username) as nr_angajati FROM Angajati";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(nr_linii);
            while(result.next()){
                id_nou=result.getInt("nr_angajati");
            }
            id_nou++;
            return id_nou;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public void StergeAngajat(int angajat_id)
    {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String sterge_linia = "DELETE FROM Angajati WHERE id_angajat=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sterge_linia);
            Statement statement = connection.createStatement();
            preparedStatement.setInt(1,angajat_id);
            preparedStatement.executeUpdate(); 
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public int VerificaLogin(String tnume,String tparola)
    {
        if (tnume != null && tparola!= null) 
        {
        String date_db = "SELECT username,parola FROM Angajati WHERE username='"+ tnume +"' and parola='"+tparola+"'";
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(date_db);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(date_db);
            if (result.next())
            {
                return 1;
            }
            else
            {
                return 0;
            }
                  
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
        else
        {
            return 0;
        }
        return 0;
    }
}

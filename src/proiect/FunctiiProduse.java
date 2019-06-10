package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FunctiiProduse {
    String databaseURL = "jdbc:ucanaccess://" + System.getProperty("user.dir") + "\\bd_practica1.accdb";
    String sql = "SELECT * FROM Produse";
    int id_nou;
    DefaultTableModel tabel_produse_angajati=new DefaultTableModel();
    public DefaultTableModel tabel_date_produse() {
        DefaultTableModel tabel_completat=new DefaultTableModel();
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ResultSetMetaData rsmd=result.getMetaData();

            Object col[] = { "ID", "Cod Produs", "Nume Produs", "Pret buc/kg", "Cod bare", "UM/BUC", "Categorie", "Data expirare", "Cantitate"};
            for(int i=0;i<col.length;i++)
            {
            tabel_completat.addColumn(col[i]);
            }
            Object row[]=new Object[col.length];
            while(result.next()){
             for(int i=0;i<col.length;i++){
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
    public void StergeProdus(int produs_id)
    {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String sterge_linia = "DELETE FROM Produse WHERE id_produs=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sterge_linia);
            Statement statement = connection.createStatement();
            preparedStatement.setInt(1,produs_id);
            preparedStatement.executeUpdate(); 
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public DefaultTableModel cauta_produse(String produs_cautat) {
        DefaultTableModel tabel_completat=new DefaultTableModel();
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String cauta_produs = "SELECT * FROM Produse WHERE nume_produs LIKE '%"+produs_cautat+"%'";
            PreparedStatement preparedStatement = connection.prepareStatement(cauta_produs);
            //preparedStatement.setString(1,"%"+produs_cautat+"%");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(cauta_produs);
            Object col[] = { "ID", "Cod Produs", "Nume Produs", "Pret buc/kg", "Cod bare", "UM/BUC", "Categorie", "Data expirare", "Cantitate"};
            for(int i=0;i<col.length;i++)
            {
            tabel_completat.addColumn(col[i]);
            }
            Object row[]=new Object[col.length];
            while(result.next()){
             for(int i=0;i<col.length;i++){
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
    public int AdaugaProdus(String[] date)
    {
        
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            String insert = "INSERT INTO Produse VALUES " + "(" + id_produs_nou() +",'" + date[1] 
                +"','"+ date[2] +"','"+ date[3] +"','"+ date[4] +"','"+ date[5] +"','"+ date[6] +"',DATE '"+ date[7] +"'," + "'"+ date[8]+"'," + date[9] +");";
            statement.executeUpdate(insert);
            return 1;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public int id_produs_nou()
    {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String nr_linii = "SELECT COUNT(id_produs) as nr_produse FROM Produse";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(nr_linii);
            while(result.next()){
                id_nou=result.getInt("nr_produse");
            }
            id_nou++;
            return id_nou;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public String[] categorii_produse()
    {
        String[] categorii = new String[20];
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String nr_linii = "SELECT nume_categorie FROM Categorii";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(nr_linii);
            int i=0;
            while(result.next())
            {
                categorii[i]=result.getString("nume_categorie");
                i++;
            }
            return categorii;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return categorii;
    }
    public String[] afisare_furnizori()
    {
        String[] categorii = new String[20];
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String nr_linii = "SELECT nume_furnizor FROM Furnizori";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(nr_linii);
            int i=0;
            while(result.next())
            {
                categorii[i]=result.getString("nume_furnizor");
                i++;
            }
            return categorii;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return categorii;
    }
    public String[] adaugare_produs_angajat(int cod_produs)
    {
        String[] detalii_produs_afisare = new String[10];
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String detalii_produs = "SELECT id_produs,nume_produs,pret_produs,um_kg FROM Produse WHERE cod_produs=" + cod_produs;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(detalii_produs);
            while(result.next())
            {
                detalii_produs_afisare[0]="1";
                detalii_produs_afisare[1]=result.getString("nume_produs");
                detalii_produs_afisare[2]=result.getString("um_kg");
                detalii_produs_afisare[3]=result.getString("pret_produs");
                detalii_produs_afisare[4]="1";
                detalii_produs_afisare[5]=result.getString("pret_produs");
                return detalii_produs_afisare;
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public DefaultTableModel tabel_produse(int cod_produs) {
       Object col[] = { "ID", "Nume produs", "UM/KG", "Pret buc/kg ", "Cantitate", "Pret total"};
       int nr_coloane = tabel_produse_angajati.getColumnCount();
       int index=0;
       if(nr_coloane==0)
       {
       for(int i=0;i<col.length;i++)
       {
           tabel_produse_angajati.addColumn(col[i]);
       }
       }
       if(cod_produs==0)
       {
           
       }
       else if(adaugare_produs_angajat(cod_produs)!=null)
       {
           tabel_produse_angajati.addRow(adaugare_produs_angajat(cod_produs));
       }
       else 
       {
           JOptionPane.showMessageDialog(null, "Acest produs nu exista.");
       }
       return tabel_produse_angajati;
    }

    
    

    
}

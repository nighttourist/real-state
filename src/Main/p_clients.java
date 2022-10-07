/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p_clients {
    private int id;
    private String firstname;
    private String Lastname;
    private String phone;
    private String email;
    private String address;
    
    public int getid(){
        return this.id;
    }
    public void setid(Integer Id){
        this.id=Id;
    }
    
    public String getfname(){
        return this.firstname;
    }
    public void setfname(String Fname){
        this.firstname=Fname;
    }
    
    public String getlname(){
        return this.Lastname;
    }
    public void setlname(String lname){
        this.Lastname=lname;
    }
    
    
    public String getphone(){
        return this.phone;
    }
    public void setphone(String Phone){
        this.phone=Phone;
    }
    
    public String getemail(){
        return this.email;
    }
    public void setemail(String Email){
        this.email=Email;
    }
    
    public String getaddress(){
        return this.address;
    }
    public void setaddress(String Address){
        this.address=Address;
    }
    public p_clients()
    {
        
    }
    public p_clients(int Id,String fname,String lname,String Phone,String Email,String Address){
        this.id=Id;
        this.firstname=fname;
        this.Lastname=lname;
        this.phone=Phone;
        this.email=Email;
        this.address=Address;
    }
    public boolean AddNewclient(p_clients clients){
        PreparedStatement ps;
        String NewQuery="INSERT INTO `clients`( `fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        try {
            ps=connectdb.getTheConnection().prepareStatement(NewQuery);
            ps.setString(1,clients.getfname());
            ps.setString(2, clients.getlname());
            ps.setString(3, clients.getphone());
            ps.setString(4, clients.getemail());
            ps.setString(5, clients.getaddress());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_clients.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
     public boolean editNewclients(p_clients clients){
        PreparedStatement ps;
        String editQuery="UPDATE `clients` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(editQuery);
            ps.setString(1,clients.getfname());
            ps.setString(2, clients.getlname());
            ps.setString(3, clients.getphone());
            ps.setString(4, clients.getemail());
            ps.setString(5, clients.getaddress());
            ps.setInt(6,clients.getid());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_clients.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       public boolean deleteNewclients(int Id){
        PreparedStatement ps;
        String deleteQuery="DELETE FROM `clients` WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1,Id);
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_clients.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       
       public ArrayList<p_clients>clientlist()
       {
             ArrayList<p_clients>list=new ArrayList<>();
            Statement st;
            ResultSet rs;
            String selected="SELECT * FROM `clients`";
        try {
          
            st=connectdb.getTheConnection().createStatement();
            rs=st.executeQuery(selected);
            p_clients clients;
            while(rs.next()){
                clients=new p_clients(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list.add(clients);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
}

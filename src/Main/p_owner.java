
package Main;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p_owner {
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
    public p_owner()
    {
        
    }
    public p_owner(int Id,String fname,String lname,String Phone,String Email,String Address){
        this.id=Id;
        this.firstname=fname;
        this.Lastname=lname;
        this.phone=Phone;
        this.email=Email;
        this.address=Address;
    }
    public boolean AddNewOwner(p_owner owner){
        PreparedStatement ps;
        String NewQuery="INSERT INTO `propertyowner`( `fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        try {
            ps=connectdb.getTheConnection().prepareStatement(NewQuery);
            ps.setString(1,owner.getfname());
            ps.setString(2, owner.getlname());
            ps.setString(3, owner.getphone());
            ps.setString(4, owner.getemail());
            ps.setString(5, owner.getaddress());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
     public boolean editNewOwner(p_owner owner){
        PreparedStatement ps;
        String editQuery="UPDATE `propertyowner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(editQuery);
            ps.setString(1,owner.getfname());
            ps.setString(2, owner.getlname());
            ps.setString(3, owner.getphone());
            ps.setString(4, owner.getemail());
            ps.setString(5, owner.getaddress());
            ps.setInt(6,owner.getid());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       public boolean deleteNewOwner(int Id){
        PreparedStatement ps;
        String deleteQuery="DELETE FROM `propertyowner` WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1,Id);
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       
       public ArrayList<p_owner>ownerlist()
       {
             ArrayList<p_owner>list=new ArrayList<>();
            Statement st;
            ResultSet rs;
            String selected="SELECT * FROM `propertyowner`";
        try {
          
            st=connectdb.getTheConnection().createStatement();
            rs=st.executeQuery(selected);
            p_owner owner;
            while(rs.next()){
                owner=new p_owner(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list.add(owner);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
}

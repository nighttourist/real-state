
package Main;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import static javax.swing.DropMode.INSERT;
public class p_type {
    private int id;
    private String name ;
    private String discription;
    public Integer getid()
    {
        return id;
    }
    public void setid(Integer Id)
    {
        this.id=Id;
    }
    public String getname(){
        return name;
    }
    public void setname(String Name){
        this.name=Name;
    }
    public String getdiscription(){
        return this.discription;
    }
    public void setdiscription(String Description){
        this.discription=Description;
    }
    public p_type(){}
    public p_type(Integer Id,String Name,String Description){
        this.id=Id;
        this.name=Name;
        this.discription=Description;
    }
    public boolean execTypeQuery(String querytype,p_type type){
        PreparedStatement ps;
        
        
    if(querytype.equals("add")){
            try {
                ps=  connectdb.getTheConnection().prepareStatement("INSERT INTO `propertytype`(`name`, `discription`) VALUES (?,?)");
                ps.setString(1, type.getname());
                ps.setString(2, type.getdiscription());
                return (ps.executeUpdate()>0);
            } catch (SQLException ex) {
                Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    
    
    
      else  if(querytype.equals("edit")){
            try {
                ps=  connectdb.getTheConnection().prepareStatement("UPDATE `propertytype` SET `name`=?,`discription`=? WHERE `id`=?");
                ps.setString(1, type.getname());
                ps.setString(2, type.getdiscription());
                ps.setInt(3,type.getid());
                return (ps.executeUpdate()>0);
            } catch (SQLException ex) {
                Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    
    
      else  if(querytype.equals("remove")){
            try {
                ps=  connectdb.getTheConnection().prepareStatement("DELETE FROM `propertytype` WHERE `id`=?");
           
                ps.setInt(1,type.getid());
                return (ps.executeUpdate()>0);
            } catch (SQLException ex) {
                Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    else
      {
          JOptionPane.showMessageDialog(null, "Enter the correct Oftion(add,remove,edit)", "Invalid Operation", 2);
          return false;
      }
    }
    
    public HashMap<String,Integer>getTypesMap(){
        HashMap<String,Integer>map=new HashMap<>();
        Statement st;
        ResultSet rs;
        try {
            st=connectdb.getTheConnection().createStatement();
            rs=st.executeQuery("SELECT * FROM `propertytype`");
            p_type type;
            while (rs.next()){
                type=new p_type(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getname(), type.getid());
            }
        } catch (SQLException ex) {
            Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
    public p_type getTypebyId(Integer id){
         PreparedStatement ps;
        ResultSet rs;
            p_type  type=new p_type() ;
        try {
            ps=connectdb.getTheConnection().prepareStatement("SELECT * FROM `propertytype` WHERE `id`=?");
            ps.setInt(1,id);
            
            rs=ps.executeQuery();
           ;
        if(rs.next())
        {
            type.setid(id);
            type.setname(rs.getString(2));
            type.setdiscription(rs.getString(3));
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type;
        
    }
}


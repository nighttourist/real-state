
package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class p_property {
    private int id;
    private int type;
    private int size;
    private int ownerid;
    private String price;
    private String address;
    private int bedroom;
    private int bathroom;
    private int age;
    private String description;
    private boolean balcone;
    private boolean pool;
    private boolean lift;
    private boolean backyard;
    private boolean garage;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    
    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }
    
    

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    public boolean isBalcone() {
        return balcone;
    }

    public void setBalcone(boolean balcone) {
        this.balcone = balcone;
    }

    
    
    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    
    
    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    
    
    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    
    
    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
 
    
    public p_property(){}
    public p_property(int Id,int Type,int Size,int OwnerId,String Price,
            String Address,int Bedroom,int Bathroom,int Age,boolean Balcone,
            boolean Pool,boolean Backyard,boolean Garage,boolean Lift,String Description){
        this.id=Id;
        this.type=Type;
        this.size=Size;
        this.ownerid=OwnerId;
        this.price=Price;
        this.address=Address;
        this.bedroom=Bedroom;
        this.bathroom=Bathroom;
        this.age=Age;
        this.balcone=Balcone;
        this.pool=Pool;
        this.backyard=Backyard;
        this.garage=Garage;
        this.lift=Lift;
        this.description=Description;
    }
    public boolean addnewproperty(p_property property){
        PreparedStatement ps;
        String addQuery="INSERT INTO `the_property`( `type`, `sqare_feet`, `ownerid`, `price`, `address`, `bedroom`, `bathroom`, `age`, `balcone`, `pool`, `backyard`, `garage`, `lift`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps=connectdb.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1,property.getType());
            ps.setInt(2,property.getSize());
            ps.setInt(3,property.getOwnerid());
            ps.setString(4,property.getPrice());
            ps.setString(5,property.getAddress());
            ps.setInt(6,property.getBedroom());
            ps.setInt(7,property.getBathroom());
            ps.setInt(8,property.getAge());
            ps.setBoolean(9,property.isBalcone());
            ps.setBoolean(10,property.isPool());
            ps.setBoolean(11,property.isBackyard());
            ps.setBoolean(12,property.isGarage());
            ps.setBoolean(13,property.isLift());
            ps.setString(14,property.getDescription());
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public boolean editproperty(p_property property){
        PreparedStatement ps;
        String editQuery="UPDATE `the_property` SET `type`=?,`sqare_feet`=?,`ownerid`=?,`price`=?,`address`=?,`bedroom`=?,`bathroom`=?,`age`=?,`balcone`=?,`pool`=?,`backyard`=?,`garage`=?,`lift`=?,`description`=? WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1,property.getType());
            ps.setInt(2,property.getSize());
            ps.setInt(3,property.getOwnerid());
            ps.setString(4,property.getPrice());
            ps.setString(5,property.getAddress());
            ps.setInt(6,property.getBedroom());
            ps.setInt(7,property.getBathroom());
            ps.setInt(8,property.getAge());
            ps.setBoolean(9,property.isBalcone());
            ps.setBoolean(10,property.isPool());
            ps.setBoolean(11,property.isBackyard());
            ps.setBoolean(12,property.isGarage());
            ps.setBoolean(13,property.isLift());
            ps.setString(14,property.getDescription());
            ps.setInt(15,property.getId());
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean removeproperty(int propertyId){
        PreparedStatement ps;
        String deleteQuery="DELETE FROM `the_property` WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1,propertyId);
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public p_property findproperty(int propertyId){
        PreparedStatement ps;
        ResultSet rs;
         p_property property=null;
        String searchQuery="SELECT * FROM `the_property` WHERE`id`=?";
        try {
           
            ps=connectdb.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1,propertyId);
           rs=ps.executeQuery();
           
            if(rs.next()){
                property=new p_property(
                     rs.getInt("id"),
                     rs.getInt("type"),
                     rs.getInt("sqare_feet"),
                     rs.getInt("ownerid"),
                     rs.getString("price"),
                     rs.getString("address"),
                     rs.getInt("bedroom"),
                     rs.getInt("bathroom"),
                     rs.getInt("age"),
                     rs.getBoolean("balcone"),
                     rs.getBoolean("pool"),
                     rs.getBoolean("backyard"),
                     rs.getBoolean("garage"),
                     rs.getBoolean("lift"),
                     rs.getString("description")
                );
            }
            return property;
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return property;
    }
    public  ArrayList<p_property>propertieslist(){
         ArrayList<p_property>list=new ArrayList<>();
            Statement st;
            ResultSet rs;
            String selected="SELECT * FROM `the_property`";
        try {
          
            st=connectdb.getTheConnection().createStatement();
            rs=st.executeQuery(selected);
            p_property property;
            while(rs.next()){
                property=new p_property(
                     rs.getInt("id"),
                     rs.getInt("type"),
                     rs.getInt("sqare_feet"),
                     rs.getInt("ownerid"),
                     rs.getString("price"),
                     rs.getString("address"),
                     rs.getInt("bedroom"),
                     rs.getInt("bathroom"),
                     rs.getInt("age"),
                     rs.getBoolean("balcone"),
                     rs.getBoolean("pool"),
                     rs.getBoolean("backyard"),
                     rs.getBoolean("garage"),
                     rs.getBoolean("lift"),
                     rs.getString("description")
                );
                list.add(property);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
     public  ArrayList<p_property>propertieslistbytype(int propertytype){
         ArrayList<p_property>list=new ArrayList<>();
            PreparedStatement ps;
            ResultSet rs;
            String selected="SELECT * FROM `the_property` WHERE `type`=?";
        try {
          
            ps=connectdb.getTheConnection().prepareStatement(selected);
            ps.setInt(1,propertytype);
            rs=ps.executeQuery();
            p_property property;
            while(rs.next()){
                property=new p_property(
                     rs.getInt("id"),
                     rs.getInt("type"),
                     rs.getInt("sqare_feet"),
                     rs.getInt("ownerid"),
                     rs.getString("price"),
                     rs.getString("address"),
                     rs.getInt("bedroom"),
                     rs.getInt("bathroom"),
                     rs.getInt("age"),
                     rs.getBoolean("balcone"),
                     rs.getBoolean("pool"),
                     rs.getBoolean("backyard"),
                     rs.getBoolean("garage"),
                     rs.getBoolean("lift"),
                     rs.getString("description")
                );
                list.add(property);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
     
      public  ArrayList<p_property>propertylistbyowner(int ownerid){
         ArrayList<p_property>list=new ArrayList<>();
            PreparedStatement ps;
            ResultSet rs;
            String selected="SELECT * FROM `the_property` WHERE `ownerid`=?";
        try {
          
            ps=connectdb.getTheConnection().prepareStatement(selected);
            ps.setInt(1,ownerid);
            rs=ps.executeQuery();
            p_property property;
            while(rs.next()){
                property=new p_property(
                     rs.getInt("id"),
                     rs.getInt("type"),
                     rs.getInt("sqare_feet"),
                     rs.getInt("ownerid"),
                     rs.getString("price"),
                     rs.getString("address"),
                     rs.getInt("bedroom"),
                     rs.getInt("bathroom"),
                     rs.getInt("age"),
                     rs.getBoolean("balcone"),
                     rs.getBoolean("pool"),
                     rs.getBoolean("backyard"),
                     rs.getBoolean("garage"),
                     rs.getBoolean("lift"),
                     rs.getString("description")
                );
                list.add(property);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
     
     
      public boolean addimage(int propertyid,String the_images_path){
        PreparedStatement ps;
        String addQuery="INSERT INTO `property_images`( `propertyid`, `the_image`) VALUES (?,?)";
        try {
            try {
             FileInputStream propertyimage=new FileInputStream(new File(the_images_path));
             
             ps=connectdb.getTheConnection().prepareStatement(addQuery);
             ps.setInt(1,propertyid);
             ps.setBinaryStream(2, propertyimage);
             
             return (ps.executeUpdate() > 0);
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null,ex.getMessage()+ "Invalid Images", "Failed Add Images", 2);
                return false;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
      
      
       public  HashMap<byte[],Integer>propertieimagelist(int propertyid){
          HashMap<byte[],Integer>list=new  HashMap<>();
            PreparedStatement ps;
            ResultSet rs;
            String selected="SELECT * FROM `property_images` WHERE `propertyid`=?";
        try {
          
            ps=connectdb.getTheConnection().prepareStatement(selected);
            ps.setInt(1,propertyid);
            rs=ps.executeQuery();
            while(rs.next()){
               list.put(rs.getBytes("the_image"), rs.getInt("id"));
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
       }
       
       
        public byte[] getimagelistbyid(int imageid){
            PreparedStatement ps;
            ResultSet rs;
            String selected="SELECT `the_image` FROM `property_images` WHERE `id`=?";
        try {
          
            ps=connectdb.getTheConnection().prepareStatement(selected);
            ps.setInt(1,imageid);
            rs=ps.executeQuery();
            if(rs.next()){
             return  rs.getBytes("the_image");
            }else{
                return null;
            }     
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       }
        
          public boolean removeimageid(int imageid){
            PreparedStatement ps;
            ResultSet rs;
            String deleteQuery="DELETE FROM `property_images` WHERE `id`=?";
        try {
          
            ps=connectdb.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1,imageid);
            return (ps.executeUpdate()>0);
                
        } catch (SQLException ex) {
            Logger.getLogger(p_property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       } 
    }


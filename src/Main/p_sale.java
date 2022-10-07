
package Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p_sale {
    private int id;
    private int propertyid;
    private int clientid;
    private String finalprice;
    private String sellingDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(int propertyid) {
        this.propertyid = propertyid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(String finalprice) {
        this.finalprice = finalprice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    
    public p_sale(){
        
    }
    public p_sale(int Id,int Propertyid,int Clientid,String Finalprice,String selling){
        this.id=Id;
        this.propertyid=Propertyid;
        this.clientid=Clientid;
        this.finalprice=Finalprice;
        this.sellingDate=selling;
    }
    
     public boolean AddNewsale(p_sale sale){
        PreparedStatement ps;
        String NewQuery="INSERT INTO `sale`(`propertyid`, `clientid`, `finalprice`, `sale_date`) VALUES (?,?,?,?)";
        try {
            ps=connectdb.getTheConnection().prepareStatement(NewQuery);
            ps.setInt(1,sale.getPropertyid());
            ps.setInt(2, sale.getClientid());
            ps.setString(3, sale.getFinalprice());
            ps.setString(4, sale.getSellingDate());
            ;
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
     public boolean editsale(p_sale sale){
        PreparedStatement ps;
        String editQuery="UPDATE `sale` SET `propertyid`=?,`clientid`=?,`finalprice`=?,`sale_date`=? WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1,sale.getPropertyid());
            ps.setInt(2, sale.getClientid());
            ps.setString(3, sale.getFinalprice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5,sale.getId());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       public boolean deletesale(int Id){
        PreparedStatement ps;
        String deleteQuery="DELETE FROM `sale` WHERE `id`=?";
        try {
            ps=connectdb.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1,Id);
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
        public ArrayList<p_sale>salelist()
       {
             ArrayList<p_sale>slist=new ArrayList<>();
            Statement st;
            ResultSet rs;
            String selected="SELECT * FROM `sale`";
        try {
          
            st=connectdb.getTheConnection().createStatement();
            rs=st.executeQuery(selected);
            p_sale sale;
            while(rs.next()){
                sale=new p_sale(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5) );
                slist.add(sale);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        return slist;
       }
    
}

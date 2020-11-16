/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author Yashitha nadiranga <your.name at your.org>
 */
public class CustomerFormController {

    public boolean uploadCustommer(Customer c) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?)");
        stm.setString(1, c.getCid());
        stm.setString(2, c.getFname());
        stm.setString(3, c.getLname());
        stm.setString(4, c.getNic());
        stm.setString(5, c.getAddr());
        stm.setString(6, c.getTp());
        stm.setString(7, c.getEmail());

        return stm.executeUpdate() > 0;
    }

    public boolean updateCustommer(Customer c1) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update customer set fname =? ,lname =?,nic =?,address =?,tpno=?,email=? where cust_Id = ?");

        stm.setString(1, c1.getFname());
        stm.setString(2, c1.getLname());
        stm.setString(3, c1.getNic());
        stm.setString(4, c1.getAddr());
        stm.setString(5, c1.getTp());
        stm.setString(6, c1.getEmail());
        stm.setString(7, c1.getCid());

        return stm.executeUpdate() > 0;
    }

    public List<Customer> loadAllData() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select * from customer").executeQuery();
        List<Customer> templist = new ArrayList();
        while (rst.next()) {            
            templist.add(
                    new Customer(
                            rst.getString(1), 
                            rst.getString(2), 
                            rst.getString(3), 
                            rst.getString(4), 
                            rst.getString(5), 
                            rst.getString(6), 
                            rst.getString(7)
                    )
                    
            );
                    
        }
        return templist;
    }

    public boolean deleteCustomer(String cid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from customer where cust_id = ?"); 
        pst.setString(1, cid);
        return pst.executeUpdate()>0;
    }

}

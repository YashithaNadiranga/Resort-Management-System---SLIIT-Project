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
import model.Cottage;

/**
 *
 * @author Yashitha nadiranga <your.name at your.org>
 */
public class CottageFormController {

    public boolean uploadCottage(Cottage cottage) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO cottage VALUES(?,?,?,?,?,?,?,?)");
        stm.setString(1, cottage.getBid());
        stm.setString(2, cottage.getCid());
        stm.setString(3, cottage.getNoa());
        stm.setString(4, cottage.getNoc());
        stm.setString(5, cottage.getDin());
        stm.setString(6, cottage.getDout());
        stm.setString(7, cottage.getCottage());
        stm.setString(8, cottage.getRoom());

        return stm.executeUpdate() > 0;
    }

    public List<Cottage> loadAllData() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("select * from cottage").executeQuery();
        List<Cottage> templist = new ArrayList();
        while (rst.next()) {
            templist.add(
                    new Cottage(
                            rst.getString(1),
                            rst.getString(2),
                            rst.getString(3),
                            rst.getString(4),
                            rst.getString(5),
                            rst.getString(6),
                            rst.getString(7),
                            rst.getString(8)
                    )
            );
        }
        return templist;
    }

    public boolean deleteCottage(String oid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("delete from cottage where bid = ?"); 
        pst.setString(1, oid);
        return pst.executeUpdate()>0;
    }
}

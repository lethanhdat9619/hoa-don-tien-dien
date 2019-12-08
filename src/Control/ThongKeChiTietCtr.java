/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.HoaDon;
import Model.hoGiaDinh;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ThongKeChiTietCtr {

    Connection con;
    hoGiaDinh ho;

    public hoGiaDinh getHo() {
        return ho;
    }
    public ThongKeChiTietCtr(hoGiaDinh ho) throws SQLException, ClassNotFoundException {
        con=getMySQLConnection();
        this.ho=ho;
    }

    private Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";

        String dbName = "tiendien";
        String userName = "root";
        String password = "";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    private Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
    public ArrayList<HoaDon> GetHoaDon() throws SQLException{
        ArrayList<HoaDon> list=new ArrayList<>();
        String sql ="SELECT * FROM tblhoadon WHERE trangthai=1 AND maho=?";
        PreparedStatement ps =(PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, ho.getMaHo());
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            HoaDon hd=new HoaDon(rs.getNString(1), rs.getNString(4), rs.getBoolean(5), rs.getInt(6), rs.getDouble(7), rs.getInt(8), rs.getDouble(9));
            list.add(hd);
        }
        return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
public class ThongKeDuNoCtr {

    private final Connection con;

    public ThongKeDuNoCtr() throws SQLException, ClassNotFoundException {
        con=getMySQLConnection();
    }
    

    public  Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";

        String dbName = "tiendien";
        String userName = "root";
        String password = "";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public  Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) throws SQLException,
            ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");

        
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }

    public ArrayList<hoGiaDinh> GetHoGiaDinh() throws SQLException, ClassNotFoundException {
        ArrayList<hoGiaDinh> list = new ArrayList<>();
        String sql = "SELECT * FROM tblhogiadinh";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hoGiaDinh ho = new hoGiaDinh(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(6));
            this.GetNo(con, ho);
            if (ho.getTongSoHoaDonThanhToan() > 0) {
                list.add(ho);
            }
        }
        return list;
    }

    public void GetNo(Connection con, hoGiaDinh ho) throws SQLException {
        String sql = "SELECT tongtien FROM tblhoadon WHERE maho=? AND trangthai=1";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, ho.getMaHo());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int dem = ho.getTongSoHoaDonThanhToan();
            dem++;
            ho.setTongSoHoaDonThanhToan(dem);
            double tienNo = ho.getSoTienConNo() + rs.getDouble(1);
            ho.setSoTienConNo(tienNo);
        }
    }
}

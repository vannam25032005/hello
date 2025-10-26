package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.MonAn;
import connectDB.ConnectDB;

public class MonAn_DAO {

    // 🧩 Đọc toàn bộ món ăn từ bảng
    public List<MonAn> docTuBang() {
        List<MonAn> dsMon = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConnectDB.getConnection();
            String sql = "SELECT * FROM MONAN";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MonAn mon = new MonAn(
                    rs.getString("maMon"),
                    rs.getString("tenMon"),
                    rs.getString("loaiMon"),
                    rs.getDouble("giaMon"),
                    rs.getString("hinhAnh"),
                    rs.getString("maQL")
                );
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, rs);
        }
        return dsMon;
    }

    // 🧩 Thêm món ăn
    public boolean themMonAn(MonAn mon) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConnectDB.getConnection();
            String sql = "INSERT INTO MONAN(maMon, tenMon, loaiMon, giaMon, hinhAnh, maQL) VALUES (?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, mon.getMaMon());
            ps.setString(2, mon.getTenMon());
            ps.setString(3, mon.getLoaiMon());
            ps.setDouble(4, mon.getGiaMon());
            ps.setString(5, mon.getHinhAnh());
            // Cho phép null nếu chưa có maQL
            if (mon.getMaQL() != null && !mon.getMaQL().isEmpty())
                ps.setString(6, mon.getMaQL());
            else
                ps.setNull(6, Types.NVARCHAR);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, null);
        }
        return false;
    }

    // 🧩 Chỉnh sửa món ăn
    public boolean chinhSuaMonAn(MonAn mon) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConnectDB.getConnection();
            String sql = "UPDATE MONAN SET tenMon=?, loaiMon=?, giaMon=?, hinhAnh=?, maQL=? WHERE maMon=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, mon.getTenMon());
            ps.setString(2, mon.getLoaiMon());
            ps.setDouble(3, mon.getGiaMon());
            ps.setString(4, mon.getHinhAnh());
            if (mon.getMaQL() != null && !mon.getMaQL().isEmpty())
                ps.setString(5, mon.getMaQL());
            else
                ps.setNull(5, Types.NVARCHAR);
            ps.setString(6, mon.getMaMon());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, null);
        }
        return false;
    }

    // 🧩 Tìm kiếm theo tên món ăn
    public List<MonAn> timTheoTen(String tenMon) {
        List<MonAn> ds = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConnectDB.getConnection();
            String sql = "SELECT * FROM MONAN WHERE tenMon LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tenMon + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                MonAn mon = new MonAn(
                    rs.getString("maMon"),
                    rs.getString("tenMon"),
                    rs.getString("loaiMon"),
                    rs.getDouble("giaMon"),
                    rs.getString("hinhAnh"),
                    rs.getString("maQL")
                );
                ds.add(mon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    // Lọc theo loại món
    public List<MonAn> locTheoLoai(String loaiMon) {
        List<MonAn> dsMon = new ArrayList<>();
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM MONAN WHERE loaiMon = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, loaiMon);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                MonAn mon = new MonAn(
                        rs.getString("maMon"),
                        rs.getString("tenMon"),
                        rs.getString("loaiMon"),
                        rs.getDouble("giaMon"),
                        rs.getString("hinhAnh"),
                        rs.getString("maQL")
                );
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsMon;
    }

    // Lọc + sắp xếp theo giá (cao → thấp hoặc thấp → cao)
    public ArrayList<MonAn> locTheoGia(String thuTu) {
        ArrayList<MonAn> dsMon = new ArrayList<>();
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM MONAN ORDER BY giaMon " +
                    (thuTu.equalsIgnoreCase("DESC") ? "DESC" : "ASC");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                MonAn mon = new MonAn(
                        rs.getString("maMon"),
                        rs.getString("tenMon"),
                        rs.getString("loaiMon"),
                        rs.getDouble("giaMon"),
                        rs.getString("hinhAnh"),
                        rs.getString("maQL")
                );
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsMon;
    }

    // Lọc kết hợp (theo loại + theo giá)
    public ArrayList<MonAn> locMonAn(String loaiMon, String thuTu) {
        ArrayList<MonAn> dsMon = new ArrayList<>();
        try {
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM MONAN";
            if (loaiMon != null && !loaiMon.equals("Tất cả")) {
                sql += " WHERE loaiMon = ?";
            }
            sql += " ORDER BY giaMon " + (thuTu.equalsIgnoreCase("DESC") ? "DESC" : "ASC");

            PreparedStatement ps = con.prepareStatement(sql);
            if (loaiMon != null && !loaiMon.equals("Tất cả")) {
                ps.setString(1, loaiMon);
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonAn mon = new MonAn(
                        rs.getString("maMon"),
                        rs.getString("tenMon"),
                        rs.getString("loaiMon"),
                        rs.getDouble("giaMon"),
                        rs.getString("hinhAnh"),
                        rs.getString("maQL")
                );
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsMon;
    }

    // 🧩 Hàm đóng kết nối
    private void close(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

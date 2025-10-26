package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class QLMonAn_GUI extends JPanel {

    // Khai báo biến tiếng Việt
    private JTextField txtMaMon, txtTenMon, txtGia, txtTimKiem;
    private JComboBox<String> cboLoaiMon, cboLoaiTimKiem, cboSapXep;
    private JButton btnThemMon, btnChinhSua, btnTimKiem, btnChonFile;
    private JLabel lblKhongCoFile, lblAnhPreview;

    public QLMonAn_GUI() {
        setLayout(new BorderLayout());
        setBackground(new Color(255, 225, 190));
        setBorder(new EmptyBorder(20, 20, 20, 20));

        // ===== TIÊU ĐỀ =====
        JLabel lblTieuDe = new JLabel("Quản lý món ăn");
        lblTieuDe.setFont(new Font("Arial", Font.BOLD, 24));
        lblTieuDe.setForeground(Color.DARK_GRAY);
        add(lblTieuDe, BorderLayout.NORTH);

        // ===== COMBINED PANEL CHO FORM VÀ SEARCH =====
        JPanel pnlTop = new JPanel(new BorderLayout());
        pnlTop.setBackground(new Color(255, 225, 190));
        pnlTop.setBorder(new EmptyBorder(60, 0, 10, 0));

        // Form thêm/chỉnh sửa (giống screenshot: form trái, ảnh phải)
        JPanel pnlFormMain = new JPanel(new BorderLayout());
        pnlFormMain.setBackground(new Color(255, 225, 190));
        pnlFormMain.setBorder(new EmptyBorder(0, 0, 20, 0));

        // Phần form fields (trái)
        JPanel pnlFormFields = new JPanel();
        pnlFormFields.setLayout(new BoxLayout(pnlFormFields, BoxLayout.Y_AXIS));
        pnlFormFields.setPreferredSize(new Dimension(300, 200)); // Fixed width cho form
        pnlFormFields.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Mã món
        JPanel pnlMaMon = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblMaMon = new JLabel("Mã món:");
        lblMaMon.setPreferredSize(new Dimension(80, 25));
        txtMaMon = new JTextField(15);
        pnlMaMon.add(lblMaMon);
        pnlMaMon.add(txtMaMon);
        pnlFormFields.add(pnlMaMon);

        // Tên món
        JPanel pnlTenMon = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTenMon = new JLabel("Tên món:");
        lblTenMon.setPreferredSize(new Dimension(80, 25));
        txtTenMon = new JTextField(15);
        pnlTenMon.add(lblTenMon);
        pnlTenMon.add(txtTenMon);
        pnlFormFields.add(pnlTenMon);

        // Loại món
        JPanel pnlLoaiMonForm = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblLoaiMonForm = new JLabel("Loại món:");
        lblLoaiMonForm.setPreferredSize(new Dimension(80, 25));
        String[] loaiMonOptions = {"Đồ ăn", "Đồ uống", "Ăn vặt"};
        cboLoaiMon = new JComboBox<>(loaiMonOptions);
        cboLoaiMon.setPreferredSize(new Dimension(150, 25));
        pnlLoaiMonForm.add(lblLoaiMonForm);
        pnlLoaiMonForm.add(cboLoaiMon);
        pnlFormFields.add(pnlLoaiMonForm);

        // Giá
        JPanel pnlGia = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblGia = new JLabel("Giá:");
        lblGia.setPreferredSize(new Dimension(80, 25));
        txtGia = new JTextField(15);
        pnlGia.add(lblGia);
        pnlGia.add(txtGia);
        pnlFormFields.add(pnlGia);

        // Ảnh chọn file
        JPanel pnlAnh = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblAnh = new JLabel("Ảnh:");
        lblAnh.setPreferredSize(new Dimension(50, 25));
        btnChonFile = new JButton("Choose file");
        btnChonFile.setPreferredSize(new Dimension(100, 25));
        lblKhongCoFile = new JLabel("No file chosen");
        lblKhongCoFile.setForeground(Color.GRAY);
        pnlAnh.add(lblAnh);
        pnlAnh.add(btnChonFile);
        pnlAnh.add(lblKhongCoFile);
        pnlFormFields.add(pnlAnh);

        pnlFormMain.add(pnlFormFields, BorderLayout.CENTER);

//        // Phần preview ảnh (phải)
//        JPanel pnlPreview = new JPanel(new BorderLayout());
//        pnlPreview.setBackground(Color.WHITE);
//        pnlPreview.setPreferredSize(new Dimension(200, 200));
//        pnlPreview.setBorder(new LineBorder(Color.GRAY, 1));
//        lblAnhPreview = new JLabel("Preview ảnh", SwingConstants.CENTER);
//        lblAnhPreview.setFont(new Font("Arial", Font.ITALIC, 12));
//        lblAnhPreview.setHorizontalAlignment(SwingConstants.CENTER);
//        lblAnhPreview.setVerticalAlignment(SwingConstants.CENTER);
//        pnlPreview.add(lblAnhPreview, BorderLayout.CENTER);
//        pnlFormMain.add(pnlPreview, BorderLayout.EAST);

        // Nút Thêm/Chỉnh sửa (dưới form)
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlButtons.setBackground(new Color(255, 225, 190));
        pnlButtons.setOpaque(false);
        btnThemMon = new JButton("Thêm món");
        btnThemMon.setBackground(new Color(144, 238, 144)); // Green
        btnThemMon.setPreferredSize(new Dimension(100, 30));
        btnChinhSua = new JButton("Chỉnh sửa");
        btnChinhSua.setBackground(new Color(173, 216, 230)); // Light blue
        btnChinhSua.setPreferredSize(new Dimension(100, 30));
        pnlButtons.add(btnThemMon);
        pnlButtons.add(btnChinhSua);
        pnlFormMain.add(pnlButtons, BorderLayout.SOUTH);

        pnlTop.add(pnlFormMain, BorderLayout.NORTH);

        // Tìm kiếm (phía dưới form, với lọc sang bên phải)
        JPanel pnlSearch = new JPanel(new BorderLayout());
        pnlSearch.setBackground(new Color(255, 225, 190));
        pnlSearch.setOpaque(false);
        pnlSearch.setBorder(new EmptyBorder(0, 0, 10, 0));

        // Phần trái: Tìm kiếm + nút Tìm
        JPanel pnlLeft = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlLeft.setBackground(new Color(255, 225, 190));
        pnlLeft.setOpaque(false);
        txtTimKiem = new JTextField(15);
        btnTimKiem = new JButton("Tìm");
        pnlLeft.add(new JLabel("Tìm kiếm:"));
        pnlLeft.add(txtTimKiem);
        pnlLeft.add(btnTimKiem);

        // Phần phải: Lọc loại món và mới nhất
        JPanel pnlRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlRight.setBackground(new Color(255, 225, 190));
        pnlRight.setOpaque(false);
        String[] loaiOptions = {"Tất cả", "Đồ ăn", "Đồ uống"};
        cboLoaiTimKiem = new JComboBox<>(loaiOptions);
        String[] sortOptions = {"Mới nhất", "Giá tăng dần"};
        cboSapXep = new JComboBox<>(sortOptions);
        pnlRight.add(cboLoaiTimKiem);
        pnlRight.add(new JLabel(" | "));
        pnlRight.add(cboSapXep);

        pnlSearch.add(pnlLeft, BorderLayout.WEST);
        pnlSearch.add(pnlRight, BorderLayout.EAST);

        pnlTop.add(pnlSearch, BorderLayout.SOUTH);

        add(pnlTop, BorderLayout.NORTH);

        // ===== BẢNG DANH SÁCH MÓN =====
        String[] columns = {"Mã món", "Tên món", "Loại món", "Giá"};
        Object[][] data = {
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
            {"MA01", "Phở", "Đồ ăn", "100.000 VND"},
            {"MA02", "Bò kho", "Đồ ăn", "120.000 VND"},
            {"MA03", "Trà đá", "Đồ uống", "10.000 VND"},
            {"MA04", "Sinh tố dâu", "Đồ uống", "80.000 VND"},
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(800, 200));
        table.setFillsViewportHeight(true);
        table.setGridColor(Color.GRAY);
        table.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scrollTable = new JScrollPane(table);
        add(scrollTable, BorderLayout.CENTER);
    }

 
}
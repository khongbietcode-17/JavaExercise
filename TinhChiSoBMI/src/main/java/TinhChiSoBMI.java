import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TinhChiSoBMI {
    public static void BMI() {
        JFrame frame = new JFrame("Tính Chỉ Số BMI");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình

        JPanel panelNorth = new JPanel();
        JPanel panelNorthTop = new JPanel();
        JLabel label = new JLabel("Tính Chỉ Số BMI", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setPreferredSize(new Dimension(400, 30));
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.WHITE);
        panelNorthTop.add(label);
        panelNorth.add(panelNorthTop, BorderLayout.NORTH);

        JPanel panelNorthBot = new JPanel();
        panelNorthBot.setLayout(new GridLayout(3, 2, 5, 5));
        panelNorthBot.setPreferredSize(new Dimension(400, 150));
        panelNorthBot.setBorder(BorderFactory.createEmptyBorder(0, 20, 50, 20));

        // Tạo label và textfield
        JLabel labelName = new JLabel("Nhập tên:");
        JTextField txtName = new JTextField();
        JLabel labelHeight = new JLabel("Nhập chiều cao (m):");
        JTextField txtHeight = new JTextField();
        JLabel labelWeight = new JLabel("Nhập cân nặng (kg):");
        JTextField txtWeight = new JTextField();

        panelNorthBot.add(labelName);
        panelNorthBot.add(txtName);
        panelNorthBot.add(labelHeight);
        panelNorthBot.add(txtHeight);
        panelNorthBot.add(labelWeight);
        panelNorthBot.add(txtWeight);
        panelNorth.add(panelNorthBot, BorderLayout.SOUTH);
        frame.add(panelNorth, BorderLayout.NORTH);

        // Panel Center
        JPanel panelCenter = new JPanel();
        JButton btnTinhBMI = new JButton("Tính Chỉ Số BMI");
        btnTinhBMI.setPreferredSize(new Dimension(400, 50));
        panelCenter.add(btnTinhBMI);
        panelCenter.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        frame.add(panelCenter, BorderLayout.CENTER);

        // Panel South
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new BorderLayout());
        JPanel panelSTop = new JPanel();
        panelSTop.setLayout(new GridLayout(2, 2, 5, 5));
        panelSTop.setPreferredSize(new Dimension(400, 70));
        panelSTop.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));
        JLabel labelBMI = new JLabel("BMI của bạn là:");
        JTextField txtBMI = new JTextField();
        txtBMI.setEditable(false); // Không cho phép sửa
        JLabel labelCD = new JLabel("Chẩn Đoán:");
        JTextField txtCD = new JTextField();
        txtCD.setEditable(false); // Không cho phép sửa
        panelSTop.add(labelBMI);
        panelSTop.add(txtBMI);
        panelSTop.add(labelCD);
        panelSTop.add(txtCD);
        panelSouth.add(panelSTop, BorderLayout.NORTH);

        JPanel panelSBot = new JPanel();
        panelSBot.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));
        JButton btnThoat = new JButton("Thoát");
        btnThoat.setPreferredSize(new Dimension(400, 50));
        panelSBot.add(btnThoat);
        panelSouth.add(panelSBot, BorderLayout.CENTER);
        frame.add(panelSouth, BorderLayout.SOUTH);

        // Sự kiện cho btnTinhBMI
        btnTinhBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy giá trị chiều cao và cân nặng
                    double height = Double.parseDouble(txtHeight.getText());
                    double weight = Double.parseDouble(txtWeight.getText());

                    // Tính chỉ số BMI
                    double bmi = weight / (height * height);
                    txtBMI.setText(String.format("%.2f", bmi)); // Hiển thị BMI với 2 chữ số thập phân

                    // Chẩn đoán
                    String diagnosis;
                    if (bmi < 18.5) {
                        diagnosis = "Gầy";
                    } else if (bmi < 24.9) {
                        diagnosis = "Bình thường";
                    } else if (bmi < 29.9) {
                        diagnosis = "Thừa cân";
                    } else {
                        diagnosis = "Béo phì";
                    }
                    txtCD.setText(diagnosis); // Hiển thị chẩn đoán
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập đúng dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Sự kiện cho btnThoat
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // Hiển thị frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TinhChiSoBMI::BMI);
    }
}

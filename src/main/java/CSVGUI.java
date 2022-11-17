
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CSVGUI {
    private JPanel mainPanel;
    private JTable lecturerTable;
    private JScrollPane scrollPane;
    private JTextField pathEntryField;
    private JRadioButton selectionSortRadioButton;
    private JRadioButton otherRadioButton;
    private JButton sortButton;
    private JTextField ticksTextField;
    private JButton pathButton;

    public CSVGUI() {
        System.out.println("Constructor");
        pathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser((String) "src/main/resources");
                if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
                    String path = String.valueOf(fc.getSelectedFile());
                    pathEntryField.setText(path);
                }
            }
        });
    }



    private void createUIComponents() {
        System.out.println("Create UI");
        Object[] cols = {"id", "name", "age" ,"status", "gender"};
        lecturerTable = new JTable(new DefaultTableModel(cols, 0));
        scrollPane = new JScrollPane(lecturerTable);
        selectionSortRadioButton = new JRadioButton("", true);
        otherRadioButton = new JRadioButton("", false);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("DDBBGUI");
        frame.setContentPane(new CSVGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

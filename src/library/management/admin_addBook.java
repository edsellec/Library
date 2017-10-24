/*
 * add/s book/s to library.txt
 */
package library.management;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edseeraan
 */
public class admin_addBook extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public admin_addBook() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public static void start(){
            admin_addBook window = new admin_addBook();
            window.setVisible(true);
    }
    
    final String LIB_FILE_NAME = "C:\\Library\\library.txt";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        admin_goBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin_bookTitle = new javax.swing.JTextField();
        admin__submit = new javax.swing.JButton();
        admin_bookAuthor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        User_tableBook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin_goBack.setFont(new java.awt.Font("Montserrat ExtraLight", 0, 12)); // NOI18N
        admin_goBack.setText("Menu");
        admin_goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_goBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraLight", 0, 12)); // NOI18N
        jLabel2.setText("Book Title");

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraLight", 0, 12)); // NOI18N
        jLabel3.setText("Book Author");

        admin__submit.setFont(new java.awt.Font("Montserrat ExtraLight", 0, 12)); // NOI18N
        admin__submit.setText("Add Book");
        admin__submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin__submitActionPerformed(evt);
            }
        });

        User_tableBook.setAutoCreateRowSorter(true);
        User_tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Book Author"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        User_tableBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        User_tableBook.setMaximumSize(new java.awt.Dimension(1090, 64));
        User_tableBook.setRowSelectionAllowed(false);
        User_tableBook.setShowVerticalLines(false);
        jScrollPane1.setViewportView(User_tableBook);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(admin__submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admin_bookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(admin_goBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admin_bookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(admin_bookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admin__submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(admin_goBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin__submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin__submitActionPerformed
        File temp = new File(LIB_FILE_NAME);
        if (!temp.exists()){
            try {
                temp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(admin_addBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String book = admin_bookTitle.getText();
        String author = admin_bookAuthor.getText();
        if ((!book.equals("")) && (!author.equals(""))){
            try {
                Index text = new Index();
                text.storebook(book, author);
                text.logHistory("Admin added "+book+" by "+author);
                ErrorManager.catchSuccess("Book Title and Author are added to the library!");
            } catch (IOException ex) {
                Logger.getLogger(admin_addBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            ErrorManager.catchError("All textfields must contain information!");
        }
        load();
    }//GEN-LAST:event_admin__submitActionPerformed

    private void admin_goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_goBackActionPerformed
        admin_menu.start();
        dispose();
    }//GEN-LAST:event_admin_goBackActionPerformed

    private void load() {
        DefaultTableModel model = (DefaultTableModel) User_tableBook.getModel();
        model.setRowCount(0);
        File temp = new File("C:\\Library\\library.txt");
        if (!temp.exists()){
            ErrorManager.catchError("Library doesn't have stored books!");
        }
        else {
            try {
                readFile();
            } catch (IOException ex) {
                Logger.getLogger(user_borrow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void readFile() throws IOException {
        File file = new File("C:\\Library\\library.txt");
        String readLine = null;
        FileReader reader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(reader);
        while((readLine = buffReader.readLine()) != null) {
            String[] splitData = readLine.split(";");
            admin_addBook.Book book = new admin_addBook.Book();
            book.setName(splitData[0]);
            book.setAuthor(splitData[1]);
            DefaultTableModel model = (DefaultTableModel) User_tableBook.getModel();
            model.addRow(new String[]{book.getName(), book.getAuthor()});
        }
    }
    
    class Book {

        private String name;
        private String author;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable User_tableBook;
    private javax.swing.JButton admin__submit;
    private javax.swing.JTextField admin_bookAuthor;
    private javax.swing.JTextField admin_bookTitle;
    private javax.swing.JButton admin_goBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

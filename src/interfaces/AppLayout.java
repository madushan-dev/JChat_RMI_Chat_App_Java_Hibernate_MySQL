/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controller.Connection;
import dbmanager.DBManager;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Groups;
import pojos.Users;

/**
 *
 * @author Madushan
 */
public class AppLayout extends javax.swing.JFrame {
    
    int id;

    /**
     * Creates new form AppLayout
     */
    public AppLayout() {
        initComponents();
        
        active.setBackground(new java.awt.Color(0,0,0,1));
        textusername.setBackground(new java.awt.Color(0,0,0,1));
        textpassword.setBackground(new java.awt.Color(0,0,0,1));
        textregemail.setBackground(new java.awt.Color(0,0,0,1));
        textregusername.setBackground(new java.awt.Color(0,0,0,1));
        textregnickname.setBackground(new java.awt.Color(0,0,0,1));
        textregpassword.setBackground(new java.awt.Color(0,0,0,1));
        textgroupname.setBackground(new java.awt.Color(0,0,0,1));
        textgroupdescription.setBackground(new java.awt.Color(0,0,0,1));
        edit_email.setBackground(new java.awt.Color(0,0,0,1));
        edit_username.setBackground(new java.awt.Color(0,0,0,1));
        edit_nickname.setBackground(new java.awt.Color(0,0,0,1));
        edit_password.setBackground(new java.awt.Color(0,0,0,1));


        
        login_panel.setVisible(true);
        register_panel.setVisible(false);
        admin_panel.setVisible(false);
        create_chat_panel.setVisible(false);
        list_groups_panel.setVisible(false);
        chat_panel.setVisible(false);
        edit_profile_panel.setVisible(false);
        
 
        
        
        
    }
    
    public void app_ui_reset(){
        login_panel.setVisible(false);
        register_panel.setVisible(false);
        admin_panel.setVisible(false);
        create_chat_panel.setVisible(false);
        list_groups_panel.setVisible(false);
        chat_panel.setVisible(false);
        edit_profile_panel.setVisible(false);  
        
    }
    
        public ImageIcon toImageIcon(byte[] img) {
        BufferedImage Imgavatar;
        ImageIcon avatar = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(img);
            Imgavatar = ImageIO.read(bis);
            if (Imgavatar != null) {
                avatar = new ImageIcon(Imgavatar);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return avatar;
    }
        
      public BufferedImage ImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return bi;
    }
    
    public ArrayList<String> validatelogin(String username, String password) {
        ArrayList<String> errors = new ArrayList<>();

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        return errors;
    }
    
        public ArrayList<String> validateform(String email, String username,String password) {

        ArrayList<String> errors = new ArrayList<>();

        if (email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$") == false) {
            errors.add("Invalid email");
        }

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        if (password.length() < 4) {
            errors.add("Password must contain more than 4 characters");
        }

        return errors;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        login_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textpassword = new javax.swing.JPasswordField();
        disable = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        linkreg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        text_login_errors = new javax.swing.JLabel();
        register_panel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        signup_profile_pic = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textregemail = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        textregpassword = new javax.swing.JPasswordField();
        disable2 = new javax.swing.JLabel();
        btnreg = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        linklog = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        textregnickname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        text_reg_errors = new javax.swing.JLabel();
        textregusername = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        admin_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        text_admin_username = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        img_profile = new javax.swing.JLabel();
        create_group = new javax.swing.JLabel();
        create_group1 = new javax.swing.JLabel();
        create_group3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        create_group2 = new javax.swing.JLabel();
        create_chat_panel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        textgroupdescription = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        textgroupname = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        btn_create_group = new javax.swing.JButton();
        group_create_text = new javax.swing.JLabel();
        list_groups_panel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        text_user_username = new javax.swing.JLabel();
        edit_profile_link_1 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        logout2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        btnlogin4 = new javax.swing.JButton();
        active = new javax.swing.JRadioButton();
        chat_panel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        logout3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        textgroupdescription1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        btnlogin5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        edit_profile_panel = new javax.swing.JPanel();
        img_profile_anel = new javax.swing.JPanel();
        text_user_username2 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        img_profile2 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        edit_email = new javax.swing.JTextField();
        edit_password = new javax.swing.JPasswordField();
        disable3 = new javax.swing.JLabel();
        btnreg1 = new javax.swing.JButton();
        show3 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        edit_username = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        update_msg = new javax.swing.JLabel();
        edit_profile_image = new javax.swing.JLabel();
        text_reg_errors2 = new javax.swing.JLabel();
        edit_nickname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(970, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        login_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_panelMouseClicked(evt);
            }
        });
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/bg-login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        login_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JChat");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 24, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("____________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 153, 56, 56));

        textusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textusername.setForeground(new java.awt.Color(255, 255, 255));
        textusername.setBorder(null);
        textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusernameActionPerformed(evt);
            }
        });
        jPanel2.add(textusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 308, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        textpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textpassword.setForeground(new java.awt.Color(255, 255, 255));
        textpassword.setBorder(null);
        textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(textpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 308, 34));

        disable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_invisible_20px_1.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 248, 56, 43));

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 153, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(null);
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 320, 44));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));

        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_eye_20px_1.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 248, 56, 43));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Java-Based Chat Application");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 79, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Don't you have an account?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        linkreg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        linkreg.setForeground(new java.awt.Color(255, 255, 255));
        linkreg.setText("Register");
        linkreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkregMouseClicked(evt);
            }
        });
        jPanel2.add(linkreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_______________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_______________________________");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 310, -1));

        text_login_errors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_login_errors.setForeground(new java.awt.Color(255, 0, 51));
        text_login_errors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(text_login_errors, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 270, 20));

        login_panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 500, 500));

        register_panel.setBackground(new java.awt.Color(255, 255, 255));
        register_panel.setMinimumSize(new java.awt.Dimension(970, 500));
        register_panel.setPreferredSize(new java.awt.Dimension(1016, 585));
        register_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(520, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_profile_pic.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        signup_profile_pic.setForeground(new java.awt.Color(111, 117, 124));
        signup_profile_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_profile_pic.setText("Select Profile Picture");
        signup_profile_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        signup_profile_pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_profile_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_profile_picMouseClicked(evt);
            }
        });
        jPanel5.add(signup_profile_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 304, 258));

        register_panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 480, 580));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Register");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 25, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Password");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("____________________________________________");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, 35));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_user_20px_1.png"))); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 56, 56));

        textregemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textregemail.setForeground(new java.awt.Color(255, 255, 255));
        textregemail.setBorder(null);
        textregemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textregemailActionPerformed(evt);
            }
        });
        jPanel6.add(textregemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 308, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Password");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        textregpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textregpassword.setForeground(new java.awt.Color(255, 255, 255));
        textregpassword.setBorder(null);
        textregpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textregpasswordActionPerformed(evt);
            }
        });
        jPanel6.add(textregpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 308, 34));

        disable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_invisible_20px_1.png"))); // NOI18N
        disable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable2MouseClicked(evt);
            }
        });
        jPanel6.add(disable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 56, 43));

        btnreg.setBackground(new java.awt.Color(255, 255, 255));
        btnreg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnreg.setForeground(new java.awt.Color(0, 153, 255));
        btnreg.setText("REGISTER");
        btnreg.setBorder(null);
        btnreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregMouseClicked(evt);
            }
        });
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });
        jPanel6.add(btnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 44));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Username");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));

        show2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_eye_20px_1.png"))); // NOI18N
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        jPanel6.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 56, 43));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Do You have an account?");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        linklog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        linklog.setForeground(new java.awt.Color(255, 255, 255));
        linklog.setText("Login");
        linklog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linklog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linklogMouseClicked(evt);
            }
        });
        jPanel6.add(linklog, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("_______________________________");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Email");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("_______________________________");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        textregnickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textregnickname.setForeground(new java.awt.Color(255, 255, 255));
        textregnickname.setBorder(null);
        textregnickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textregnicknameActionPerformed(evt);
            }
        });
        jPanel6.add(textregnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 308, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nickname");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_______________________________");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        text_reg_errors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_reg_errors.setForeground(new java.awt.Color(255, 0, 51));
        text_reg_errors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(text_reg_errors, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 270, 20));

        textregusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textregusername.setForeground(new java.awt.Color(255, 255, 255));
        textregusername.setBorder(null);
        textregusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textregusernameActionPerformed(evt);
            }
        });
        jPanel6.add(textregusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 308, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("_______________________________");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        register_panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -30, 560, 610));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        text_admin_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_admin_username.setForeground(new java.awt.Color(255, 255, 255));
        text_admin_username.setText("Welcome Admin");

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        create_group.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_group.setForeground(new java.awt.Color(255, 255, 255));
        create_group.setText("Create Group");
        create_group.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_groupMouseClicked(evt);
            }
        });

        create_group1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_group1.setForeground(new java.awt.Color(255, 255, 255));
        create_group1.setText("Users");
        create_group1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group1MouseClicked(evt);
            }
        });

        create_group3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_group3.setForeground(new java.awt.Color(255, 255, 255));
        create_group3.setText("Groups");
        create_group3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create_group3)
                    .addComponent(create_group1)
                    .addComponent(logout)
                    .addComponent(create_group)
                    .addComponent(text_admin_username)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(img_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(img_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_admin_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(create_group3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create_group)
                .addGap(18, 18, 18)
                .addComponent(create_group1)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("X");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 29, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("All Chat Groups");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel9);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 590, 390));

        create_group2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_group2.setForeground(new java.awt.Color(255, 255, 255));
        create_group2.setText("Create Group");
        create_group2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_group2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_group2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout admin_panelLayout = new javax.swing.GroupLayout(admin_panel);
        admin_panel.setLayout(admin_panelLayout);
        admin_panelLayout.setHorizontalGroup(
            admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
            .addGroup(admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_panelLayout.createSequentialGroup()
                    .addGap(228, 228, 228)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(admin_panelLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_panelLayout.createSequentialGroup()
                    .addGap(516, 516, 516)
                    .addComponent(create_group2)
                    .addContainerGap(517, Short.MAX_VALUE)))
        );
        admin_panelLayout.setVerticalGroup(
            admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_panelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_panelLayout.createSequentialGroup()
                    .addGap(282, 282, 282)
                    .addComponent(create_group2)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Welcome Admin");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Edit Profile");

        jLabel39.setBackground(new java.awt.Color(153, 51, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Join Group");

        logout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setText("Logout");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout1)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel39)
                .addGap(31, 31, 31)
                .addComponent(jLabel38)
                .addGap(27, 27, 27)
                .addComponent(logout1)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("X");
        jLabel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 29, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("CREATE A CHAT GROUP");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Group Description");
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        textgroupdescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textgroupdescription.setForeground(new java.awt.Color(255, 255, 255));
        textgroupdescription.setBorder(null);
        textgroupdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textgroupdescriptionActionPerformed(evt);
            }
        });
        jPanel8.add(textgroupdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 480, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("________________________________________________");
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 480, -1));

        textgroupname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textgroupname.setForeground(new java.awt.Color(255, 255, 255));
        textgroupname.setBorder(null);
        textgroupname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textgroupnameActionPerformed(evt);
            }
        });
        jPanel8.add(textgroupname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 480, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("________________________________________________");
        jPanel8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 480, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Group Name");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        btn_create_group.setBackground(new java.awt.Color(255, 255, 255));
        btn_create_group.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_create_group.setForeground(new java.awt.Color(0, 153, 255));
        btn_create_group.setText("CREATE GROUP");
        btn_create_group.setBorder(null);
        btn_create_group.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create_group.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_create_groupMouseClicked(evt);
            }
        });
        btn_create_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_groupActionPerformed(evt);
            }
        });
        jPanel8.add(btn_create_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 480, 44));

        group_create_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        group_create_text.setForeground(new java.awt.Color(255, 0, 51));
        group_create_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(group_create_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 270, 20));

        javax.swing.GroupLayout create_chat_panelLayout = new javax.swing.GroupLayout(create_chat_panel);
        create_chat_panel.setLayout(create_chat_panelLayout);
        create_chat_panelLayout.setHorizontalGroup(
            create_chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_chat_panelLayout.createSequentialGroup()
                .addGap(0, 280, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(create_chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(create_chat_panelLayout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 737, Short.MAX_VALUE)))
        );
        create_chat_panelLayout.setVerticalGroup(
            create_chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(create_chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        list_groups_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_groups_panelMouseClicked(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(0, 102, 204));

        text_user_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_user_username.setForeground(new java.awt.Color(255, 255, 255));
        text_user_username.setText("Welcome Admin");

        edit_profile_link_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit_profile_link_1.setForeground(new java.awt.Color(255, 255, 255));
        edit_profile_link_1.setText("Edit Profile");
        edit_profile_link_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_profile_link_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_profile_link_1MouseClicked(evt);
            }
        });

        jLabel60.setBackground(new java.awt.Color(153, 51, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Join Group");

        logout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout2.setForeground(new java.awt.Color(255, 255, 255));
        logout2.setText("Logout");
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout2)
                    .addComponent(jLabel60)
                    .addComponent(edit_profile_link_1)
                    .addComponent(text_user_username))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(text_user_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel60)
                .addGap(34, 34, 34)
                .addComponent(edit_profile_link_1)
                .addGap(28, 28, 28)
                .addComponent(logout2)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 153, 255));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("X");
        jLabel62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 29, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("All Chat Groups");
        jPanel14.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jScrollPane2.setForeground(new java.awt.Color(0, 51, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");

        jPanel15.setBackground(new java.awt.Color(0, 153, 255));

        jPanel16.setBackground(new java.awt.Color(102, 102, 255));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Group Name");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Group Description");

        btnlogin4.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogin4.setForeground(new java.awt.Color(0, 153, 255));
        btnlogin4.setText("SUBSCRIBE");
        btnlogin4.setBorder(null);
        btnlogin4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin4ActionPerformed(evt);
            }
        });

        active.setForeground(new java.awt.Color(255, 255, 255));
        active.setText("ACTIVE");
        active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(active)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(btnlogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(active))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnlogin4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel15);

        jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 590, 390));

        javax.swing.GroupLayout list_groups_panelLayout = new javax.swing.GroupLayout(list_groups_panel);
        list_groups_panel.setLayout(list_groups_panelLayout);
        list_groups_panelLayout.setHorizontalGroup(
            list_groups_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
            .addGroup(list_groups_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(list_groups_panelLayout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        list_groups_panelLayout.setVerticalGroup(
            list_groups_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(list_groups_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(list_groups_panelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(list_groups_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        chat_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chat_panelMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(0, 102, 204));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Welcome Admin");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Edit Profile");

        jLabel46.setBackground(new java.awt.Color(153, 51, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Join Group");

        logout3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout3.setForeground(new java.awt.Color(255, 255, 255));
        logout3.setText("Logout");
        logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout3)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel46)
                .addGap(27, 27, 27)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(logout3)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 153, 255));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("X");
        jLabel48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 29, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("GROUP NAME");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        textgroupdescription1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textgroupdescription1.setForeground(new java.awt.Color(255, 255, 255));
        textgroupdescription1.setBorder(null);
        textgroupdescription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textgroupdescription1ActionPerformed(evt);
            }
        });
        jPanel12.add(textgroupdescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 480, 30));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("________________________________________________");
        jPanel12.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 480, -1));

        btnlogin5.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnlogin5.setForeground(new java.awt.Color(0, 153, 255));
        btnlogin5.setText("SEND");
        btnlogin5.setBorder(null);
        btnlogin5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin5ActionPerformed(evt);
            }
        });
        jPanel12.add(btnlogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 170, 44));

        jScrollPane3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 660, 360));

        javax.swing.GroupLayout chat_panelLayout = new javax.swing.GroupLayout(chat_panel);
        chat_panel.setLayout(chat_panelLayout);
        chat_panelLayout.setHorizontalGroup(
            chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chat_panelLayout.createSequentialGroup()
                .addGap(0, 417, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chat_panelLayout.createSequentialGroup()
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 729, Short.MAX_VALUE)))
        );
        chat_panelLayout.setVerticalGroup(
            chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edit_profile_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_profile_panelMouseClicked(evt);
            }
        });

        img_profile_anel.setBackground(new java.awt.Color(0, 102, 204));
        img_profile_anel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_profile_anelMouseClicked(evt);
            }
        });

        text_user_username2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_user_username2.setForeground(new java.awt.Color(255, 255, 255));
        text_user_username2.setText("Welcome Admin");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Edit Profile");

        jLabel58.setBackground(new java.awt.Color(153, 51, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Join Group");

        logout4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout4.setForeground(new java.awt.Color(255, 255, 255));
        logout4.setText("Logout");
        logout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout4MouseClicked(evt);
            }
        });

        img_profile2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        img_profile2.setForeground(new java.awt.Color(255, 255, 255));
        img_profile2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_profile2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout img_profile_anelLayout = new javax.swing.GroupLayout(img_profile_anel);
        img_profile_anel.setLayout(img_profile_anelLayout);
        img_profile_anelLayout.setHorizontalGroup(
            img_profile_anelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_profile_anelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(img_profile_anelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout4)
                    .addComponent(jLabel58)
                    .addComponent(jLabel56)
                    .addComponent(text_user_username2)
                    .addGroup(img_profile_anelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(img_profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        img_profile_anelLayout.setVerticalGroup(
            img_profile_anelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_profile_anelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(img_profile2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_user_username2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel58)
                .addGap(31, 31, 31)
                .addComponent(jLabel56)
                .addGap(27, 27, 27)
                .addComponent(logout4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(51, 153, 255));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("EDIT PROFILE");
        jPanel19.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Password");
        jPanel19.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_user_20px_1.png"))); // NOI18N
        jPanel19.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 56, 56));

        edit_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_email.setForeground(new java.awt.Color(255, 255, 255));
        edit_email.setBorder(null);
        edit_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_emailActionPerformed(evt);
            }
        });
        jPanel19.add(edit_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 308, 30));

        edit_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_password.setForeground(new java.awt.Color(255, 255, 255));
        edit_password.setBorder(null);
        edit_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_passwordActionPerformed(evt);
            }
        });
        jPanel19.add(edit_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 308, 34));

        disable3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_invisible_20px_1.png"))); // NOI18N
        disable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable3MouseClicked(evt);
            }
        });
        jPanel19.add(disable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 56, 43));

        btnreg1.setBackground(new java.awt.Color(255, 255, 255));
        btnreg1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnreg1.setForeground(new java.awt.Color(0, 153, 255));
        btnreg1.setText("SUBMIT");
        btnreg1.setBorder(null);
        btnreg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreg1MouseClicked(evt);
            }
        });
        btnreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreg1ActionPerformed(evt);
            }
        });
        jPanel19.add(btnreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 320, 44));

        show3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons/icons8_eye_20px_1.png"))); // NOI18N
        show3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show3MouseClicked(evt);
            }
        });
        jPanel19.add(show3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 56, 43));

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("_______________________________");
        jPanel19.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Email");
        jPanel19.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("_______________________________");
        jPanel19.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        edit_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_username.setForeground(new java.awt.Color(255, 255, 255));
        edit_username.setBorder(null);
        edit_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_usernameActionPerformed(evt);
            }
        });
        jPanel19.add(edit_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 308, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nickname");
        jPanel19.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("_______________________________");
        jPanel19.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        update_msg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_msg.setForeground(new java.awt.Color(255, 0, 51));
        update_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel19.add(update_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 270, 20));

        edit_profile_image.setBackground(new java.awt.Color(255, 255, 255));
        edit_profile_image.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        edit_profile_image.setForeground(new java.awt.Color(255, 255, 255));
        edit_profile_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_profile_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        edit_profile_image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_profile_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_profile_imageMouseClicked(evt);
            }
        });
        jPanel19.add(edit_profile_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 190));

        text_reg_errors2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_reg_errors2.setForeground(new java.awt.Color(255, 0, 51));
        text_reg_errors2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel19.add(text_reg_errors2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 270, 20));

        edit_nickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_nickname.setForeground(new java.awt.Color(255, 255, 255));
        edit_nickname.setBorder(null);
        edit_nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_nicknameActionPerformed(evt);
            }
        });
        jPanel19.add(edit_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 308, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("_______________________________");
        jPanel19.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Username");
        jPanel19.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        javax.swing.GroupLayout edit_profile_panelLayout = new javax.swing.GroupLayout(edit_profile_panel);
        edit_profile_panel.setLayout(edit_profile_panelLayout);
        edit_profile_panelLayout.setHorizontalGroup(
            edit_profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_profile_panelLayout.createSequentialGroup()
                .addComponent(img_profile_anel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        edit_profile_panelLayout.setVerticalGroup(
            edit_profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_profile_anel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(edit_profile_panelLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(login_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(register_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(admin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(create_chat_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(list_groups_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chat_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(edit_profile_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(register_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(create_chat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(list_groups_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(24, 24, 24)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(chat_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(28, 28, 28)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(edit_profile_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(create_chat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(list_groups_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(52, 52, 52)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(chat_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(29, 29, 29)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(edit_profile_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, 585));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusernameActionPerformed

    private void textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasswordActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        // TODO add your handling code here:
        textpassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        textpassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void signup_profile_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_profile_picMouseClicked
        JFileChooser chooser = new JFileChooser(); //open image file file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type filter
        chooser.setFileFilter(filter); //filter
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if image selected
            File file = chooser.getSelectedFile(); //get selected file
            String strfilepath = file.getAbsolutePath(); //get abs path
//            System.out.println(strfilepath);
            try {
                ImageIcon icon = new ImageIcon(strfilepath); //string image path open as a image icon
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); //resize image icon fit for profile icon label
                signup_profile_pic.setText(null); // remove label text
                signup_profile_pic.setIcon(iconresized); //set seleted image to profile icon label 

//               String img = this.encodeToString(this.ImageIconToBufferedImage(iconresized),"jpg"); 
//               BufferedImage bimg = this.decodeToImage(img);
//               
//               signup_profile_pic.setIcon(new ImageIcon(bimg));
            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_signup_profile_picMouseClicked

    private void textregemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textregemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textregemailActionPerformed

    private void textregpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textregpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textregpasswordActionPerformed

    private void disable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable2MouseClicked
        // TODO add your handling code here:
        textregpassword.setEchoChar((char)0);
        disable2.setVisible(false);
        disable2.setEnabled(false);
        show2.setVisible(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_disable2MouseClicked

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregActionPerformed

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        // TODO add your handling code here:
        textregpassword.setEchoChar((char)8226);
        disable2.setVisible(true);
        disable2.setEnabled(true);
        show2.setVisible(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked

    private void textregnicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textregnicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textregnicknameActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseClicked

    private void textgroupdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textgroupdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textgroupdescriptionActionPerformed

    private void textgroupnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textgroupnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textgroupnameActionPerformed

    private void btn_create_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_create_groupActionPerformed

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel62MouseClicked

    private void btnlogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin4ActionPerformed

    private void activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activeActionPerformed

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseClicked

    private void textgroupdescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textgroupdescription1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textgroupdescription1ActionPerformed

    private void btnlogin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin5ActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        // TODO add your handling code here:
        String user_name = textusername.getText();
        String user_pwd = textpassword.getText();

        ArrayList<String> error = validatelogin(user_name, user_pwd);

        if (error.isEmpty() == false) {
            text_login_errors.setText(error.get(0));
        } else {

            List data = DBManager.getDBM().loginHandler(user_name, user_pwd);
            Iterator i = data.iterator();
            if (i.hasNext()) {
                Users user = (Users) i.next();
                
                String email = user.getEmail();
                String username = user.getUsername();
                String nickname = user.getNickname();
                String password = user.getPassword();
                byte[] profile_image = user.getProfileImage();
                id = user.getId();
                
                edit_email.setText(email);
                edit_username.setText(username);
                edit_nickname.setText(nickname);
                edit_password.setText(password);
                
                
                if(profile_image != null){
                
                ImageIcon imageicon = toImageIcon(profile_image);
                
                ImageIcon iconresized1 = new ImageIcon(imageicon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)); 
                img_profile.setIcon(iconresized1);
                img_profile2.setIcon(iconresized1);
                
                ImageIcon iconresized2 = new ImageIcon(imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)); 
                edit_profile_image.setIcon(iconresized2);
                }
               
                        
                if (user.getUserType().equalsIgnoreCase("admin")) {
                    //admin user
                    
                   text_admin_username.setText("Welcome " + username);
                    
                    login_panel.setVisible(false);
                    admin_panel.setVisible(true);

                } else{
                    //Normal user
                    
                    text_user_username.setText("Welcome " + username);
                    
                    
                    login_panel.setVisible(false);
                    list_groups_panel.setVisible(true);
                    
                }

            } else {
                System.out.println("Username or Password Incorrect");
                text_login_errors.setText("Username or Password Incorrect");
            }

        }
    }//GEN-LAST:event_btnloginMouseClicked

    private void linklogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linklogMouseClicked
        // TODO add your handling code here:
        register_panel.setVisible(false);
        login_panel.setVisible(true);

    }//GEN-LAST:event_linklogMouseClicked

    private void login_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login_panelMouseClicked

    private void linkregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkregMouseClicked
        // TODO add your handling code here:
        login_panel.setVisible(false);
        register_panel.setVisible(true);

    }//GEN-LAST:event_linkregMouseClicked

    private void btnregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregMouseClicked
        // TODO add your handling code here:
        
        //get data from text boxes
        String email = textregemail.getText();
        String username = textregusername.getText();
        String nickname = textregnickname.getText();
        String password = textregpassword.getText();

        //error array
        ArrayList<String> error = validateform(email, username, password);

        if (error.isEmpty() == false) {
            text_reg_errors.setText(error.get(0));
        } else {
            text_reg_errors.setText(null);
            //intsert details
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) signup_profile_pic.getIcon();
            if (avatar != null) {
                try {
                    //                img = this.encodeToString(this.ImageIconToBufferedImage(avatar),"jpg");
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(AppLayout.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (DBManager.getDBM().insert(img, email, username,nickname, password)) {
                text_reg_errors.setText("You Registered Successfully");
            }

        }
    }//GEN-LAST:event_btnregMouseClicked

    private void edit_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_emailActionPerformed

    private void edit_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_passwordActionPerformed

    private void disable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable3MouseClicked
        // TODO add your handling code here:
        edit_password.setEchoChar((char)0);
        disable3.setVisible(false);
        disable3.setEnabled(false);
        show3.setVisible(true);
        show3.setEnabled(true);
    }//GEN-LAST:event_disable3MouseClicked

    private void btnreg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreg1MouseClicked
        // TODO add your handling code here:
        String email = edit_email.getText().trim();
        String username = edit_username.getText().trim();
        String nickname = edit_nickname.getText().trim();
        String password = edit_password.getText().trim();
        
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) edit_profile_image.getIcon();
            if (avatar != null) {
                try {
                 
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(AppLayout.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        
        DBManager.getDBM().update(img, username, nickname,password, id);
        update_msg.setText("Sucessfully Updated..");
        img_profile2.setIcon(avatar);
        
    }//GEN-LAST:event_btnreg1MouseClicked

    private void btnreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreg1ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnreg1ActionPerformed

    private void show3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show3MouseClicked
        // TODO add your handling code here:
        
        edit_password.setEchoChar((char)8226);
        disable3.setVisible(true);
        disable3.setEnabled(true);
        show3.setVisible(false);
        show3.setEnabled(false);
    }//GEN-LAST:event_show3MouseClicked

    private void edit_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_usernameActionPerformed

    private void edit_profile_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_profile_imageMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(); //open image file file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type filter
        chooser.setFileFilter(filter); //filter
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if image selected
            File file = chooser.getSelectedFile(); //get selected file
            String strfilepath = file.getAbsolutePath(); //get abs path
//            System.out.println(strfilepath);
            try {
                ImageIcon icon = new ImageIcon(strfilepath); //string image path open as a image icon
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); //resize image icon fit for profile icon label
                edit_profile_image.setText(null); // remove label text
                edit_profile_image.setIcon(iconresized); //set seleted image to profile icon label 

//               String img = this.encodeToString(this.ImageIconToBufferedImage(iconresized),"jpg"); 
//               BufferedImage bimg = this.decodeToImage(img);
//               
//               signup_profile_pic.setIcon(new ImageIcon(bimg));
            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_edit_profile_imageMouseClicked

    private void edit_profile_link_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_profile_link_1MouseClicked
        // TODO add your handling code here:
        list_groups_panel.setVisible(false);
        edit_profile_panel.setVisible(true);
    }//GEN-LAST:event_edit_profile_link_1MouseClicked

    private void create_groupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_groupMouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        create_chat_panel.setVisible(true);
    }//GEN-LAST:event_create_groupMouseClicked

    private void btn_create_groupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_create_groupMouseClicked
        // TODO add your handling code here:
        
        String name = textgroupname.getText();
        String desc = textgroupdescription.getText();

        if (DBManager.getDBM().create_chat_group(name, desc)) {
            group_create_text.setText("Group created sucessfully");
        } else {
            group_create_text.setText("Group can not create!");
        }
    }//GEN-LAST:event_btn_create_groupMouseClicked

    private void textregusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textregusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textregusernameActionPerformed

    private void edit_nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_nicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_nicknameActionPerformed

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_logout1MouseClicked

    private void list_groups_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_groups_panelMouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_list_groups_panelMouseClicked

    private void chat_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chat_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chat_panelMouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_logout2MouseClicked

    private void logout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout3MouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_logout3MouseClicked

    private void edit_profile_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_profile_panelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_profile_panelMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void img_profile_anelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_profile_anelMouseClicked
        // TODO add your handling code here:
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_img_profile_anelMouseClicked

    private void logout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout4MouseClicked
        app_ui_reset();
        login_panel.setVisible(true);
    }//GEN-LAST:event_logout4MouseClicked

    private void img_profile2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_profile2MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_img_profile2MouseClicked

    private void create_group1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_group1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_group1MouseClicked

    private void create_group2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_group2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_group2MouseClicked

    private void create_group3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_group3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_group3MouseClicked

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
            java.util.logging.Logger.getLogger(AppLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppLayout().setVisible(true);
            }
        });
    }

 
        
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton active;
    private javax.swing.JPanel admin_panel;
    private javax.swing.JButton btn_create_group;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogin4;
    private javax.swing.JButton btnlogin5;
    private javax.swing.JButton btnreg;
    private javax.swing.JButton btnreg1;
    private javax.swing.JPanel chat_panel;
    private javax.swing.JPanel create_chat_panel;
    private javax.swing.JLabel create_group;
    private javax.swing.JLabel create_group1;
    private javax.swing.JLabel create_group2;
    private javax.swing.JLabel create_group3;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel disable2;
    private javax.swing.JLabel disable3;
    private javax.swing.JTextField edit_email;
    private javax.swing.JTextField edit_nickname;
    private javax.swing.JPasswordField edit_password;
    private javax.swing.JLabel edit_profile_image;
    private javax.swing.JLabel edit_profile_link_1;
    private javax.swing.JPanel edit_profile_panel;
    private javax.swing.JTextField edit_username;
    private javax.swing.JLabel group_create_text;
    private javax.swing.JLabel img_profile;
    private javax.swing.JLabel img_profile2;
    private javax.swing.JPanel img_profile_anel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel linklog;
    private javax.swing.JLabel linkreg;
    private javax.swing.JPanel list_groups_panel;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel logout3;
    private javax.swing.JLabel logout4;
    private javax.swing.JPanel register_panel;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show2;
    private javax.swing.JLabel show3;
    private javax.swing.JLabel signup_profile_pic;
    private javax.swing.JLabel text_admin_username;
    private javax.swing.JLabel text_login_errors;
    private javax.swing.JLabel text_reg_errors;
    private javax.swing.JLabel text_reg_errors2;
    private javax.swing.JLabel text_user_username;
    private javax.swing.JLabel text_user_username2;
    private javax.swing.JTextField textgroupdescription;
    private javax.swing.JTextField textgroupdescription1;
    private javax.swing.JTextField textgroupname;
    private javax.swing.JPasswordField textpassword;
    private javax.swing.JTextField textregemail;
    private javax.swing.JTextField textregnickname;
    private javax.swing.JPasswordField textregpassword;
    private javax.swing.JTextField textregusername;
    private javax.swing.JTextField textusername;
    private javax.swing.JLabel update_msg;
    // End of variables declaration//GEN-END:variables
}

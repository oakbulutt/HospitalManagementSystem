package com.hms.view;

import com.hms.service.HMSService;
import com.hms.view.admin.HMSAdminMainView;
import com.hms.view.doctor.HMSDoctorMainView;
import com.hms.view.receptionist.HMSReceptionistMainView;

public class Login extends javax.swing.JFrame {

    HMSService service = new HMSService();

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginUsernameLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        loginUsernameTextField = new javax.swing.JTextField();
        loginLoginButton = new javax.swing.JButton();
        loginCancelButton = new javax.swing.JButton();
        loginMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMS");

        loginUsernameLabel.setText("Username:");

        loginPasswordLabel.setText("Password:");

        loginPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPasswordFieldMouseClicked(evt);
            }
        });

        loginLoginButton.setText("Login");
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });

        loginCancelButton.setText("Cancel");
        loginCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(loginCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginUsernameTextField)
                    .addComponent(loginPasswordField))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(loginMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLoginButton)
                    .addComponent(loginCancelButton))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_loginCancelButtonActionPerformed

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed
        loginMessageLabel.setText("");
        String userId = loginUsernameTextField.getText();
        String password = new String(loginPasswordField.getPassword());
        char usernameFirstLetter = userId.charAt(0);

        boolean loggedIn = service.login(userId, password);
        if (loggedIn && usernameFirstLetter == 'A') {
            HMSAdminMainView adminMainScreen = new HMSAdminMainView();
            setVisible(false);
            adminMainScreen.setVisible(true);

        } else if (loggedIn && usernameFirstLetter == 'D') {
            HMSDoctorMainView doctorMainScreen = new HMSDoctorMainView();
            setVisible(false);
            doctorMainScreen.setVisible(true);

        } else if (loggedIn && usernameFirstLetter == 'R') {
            HMSReceptionistMainView receptionistMainScreen = new HMSReceptionistMainView();
            setVisible(false);
            receptionistMainScreen.setVisible(true);

        } else {
            loginMessageLabel.setText("Username or Password is wrong!");
        }
    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPasswordFieldMouseClicked
        loginPasswordField.setText("");
    }//GEN-LAST:event_loginPasswordFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginCancelButton;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JLabel loginMessageLabel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JLabel loginUsernameLabel;
    private javax.swing.JTextField loginUsernameTextField;
    // End of variables declaration//GEN-END:variables

}

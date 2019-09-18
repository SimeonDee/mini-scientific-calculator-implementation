
package java2018_8;
/**********************************************************************
 * Author:      ADEYEMI ADEDOYIN SIMEON
 * Matric:      209188
 * Level:       700 (MSc, Computer Science), Univ. of Ibadan, Nigeria
 * Course:      Advanced Programming Techniques (Java)
 * ***********************************************************************/
public class MyMainForm extends javax.swing.JFrame {
    
    int temp, newValue, action;
    CalcEngine MyCalculator = new CalcEngine();
    public MyMainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Output = new javax.swing.JLabel();
        Eight = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Power = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Backspace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doyin - 209188");
        setBackground(new java.awt.Color(0, 102, 102));

        Output.setBackground(new java.awt.Color(255, 255, 255));
        Output.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Output.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Multiply.setText("*");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Power.setText("X^y");
        Power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerActionPerformed(evt);
            }
        });

        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Backspace.setText("Bksp");
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Backspace))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Power, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        Output.setText(Output.getText() + Zero.getText());
    }//GEN-LAST:event_ZeroActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        Output.setText(Output.getText() + One.getText());
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        Output.setText(Output.getText() + Two.getText());
    }//GEN-LAST:event_TwoActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        Output.setText(Output.getText() + Three.getText());
    }//GEN-LAST:event_ThreeActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        Output.setText(Output.getText() + Four.getText());
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        Output.setText(Output.getText() + Five.getText());
    }//GEN-LAST:event_FiveActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        Output.setText(Output.getText() + Six.getText());
    }//GEN-LAST:event_SixActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        Output.setText(Output.getText() + Seven.getText());
    }//GEN-LAST:event_SevenActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        Output.setText(Output.getText() + Eight.getText());
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        Output.setText(Output.getText() + Nine.getText());
    }//GEN-LAST:event_NineActionPerformed

    private void clearScreen(){
        Output.setText("");    
    }
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        clearScreen();
    }//GEN-LAST:event_ClearActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        action = 1;
        temp = Integer.parseInt(Output.getText());
        MyCalculator.setX(temp);
        clearScreen();
    }//GEN-LAST:event_PlusActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        action = 2;
        temp = Integer.parseInt(Output.getText());
        MyCalculator.setX(temp);
        clearScreen();
    }//GEN-LAST:event_MinusActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        action = 3;
        temp = Integer.parseInt(Output.getText());
        MyCalculator.setX(temp);
        clearScreen();
    }//GEN-LAST:event_MultiplyActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        action = 4;
        temp = Integer.parseInt(Output.getText());
        MyCalculator.setX(temp);
        clearScreen();
    }//GEN-LAST:event_DivideActionPerformed

    private void PowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerActionPerformed
        action = 5;
        temp = Integer.parseInt(Output.getText());
        MyCalculator.setX(temp);
        clearScreen();
    }//GEN-LAST:event_PowerActionPerformed

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceActionPerformed
        String strOutput = Output.getText();
        if(strOutput.length() >= 1){
            Output.setText(strOutput.substring(0, strOutput.length() - 1));
        }
        
    }//GEN-LAST:event_BackspaceActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        newValue = Integer.parseInt(Output.getText());
        MyCalculator.setY(newValue);
        
        switch(action){
            case 1: 
                Output.setText(String.valueOf(MyCalculator.Addition()));
                break;
            case 2:
                Output.setText(String.valueOf(MyCalculator.Substraction()));
                break;
            case 3:
                Output.setText(String.valueOf(MyCalculator.Multiplication()));
                break;
            case 4:
                Output.setText(String.valueOf(MyCalculator.Division()));
                break;
            case 5:
                Output.setText(String.valueOf(MyCalculator.power()));
        }
    }//GEN-LAST:event_EqualsActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backspace;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JLabel Output;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Power;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    // End of variables declaration//GEN-END:variables
}

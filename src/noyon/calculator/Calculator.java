package noyon.calculator;
import java.math.*;

public class Calculator extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    
    private boolean dgrrad;
    private boolean sh;
    
    private byte op;
    
    private double ina;
    private double inb;
    private double out;
    
    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        display2 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        memoryRead = new javax.swing.JButton();
        memoryClear = new javax.swing.JButton();
        displayMemory = new javax.swing.JTextField();
        pi = new javax.swing.JButton();
        shift = new javax.swing.JButton();
        onebyx = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        square = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        two = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        six = new javax.swing.JButton();
        squroot = new javax.swing.JButton();
        multiplay = new javax.swing.JButton();
        squre3 = new javax.swing.JButton();
        devide = new javax.swing.JButton();
        squroot3 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        memorySave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Noyon Calculator");
        setResizable(false);

        display2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        display2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        display2.setFocusable(false);
        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });

        display1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        display1.setText("0");
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        display1.setFocusable(false);

        memoryRead.setText("MR");
        memoryRead.setToolTipText("Read");
        memoryRead.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryRead.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        memoryRead.setFocusable(false);
        memoryRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryReadActionPerformed(evt);
            }
        });

        memoryClear.setText("MC");
        memoryClear.setToolTipText("Clean");
        memoryClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryClear.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        memoryClear.setFocusable(false);
        memoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryClearActionPerformed(evt);
            }
        });

        displayMemory.setBackground(new java.awt.Color(216, 224, 227));
        displayMemory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        displayMemory.setText("0");
        displayMemory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        displayMemory.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        displayMemory.setFocusable(false);

        pi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pi.setText("π");
        pi.setToolTipText("Pi");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pi.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pi.setFocusable(false);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        shift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shift.setText("Sh");
        shift.setToolTipText("Shift");
        shift.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shift.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shift.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        shift.setFocusable(false);
        shift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftMouseClicked(evt);
            }
        });

        onebyx.setText("1/x");
        onebyx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onebyx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onebyx.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        onebyx.setFocusable(false);
        onebyx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onebyxActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mod.setText("%");
        mod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mod.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        mod.setFocusable(false);
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        sin.setText("Sin");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sin.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setText("Cos");
        cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setText("Tan");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tan.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        square.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        square.setText("x²");
        square.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        square.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        square.setFocusable(false);
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plus.setText("+");
        plus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        plus.setFocusable(false);
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minus.setText("-");
        minus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        minus.setFocusable(false);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        point.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        point.setText(".");
        point.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        point.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        point.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        point.setFocusable(false);
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        plusMinus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plusMinus.setText("±");
        plusMinus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusMinus.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        plusMinus.setFocusable(false);
        plusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        equal.setText("=");
        equal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        equal.setFocusable(false);
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        squroot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        squroot.setText("√x");
        squroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squroot.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        squroot.setFocusable(false);
        squroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squrootActionPerformed(evt);
            }
        });

        multiplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        multiplay.setText("*");
        multiplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplay.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        multiplay.setFocusable(false);
        multiplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayActionPerformed(evt);
            }
        });

        squre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        squre3.setText("x3");
        squre3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squre3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squre3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        squre3.setFocusable(false);
        squre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squre3ActionPerformed(evt);
            }
        });

        devide.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        devide.setText("/");
        devide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devide.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        devide.setFocusable(false);
        devide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideActionPerformed(evt);
            }
        });

        squroot3.setText("3√x");
        squroot3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squroot3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squroot3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        squroot3.setFocusable(false);
        squroot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squroot3ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setText("C");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("CE");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        buttonGroup1.add(degrees);
        degrees.setSelected(true);
        degrees.setText("Degrees");
        degrees.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        degrees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        degrees.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        degrees.setFocusable(false);
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        buttonGroup1.add(radians);
        radians.setText("Radians");
        radians.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        radians.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radians.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        radians.setFocusable(false);
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });

        memorySave.setText("MS");
        memorySave.setToolTipText("Save");
        memorySave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memorySave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memorySave.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        memorySave.setFocusable(false);
        memorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorySaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display2)
                    .addComponent(display1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(memoryRead, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(memorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(degrees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radians)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onebyx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(squroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(squre3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multiplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(squroot3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(devide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cos, sin, tan});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryRead)
                    .addComponent(memoryClear)
                    .addComponent(displayMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorySave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pi)
                    .addComponent(shift)
                    .addComponent(degrees)
                    .addComponent(radians))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onebyx)
                    .addComponent(mod)
                    .addComponent(sin)
                    .addComponent(cos)
                    .addComponent(tan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squroot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(squre3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squroot3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {display1, display2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cos, sin, tan});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
        
    }//GEN-LAST:event_display2ActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "0");
        
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "1");
        zerodisp = true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "2");
        zerodisp = true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "3");
        zerodisp = true;
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "4");
        zerodisp = true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "5");
        zerodisp = true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "6");
        zerodisp = true;
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "7");
        zerodisp = true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "8");
        zerodisp = true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "9");
        zerodisp = true;
    }//GEN-LAST:event_nineActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if(!decdisp){
            display1.setText(display1.getText() + ".");
            decdisp = true;
        }
    }//GEN-LAST:event_pointActionPerformed

    private void plusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusActionPerformed
        ina = Double.parseDouble(String.valueOf(display1.getText()));
        out = ina * -1;
        
        if(out > -1000000000 && out < 1000000000){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        decdisp = true;
        out  = 0;
    }//GEN-LAST:event_plusMinusActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_clearActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display1.setText("0");
        display2.setText("");
        //display1.setText(null);
        decdisp = false;
        zerodisp = false;
        
        ina = 0;
        inb = 0;
        out = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void memoryReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryReadActionPerformed
        display1.setText(String.valueOf(displayMemory.getText()));
    }//GEN-LAST:event_memoryReadActionPerformed

    private void memoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryClearActionPerformed
        displayMemory.setText("0");
    }//GEN-LAST:event_memoryClearActionPerformed

    private void memorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorySaveActionPerformed
        displayMemory.setText(String.valueOf(display1.getText()));
    }//GEN-LAST:event_memorySaveActionPerformed

    private void onebyxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onebyxActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = 1/inb;
        if(out > -1000000000 && out < 1000000000){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        display2.setText("1/" + String.valueOf(inb));
        out  = 0;
        op = 0;
    }//GEN-LAST:event_onebyxActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display1.setText(String.valueOf(Math.PI)); 
    }//GEN-LAST:event_piActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * inb;
        if(out > -10000000000000l && out < 100000000000000l){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        display2.setText(String.valueOf(inb) + "²");
        out  = 0;
        op = 0;
    }//GEN-LAST:event_squareActionPerformed

    private void squrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squrootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = Math.sqrt(inb);
        if(out > -100000000000000l && out < 100000000000000l){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        display2.setText("√"+String.valueOf(inb));
        out  = 0;
        op = 0;
    }//GEN-LAST:event_squrootActionPerformed

    private void squre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squre3ActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * inb * inb;
        if(out > -1000000000 && out < 1000000000){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        display2.setText(String.valueOf(inb) + "^3");
        out  = 0;
        op = 0;
    }//GEN-LAST:event_squre3ActionPerformed

    private void squroot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squroot3ActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = Math.cbrt(inb);
        if(out > -1000000000 && out < 1000000000){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        display2.setText("3√"+String.valueOf(inb));
        out  = 0;
        op = 0;
    }//GEN-LAST:event_squroot3ActionPerformed

    private void shiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseClicked
        if(!sh){
            sh = true;
        }else{
            sh = false;
        }
    }//GEN-LAST:event_shiftMouseClicked

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("sin("+String.valueOf(inb) + ")" );
                inb = inb * 0.0174532925;
            }
            out = Math.sin(inb);
        }else{
            display2.setText("sinh("+String.valueOf(inb) + ")" );
            out = Math.sinh(inb);
        }
        display1.setText(String.valueOf(out));
        out = 0;
        op = 0;
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("cos("+String.valueOf(inb) + ")" );
                inb = inb * 0.0174532925;
            }
            out = Math.cos(inb);
        }else{
            display2.setText("cosh("+String.valueOf(inb) + ")" );
            out = Math.cosh(inb);
        }
        display1.setText(String.valueOf(out));
        out = 0;
        op = 0;
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("tan("+String.valueOf(inb) + ")" );
                inb = inb * 0.0174532925;
            }
            out = Math.tan(inb);
        }else{
            display2.setText("tanh("+String.valueOf(inb) + ")" );
            out = Math.tanh(inb);
        }
        display1.setText(String.valueOf(out));
        out = 0;
        op = 0;
    }//GEN-LAST:event_tanActionPerformed

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        dgrrad = false;
    }//GEN-LAST:event_degreesActionPerformed

    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansActionPerformed
        dgrrad  = true;
    }//GEN-LAST:event_radiansActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        if(op == 2){
            ina = ina - inb;
        }
        if(op == 3){
            ina = ina * inb;
        }
        if(op == 4){
            ina = ina / inb;
        }
        if(op == 5){
            ina = ina * inb /100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ " + ");
        
        op = 1;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        if(op == 2){
            ina = ina - inb;
        }
        if(op == 3){
            ina = ina * inb;
        }
        if(op == 4){
            ina = ina / inb;
        }
        if(op == 5){
            ina = ina * inb /100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ " - ");
        
        op = 2;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_minusActionPerformed

    private void multiplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        if(op == 2){
            ina = ina - inb;
        }
        if(op == 3){
            ina = ina * inb;
        }
        if(op == 4){
            ina = ina / inb;
        }
        if(op == 5){
            ina = ina * inb /100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ " * ");
        
        op = 3;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_multiplayActionPerformed

    private void devideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        if(op == 2){
            ina = ina - inb;
        }
        if(op == 3){
            ina = ina * inb;
        }
        if(op == 4){
            ina = ina / inb;
        }
        if(op == 5){
            ina = ina * inb /100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ " / ");
        
        op = 4;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_devideActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        ina = Double.parseDouble(String.valueOf(display1.getText()));
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ "%(");
        
        decdisp = false;
        zerodisp = false;
        op = 5;
    }//GEN-LAST:event_modActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        
        if(op == 0){
            out = inb;
            display2.setText(String.valueOf(inb));
        }
        
        if(op == 1){
            out = ina + inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 2){
            out = ina - inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 3){
            out = ina * inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 4){
            out = ina / inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 5){
            out = ina * inb /100;
            display2.setText(display2.getText() + String.valueOf(inb) + ")");
        }
        
        if(out > -1000000000 && out < 1000000000){
            display1.setText(String.valueOf(out));
        }else{
            display1.setText("Error");
        }
        ina = 0; 
        inb = 0;
        out = 0;
        op =0;
        zerodisp = false;
        decdisp = false;
    }//GEN-LAST:event_equalActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JButton devide;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JTextField displayMemory;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton memoryClear;
    private javax.swing.JButton memoryRead;
    private javax.swing.JButton memorySave;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiplay;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onebyx;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusMinus;
    private javax.swing.JButton point;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton shift;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton squre3;
    private javax.swing.JButton squroot;
    private javax.swing.JButton squroot3;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

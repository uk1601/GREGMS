/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Business;
import Business.EnergyProvider.EnergyData;
import Business.EnergyProvider.EnergyProducer;
import Business.GovtAgency.GovernmentAgencyData;
import Business.GovtAgency.Policy;
import Business.GridOperator.ConsumerTransaction;
import Business.Profiles.GridOperator.GridOperatorProfile;
import Business.Users.UserAccount;
import Business.Utils.ChartUtils;
import Business.Utils.ForecastingUtil;
import Business.Utils.Recomendations;
import Business.Utils.TableExporter;
import Business.Utils.Transaction;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Map;
import org.jfree.chart.JFreeChart;



/**
 *
 * @author udayk
 */
public class ResearchOrganisationDBJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOJPanel
     */
    Business business;
    
    JPanel cardLayout;
    
    UserAccount user;
    
    JPanel containerPanel = new JPanel();
    UUID currentlyEditingId;
    
    private Image originalImage1;
    private Image originalImage2;
    private Image originalImage3;
    private Image originalImage;
    
    public ResearchOrganisationDBJPanel(JPanel cardLayout, Business business, UserAccount user) throws IOException {
        initComponents();
        this.cardLayout = cardLayout;
        this.business = business;
        this.user = user;
        GOp.setText(user.getRole());
        GridOperatorName.setText(user.getAssociatedPersonProfile().getPerson().getName());
         populatePolicyTable();
         populateProcuredTable();
         populateConsumedTable();
         populateRecomendation();
        // Add a component listener to resize the image when the JLabel is resized
        try {
            URL imageURL1 = getClass().getResource("/images/IEO.png");
            URL imageURL2 = getClass().getResource("/images/NGO.png");
            URL imageURL3 = getClass().getResource("/images/Research.png");
            if (imageURL1 != null && imageURL2 != null && imageURL3 != null) {
                originalImage1 = ImageIO.read(imageURL1);
                originalImage2 = ImageIO.read(imageURL2);
                originalImage3 = ImageIO.read(imageURL3);
            } else {
                System.err.println("Image not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add a component listener to resize the image when the JLabel is resized
        img1.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                resizeImage();
            }
        });                
    }

    
    private void resizeImage() {
        switch (user.getRole()){
        
            case "NGO":
                if (originalImage2 != null) {
                // Resize the image to the current size of the JLabel
                Image resizedImage2 = originalImage2.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);

                // Update the icon of the JLabel
                ImageIcon icon2 = new ImageIcon(resizedImage2);
                img1.setIcon(icon2);
                break;
            }
                
            case "INTERNATIONAL ENERGY ORGANISATION":
                if (originalImage1 != null) {
                // Resize the image to the current size of the JLabel
                Image resizedImage1 = originalImage1.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);

                // Update the icon of the JLabel
                ImageIcon icon1 = new ImageIcon(resizedImage1);
                img1.setIcon(icon1);
                break;
            }
                
                
            case "Research Analyst":
                if (originalImage3 != null) {
                // Resize the image to the current size of the JLabel
                Image resizedImage3 = originalImage3.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);

                // Update the icon of the JLabel
                ImageIcon icon3 = new ImageIcon(resizedImage3);
                img1.setIcon(icon3);
                break;
            }
                
            
        }
        
    }
 


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        TopPane = new javax.swing.JPanel();
        GOp = new javax.swing.JLabel();
        GridOperatorName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Reports = new javax.swing.JPanel();
        ReportsTabbedPane1 = new javax.swing.JTabbedPane();
        ProductionReport1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btnExport4 = new javax.swing.JButton();
        ConsumptionReport1 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        btnExport6 = new javax.swing.JButton();
        Forecast1 = new javax.swing.JPanel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        Graphs1 = new javax.swing.JPanel();
        Graph2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Recommendation = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        Recommendation1 = new javax.swing.JPanel();
        btnSubmit2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PolicyManagement = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        btnExport5 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Help = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        img1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(1000, 600));

        TopPane.setBackground(new java.awt.Color(255, 255, 255));

        GOp.setBackground(new java.awt.Color(255, 255, 255));
        GOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        GridOperatorName.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        GridOperatorName.setText("Name");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("logout");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Settings");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPaneLayout = new javax.swing.GroupLayout(TopPane);
        TopPane.setLayout(TopPaneLayout);
        TopPaneLayout.setHorizontalGroup(
            TopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GridOperatorName, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(GOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 599, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
        );
        TopPaneLayout.setVerticalGroup(
            TopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GOp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GridOperatorName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(TopPane);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        Reports.setBackground(new java.awt.Color(255, 255, 255));

        ReportsTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        ReportsTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        ProductionReport1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Source of Energy", "Quantity Procured"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        btnExport4.setBackground(new java.awt.Color(0, 0, 0));
        btnExport4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExport4.setForeground(new java.awt.Color(255, 255, 255));
        btnExport4.setText("Export");

        javax.swing.GroupLayout ProductionReport1Layout = new javax.swing.GroupLayout(ProductionReport1);
        ProductionReport1.setLayout(ProductionReport1Layout);
        ProductionReport1Layout.setHorizontalGroup(
            ProductionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductionReport1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExport4)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        ProductionReport1Layout.setVerticalGroup(
            ProductionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductionReport1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport4)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        ReportsTabbedPane1.addTab("Production", ProductionReport1);

        ConsumptionReport1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane14.setBackground(new java.awt.Color(255, 255, 255));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Consumers", "Energy Consumption"
            }
        ));
        jScrollPane14.setViewportView(jTable11);

        btnExport6.setBackground(new java.awt.Color(0, 0, 0));
        btnExport6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExport6.setForeground(new java.awt.Color(255, 255, 255));
        btnExport6.setText("Export");
        btnExport6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExport6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsumptionReport1Layout = new javax.swing.GroupLayout(ConsumptionReport1);
        ConsumptionReport1.setLayout(ConsumptionReport1Layout);
        ConsumptionReport1Layout.setHorizontalGroup(
            ConsumptionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsumptionReport1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsumptionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExport6)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        ConsumptionReport1Layout.setVerticalGroup(
            ConsumptionReport1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsumptionReport1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport6)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        ReportsTabbedPane1.addTab("Consumption", ConsumptionReport1);

        Forecast1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setText("From Date");

        jLabel23.setText("To Date");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Forecast");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Forecasted Production"
            }
        ));
        jScrollPane9.setViewportView(jTable12);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("View as Graphs");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel24.setText("Production Forecast");

        jLabel25.setText("Consumption Forecast");

        jScrollPane15.setBackground(new java.awt.Color(255, 255, 255));

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Forecasted Consumption"
            }
        ));
        jScrollPane15.setViewportView(jTable13);

        javax.swing.GroupLayout Forecast1Layout = new javax.swing.GroupLayout(Forecast1);
        Forecast1.setLayout(Forecast1Layout);
        Forecast1Layout.setHorizontalGroup(
            Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forecast1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forecast1Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Forecast1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addGroup(Forecast1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        Forecast1Layout.setVerticalGroup(
            Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forecast1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Forecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        ReportsTabbedPane1.addTab("ForeCast", Forecast1);

        Graphs1.setBackground(new java.awt.Color(255, 255, 255));

        Graph2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        Graph2.addTab("Graphs1", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        Graph2.addTab("Graphs2", jPanel5);

        javax.swing.GroupLayout Graphs1Layout = new javax.swing.GroupLayout(Graphs1);
        Graphs1.setLayout(Graphs1Layout);
        Graphs1Layout.setHorizontalGroup(
            Graphs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Graph2)
        );
        Graphs1Layout.setVerticalGroup(
            Graphs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Graph2)
        );

        ReportsTabbedPane1.addTab("Graphs", Graphs1);

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ReportsTabbedPane1))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ReportsTabbedPane1))
        );

        jTabbedPane1.addTab("Reports", Reports);

        Recommendation.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        Recommendation1.setBackground(new java.awt.Color(255, 255, 255));

        btnSubmit2.setText("Submit");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Title");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout Recommendation1Layout = new javax.swing.GroupLayout(Recommendation1);
        Recommendation1.setLayout(Recommendation1Layout);
        Recommendation1Layout.setHorizontalGroup(
            Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Recommendation1Layout.createSequentialGroup()
                .addGroup(Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Recommendation1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Recommendation1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnSubmit2)))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        Recommendation1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        Recommendation1Layout.setVerticalGroup(
            Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Recommendation1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Recommendation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit2)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        Recommendation1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jTextField1});

        jTabbedPane3.addTab("Add ", Recommendation1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title", "Description"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane3.addTab("View", jPanel1);

        javax.swing.GroupLayout RecommendationLayout = new javax.swing.GroupLayout(Recommendation);
        Recommendation.setLayout(RecommendationLayout);
        RecommendationLayout.setHorizontalGroup(
            RecommendationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        RecommendationLayout.setVerticalGroup(
            RecommendationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Recommendation", Recommendation);

        PolicyManagement.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane10.setBackground(new java.awt.Color(192, 221, 250));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Policy ID", "Policy Name", "Effective Date", "End Date", "Status"
            }
        ));
        jScrollPane10.setViewportView(jTable6);

        btnExport5.setText("Export");
        btnExport5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExport5ActionPerformed(evt);
            }
        });

        btnUpdate1.setText("View");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnExport5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate1)
                        .addGap(78, 78, 78))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate1)
                    .addComponent(btnExport5))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Policy Name");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Effective Date");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("End Date");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane12.setViewportView(jTextArea2);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Description");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Status");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(361, 361, 361))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Detailed View", jPanel9);

        javax.swing.GroupLayout PolicyManagementLayout = new javax.swing.GroupLayout(PolicyManagement);
        PolicyManagement.setLayout(PolicyManagementLayout);
        PolicyManagementLayout.setHorizontalGroup(
            PolicyManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolicyManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        PolicyManagementLayout.setVerticalGroup(
            PolicyManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolicyManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Polices", PolicyManagement);

        Help.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Issue raised By ");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane8.setViewportView(txtDescription);

        jLabel11.setText("Description of Issue");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8)
                            .addComponent(jTextField6)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Submit Issue", jPanel8);

        javax.swing.GroupLayout HelpLayout = new javax.swing.GroupLayout(Help);
        Help.setLayout(HelpLayout);
        HelpLayout.setHorizontalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Help", Help);

        jSplitPane1.setRightComponent(jTabbedPane1);

        img1.setPreferredSize(new java.awt.Dimension(173, 437));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String raised = jTextField6.getText();
        String Des = txtDescription.getText();

        business.getTpd().add(Des, raised);
        JOptionPane.showMessageDialog(this, "Issue reported succusfully");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:jTable5
        TableExporter.exportToCSV(jTable5, this);
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnExport6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExport6ActionPerformed
        TableExporter.exportToCSV(jTable11, this);
    }//GEN-LAST:event_btnExport6ActionPerformed

    private void btnExport5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExport5ActionPerformed
        TableExporter.exportToCSV(jTable5, this);
    }//GEN-LAST:event_btnExport5ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        int selectedRow = jTable5.getSelectedRow();

        if (selectedRow >= 0) {
            // Assuming policy details are in the following order:
            // Policy ID, Policy Name, Effective Date, End Date, Status, Description
            Policy policy = (Policy) jTable5.getModel().getValueAt(selectedRow, 0);

            // Populate the update form fields
            jTextField2.setText(policy.getPolicyName());
            LocalDate localDate = policy.getEffectiveDate();
            Instant instant = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
            Date date = Date.from(instant);

            jDateChooser7.setDate(date);

            LocalDate localDate1 = policy.getEndDate();
            Instant instant1 = localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant();
            Date date1 = Date.from(instant1);
            jDateChooser8.setDate(date1);
            jTextArea2.setText(policy.getDescription());

            

            
            jTabbedPane2.setSelectedIndex(1); // Replace UPDATE_TAB_INDEX with actual index of update tab
        } else {
            JOptionPane.showMessageDialog(null, "Please select a policy to view.");
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JOptionPane optionPane = new JOptionPane(containerPanel, JOptionPane.PLAIN_MESSAGE);
    JDialog dialog = optionPane.createDialog("Forecasting Charts");
    dialog.setSize(950, 650); // Set dialog size
    dialog.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cardLayout.remove(this);
        CardLayout layout = (CardLayout) cardLayout.getLayout();
        layout.previous(cardLayout);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        String title = jTextField1.getText();
        String area = jTextArea1.getText();
        
        business.getGac().getRc().addNewR(user.getRole(), title, area);
        populateRecomendation();
        business.getGac().getNc().addNotification(title + "\n"+ area);
        JOptionPane.showMessageDialog(this, "Submitted Recomendation");
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        AccInfoUpdateJPanel accCreationPanel = new AccInfoUpdateJPanel(cardLayout, business, user);
        cardLayout.add("AccInfoUpdateJPanel", accCreationPanel);
        CardLayout layout = (CardLayout) cardLayout.getLayout();
        layout.next(cardLayout);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        List<EnergyData> historicalData = new ArrayList<>();
       for(EnergyProducer ep : business.getEnergyProducers().getAllProducers()){
           for(EnergyData ed : ep.getEdc().getEnergyDataList()){
            historicalData.add(ed);
           }
       }
        System.out.println("frocast "+historicalData.size());
        
        // Forecast future production based on the average
        LocalDate startDate = jDateChooser9.getDate().toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate(); // get start date from "From Date" date chooser

        LocalDate endDate = jDateChooser10.getDate().toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();// get end date from "To Date" date chooser
        
        List<EnergyData> forecastedData = ForecastingUtil.forecastProduction(historicalData, startDate, endDate, null, "defaultLocation", "defaultSource");
        ChartPanel chartPanel2 = ChartUtils.createLineChartPanel(forecastedData);
        
        Map<LocalDate, Double> m  = ForecastingUtil.forecastAllConsumerDemand(business.getGridData().getCt(), startDate, endDate);
        JFreeChart chart = ChartUtils.createLineChart(m);

// Create a panel to display the chart
        ChartPanel chartPanel1 = new ChartPanel(chart);
        // Assuming 'this' is a JPanel, you add the chartPanel to it
        containerPanel.removeAll();
    
    // Set the layout
        // Set preferred sizes for both chart panels
    Dimension chartSize = new Dimension(500, 400); // Set your desired size
    chartPanel1.setPreferredSize(chartSize);
    chartPanel2.setPreferredSize(chartSize);

    // Create a container panel

    // Set the layout to GridLayout for equal sizing
    containerPanel.setLayout(new GridLayout(1, 2)); // 1 row, 2 columns

    // Add both chart panels to the container
    containerPanel.add(chartPanel1);
    containerPanel.add(chartPanel2);

    // Display the container panel in a JOptionPane
    
        populateForecastTable(forecastedData);
        populateForecastTable(m);
    }//GEN-LAST:event_jButton8ActionPerformed

     private void populateForecastTable(List<EnergyData> forecastedData) {
        DefaultTableModel model = (DefaultTableModel) jTable12.getModel(); // Replace jTableForecast with your actual table name
        model.setRowCount(0); // Clear existing data

        for (EnergyData data : forecastedData) {
           Object[] row = new Object[3]; 
            row[0] = data.getTimestamp().toLocalDate(); 
            row[1] = data.getEnergyOutput();
            model.addRow(row);
        }
    }
        
            private void populateForecastTable(Map<LocalDate, Double> m) {
        DefaultTableModel model = (DefaultTableModel) jTable13.getModel();
        model.setRowCount(0); // Clear existing data

        for (Map.Entry<LocalDate, Double> entry : m.entrySet()) {
            LocalDate date = entry.getKey();
            Double value = entry.getValue();
            Object[] row = new Object[2];
                row[0] = date;
                row[1] = value;
            model.addRow(row);
        }
        
    }
    public void populateRecomendation(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the existing rows


            List<Recomendations> r = business.getGac().getRc().getRs();

            // Iterate over the transactions and add them to the table model
            for (Recomendations a : r) {
                Object[] row = new Object[2]; // Adjust the size based on the number of columns in your table
                if(user.getRole().equals(a.getFrom())){
                    row[0] = a.getTitle();
                    row[1] = a.getDescription();

                    model.addRow(row);
                }
            }
    
    }
    
    public void populateProcuredTable() {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0); // Clear the existing rows


            List<Transaction> transactions = business.getGridData().getTc().getAllTransactions();

            // Iterate over the transactions and add them to the table model
            for (Transaction transaction : transactions) {
                Object[] row = new Object[2]; // Adjust the size based on the number of columns in your table
                row[0] = transaction.getEnergySource();
                row[1] = transaction.getAmountSold();

                model.addRow(row);
            }

        jTable5.setModel(model);
        ChartPanel chartPanel = ChartUtils.createEnergySourcePieChart(business.getEnergyProducers());

        // Assuming 'this' is a JPanel, you add the chartPanel to it
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(chartPanel, BorderLayout.CENTER);

        // Revalidate and repaint to ensure the chart is displayed
        jPanel4.revalidate();
        jPanel4.repaint();
    }
    
    public void populateConsumedTable() {
        DefaultTableModel model = (DefaultTableModel) jTable11.getModel();
        model.setRowCount(0); // Clear the existing rows


            List<ConsumerTransaction> transactions = business.getGridData().getCt();

            // Iterate over the transactions and add them to the table model
            for (ConsumerTransaction transaction : transactions) {
                Object[] row = new Object[2]; // Adjust the size based on the number of columns in your table
                row[0] = transaction.getConsumerId();
                row[1] = transaction.getQuantityOfEnergy();

                model.addRow(row);
            }

        jTable11.setModel(model);
        ChartPanel chartPanel = ChartUtils.createEnergySourceChart(business.getGridData().getTc().getAllTransactions());

        // Assuming 'this' is a JPanel, you add the chartPanel to it
        jPanel6.setLayout(new BorderLayout());
        jPanel6.add(chartPanel, BorderLayout.CENTER);

        // Revalidate and repaint to ensure the chart is displayed
        jPanel6.revalidate();
        jPanel6.repaint();
    }
    
    private void populatePolicyTable() {
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();

        // Clear existing data
        model.setRowCount(0);

        GovernmentAgencyData agencyData = business.getGac();
        List<Policy> policies = agencyData.getPolicyCatalog().getAllPolicies();

        // Loop through the list and add rows to the table
        for (Policy policy : policies) {
            Object[] row = new Object[5]; // Adjust the size based on the number of columns in your table
            row[0] = policy;
            row[1] = policy.getPolicyName();
            row[2] = policy.getEffectiveDate(); // Convert to string if necessary
            row[3] = policy.getEndDate(); // Convert to string if necessary
            row[4] = policy.getStatus();

            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConsumptionReport1;
    private javax.swing.JPanel Forecast1;
    private javax.swing.JLabel GOp;
    private javax.swing.JTabbedPane Graph2;
    private javax.swing.JPanel Graphs1;
    private javax.swing.JLabel GridOperatorName;
    private javax.swing.JPanel Help;
    private javax.swing.JPanel PolicyManagement;
    private javax.swing.JPanel ProductionReport1;
    private javax.swing.JPanel Recommendation;
    private javax.swing.JPanel Recommendation1;
    private javax.swing.JPanel Reports;
    private javax.swing.JTabbedPane ReportsTabbedPane1;
    private javax.swing.JPanel TopPane;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExport4;
    private javax.swing.JButton btnExport5;
    private javax.swing.JButton btnExport6;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}

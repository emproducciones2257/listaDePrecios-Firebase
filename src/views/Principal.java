package views;

import java.awt.Color;

import conexionBD.DBDtos;
import conexionBD.coneCone;
import control.controlBtnPrincipal;
import modelo.dtosNecesarios;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Principal extends javax.swing.JFrame {

    public Principal() {
    	
        initComponents();
        
        try {
			coneCone.connect();
			refrescarDatos();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    public static void refrescarDatos() {
    	dtos = DBDtos.obtenerRegistro();
    	if(dtos != null) {
			lblFechaBD.setText("Fecha Base: " + dtos.getFechaDB());
		}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {        

        pnlRoot = new javax.swing.JPanel();
        pnlSlide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAlPedo = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnGestionPrecios = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        caed1 = new javax.swing.JPanel();
        pnlCTop = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnCCenter = new javax.swing.JPanel();
        pnlCBooton = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRoot.setPreferredSize(new java.awt.Dimension(960, 600));
        pnlRoot.setRequestFocusEnabled(false);
        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSlide.setBackground(new java.awt.Color(21, 25, 28));
        pnlSlide.setPreferredSize(new java.awt.Dimension(60, 0));

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 150));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        btnAlPedo.setBackground(new java.awt.Color(34, 40, 44));
        btnAlPedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_trampoline_park_16px.png"))); // NOI18N
        btnAlPedo.setMaximumSize(new java.awt.Dimension(40, 40));
        btnAlPedo.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAlPedo.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAlPedo.addMouseListener(new controlBtnPrincipal(this));
        jPanel1.add(btnAlPedo);

        pnlSlide.add(jPanel1);

        btnRegistro.setBackground(new java.awt.Color(34, 40, 44));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_26px.png"))); // NOI18N
        btnRegistro.setMaximumSize(new java.awt.Dimension(40, 40));
        btnRegistro.setMinimumSize(new java.awt.Dimension(40, 40));
        btnRegistro.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlSlide.add(btnRegistro);

        btnGestionPrecios.setBackground(new java.awt.Color(34, 40, 44));
        btnGestionPrecios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_circled_24px.png"))); // NOI18N
        btnGestionPrecios.setMaximumSize(new java.awt.Dimension(40, 40));
        btnGestionPrecios.setMinimumSize(new java.awt.Dimension(40, 40));
        btnGestionPrecios.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlSlide.add(btnGestionPrecios);

        btnConsultas.setBackground(new java.awt.Color(34, 40, 44));
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_document_32px.png"))); // NOI18N
        btnConsultas.setMaximumSize(new java.awt.Dimension(40, 40));
        btnConsultas.setMinimumSize(new java.awt.Dimension(40, 40));
        btnConsultas.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlSlide.add(btnConsultas);

        pnlRoot.add(pnlSlide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnlCenter.setLayout(new java.awt.CardLayout());

        caed1.setLayout(new java.awt.BorderLayout());

        pnlCTop.setBackground(new java.awt.Color(34, 40, 44));
        pnlCTop.setPreferredSize(new java.awt.Dimension(0, 100));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Algun Lugar - Castilla");

        jLabel8.setFont(new java.awt.Font("Schadow BT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Listado de Precios");
        
        lblFechaBD = new JLabel("Fecha Base de datos:");
        lblFechaBD.setForeground(Color.WHITE);

        javax.swing.GroupLayout pnlCTopLayout = new javax.swing.GroupLayout(pnlCTop);
        pnlCTopLayout.setHorizontalGroup(
        	pnlCTopLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlCTopLayout.createSequentialGroup()
        			.addGap(51)
        			.addGroup(pnlCTopLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlCTopLayout.createSequentialGroup()
        					.addComponent(jLabel8)
        					.addPreferredGap(ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
        					.addComponent(lblFechaBD)
        					.addGap(133))
        				.addGroup(pnlCTopLayout.createSequentialGroup()
        					.addComponent(jLabel7)
        					.addContainerGap(733, Short.MAX_VALUE))))
        );
        pnlCTopLayout.setVerticalGroup(
        	pnlCTopLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(pnlCTopLayout.createSequentialGroup()
        			.addContainerGap(33, Short.MAX_VALUE)
        			.addGroup(pnlCTopLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(lblFechaBD))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel7)
        			.addContainerGap())
        );
        pnlCTop.setLayout(pnlCTopLayout);

        caed1.add(pnlCTop, java.awt.BorderLayout.NORTH);

        pnCCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnCCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 52, 58)));
        pnCCenter.setPreferredSize(new java.awt.Dimension(500, 300));

        caed1.add(pnCCenter, java.awt.BorderLayout.CENTER);
        pnCCenter.setLayout(null);
                
                pnlConsultaPrecios = new pnlConsultaPrecios();
                pnlConsultaPrecios.setLocation(10, 11);
                pnCCenter.add(pnlConsultaPrecios);
                pnlConsultaPrecios.setVisible(false);

                pnlGestionCarga = new JPanel();
                pnlGestionCarga.setBounds(10, 11, 849, 378);
                pnlGestionCarga.setBackground(new java.awt.Color(34, 40, 44));
                pnCCenter.add(pnlGestionCarga);
                pnlGestionCarga.setLayout(null);
                pnlGestionCarga.setVisible(false);
                
                 pnelRegistrarMarca = new pnlRegistraMarca();
                 pnelRegistrarMarca.setBounds(0, 0, 251, 182);
                 pnlGestionCarga.add(pnelRegistrarMarca);
                 
                 pnelRegistraColor = new pnlRegistrarColor();
                 pnelRegistraColor.setBounds(306, 0, 251, 182);
                 pnlGestionCarga.add(pnelRegistraColor);
                 
                 pnelCargarProducto = new pnlRegistrarProducto();
                 pnelCargarProducto.setBounds(10, 185, 839, 193);
                 pnlGestionCarga.add(pnelCargarProducto);
        
        pnlGestionPrecios = new pnlGestionPrecios();
        pnlGestionPrecios.setVisible(false);
        pnCCenter.add(pnlGestionPrecios);

        pnlCBooton.setBackground(new java.awt.Color(34, 40, 44));
        pnlCBooton.setPreferredSize(new java.awt.Dimension(0, 100));

        javax.swing.GroupLayout pnlCBootonLayout = new javax.swing.GroupLayout(pnlCBooton);
        pnlCBootonLayout.setHorizontalGroup(
        	pnlCBootonLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 900, Short.MAX_VALUE)
        );
        pnlCBootonLayout.setVerticalGroup(
        	pnlCBootonLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 100, Short.MAX_VALUE)
        );
        pnlCBooton.setLayout(pnlCBootonLayout);

        caed1.add(pnlCBooton, java.awt.BorderLayout.SOUTH);

        pnlCenter.add(caed1, "card5");

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);
        
        DBDtos = new DBDtos();
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel caed1;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnGestionPrecios;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnAlPedo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnCCenter;
    private javax.swing.JPanel pnlCBooton;
    private javax.swing.JPanel pnlCTop;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSlide; 
    private JPanel pnelRegistraColor;
    private JPanel pnelRegistrarMarca;
    private pnlRegistrarProducto pnelCargarProducto;
    private JPanel pnlGestionCarga;
    private JPanel pnlGestionPrecios;
    private JPanel pnlConsultaPrecios;
    private static JLabel lblFechaBD;
    private static DBDtos DBDtos;
    public static dtosNecesarios dtos;
	
    // geter y seterrrrr
    
    public javax.swing.JButton getBtnRegistro() {
		return btnRegistro;
	}

	public javax.swing.JButton getBtnGestionPrecios() {
		return btnGestionPrecios;
	}

	public javax.swing.JButton getBtnConsultas() {
		return btnConsultas;
	}

	public javax.swing.JButton getBtnAlPedo() {
		return btnAlPedo;
	}

	public JPanel getPnlGestionCarga() {
		return pnlGestionCarga;
	}

	public JPanel getPnlGestionPrecios() {
		return pnlGestionPrecios;
	}

	public JPanel getPnlConsultaPrecios() {
		return pnlConsultaPrecios;
	}

	public static dtosNecesarios getDtos() {
		return dtos;
	}
	
}

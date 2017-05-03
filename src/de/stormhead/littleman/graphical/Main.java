package de.stormhead.littleman.graphical;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import de.stormhead.littleman.boxes.BoxHandler;
import de.stormhead.littleman.runtime.Runner;

public class Main {

	private JFrame MainWindow;
	private JTextField box00;
	private JTextField box01;
	private JTextField box02;
	private JTextField box03;
	private JTextField box04;
	private JTextField box05;
	private JTextField box06;
	private JTextField box07;
	private JTextField box08;
	private JTextField box09;
	private JTextField box10;
	private JTextField box11;
	private JTextField box12;
	private JTextField box13;
	private JTextField box14;
	private JTextField box15;
	private JTextField box16;
	private JTextField box17;
	private JTextField box18;
	private JTextField box19;
	private JTextField box20;
	private JTextField box21;
	private JTextField box22;
	private JTextField box23;
	private JTextField box24;
	private JTextField box25;
	private JTextField box26;
	private JTextField box27;
	private JTextField box28;
	private JTextField box29;
	private JTextField box30;
	private JTextField box31;
	private JTextField box32;
	private JTextField box33;
	private JTextField box34;
	private JTextField box35;
	private JTextField box36;
	private JTextField box37;
	private JTextField box38;
	private JTextField box39;
	private JTextField box40;
	private JTextField box41;
	private JTextField box42;
	private JTextField box43;
	private JTextField box44;
	private JTextField box45;
	private JTextField box46;
	private JTextField box47;
	private JTextField box48;
	private JTextField box49;
	private JTextField box50;
	private JTextField box51;
	private JTextField box52;
	private JTextField box53;
	private JTextField box54;
	private JTextField box55;
	private JTextField box56;
	private JTextField box57;
	private JTextField box58;
	private JTextField box59;
	private JTextField box60;
	private JTextField box61;
	private JTextField box62;
	private JTextField box63;
	private JTextField box64;
	private JTextField box65;
	private JTextField box66;
	private JTextField box67;
	private JTextField box68;
	private JTextField box69;
	private JTextField box70;
	private JTextField box71;
	private JTextField box72;
	private JTextField box73;
	private JTextField box74;
	private JTextField box75;
	private JTextField box76;
	private JTextField box77;
	private JTextField box78;
	private JTextField box79;
	private JTextField box80;
	private JTextField box81;
	private JTextField box82;
	private JTextField box83;
	private JTextField box84;
	private JTextField box85;
	private JTextField box86;
	private JTextField box87;
	private JTextField box88;
	private JTextField box89;
	private JTextField box90;
	private JTextField box91;
	private JTextField box92;
	private JTextField box93;
	private JTextField box94;
	private JTextField box95;
	private JTextField box96;
	private JTextField box97;
	private JTextField box98;
	private JTextField box99;
	private JLabel lblCounter;
	private JLabel lblCalculator;
	private JTextField counterField;
	private JTextField calculatorField;
	
	public JTextField getCounterField() {
    return counterField;
  }

  public JTextField getCalculatorField() {
    return calculatorField;
  }

  public JTextField getInputField() {
    return inputField;
  }

  public JTextField getOutputField() {
    return outputField;
  }

  public JTextField getTickTimeField() {
    return tickTimeField;
  }

  private JLabel lblInput;
	private JLabel lblOutput;
	private JTextField inputField;
	private JTextField outputField;
	private JLabel lblTickSpeed;
	private JTextField tickTimeField;
	private JButton btnRun;
	private JButton btnPause;
	private JButton btnNextStep;
	private JLabel lblQuickReference;
	private JLabel lblStop;
	private JLabel lblxxAddXx;
	private JLabel lblxxSubtractXx;
	private JLabel lblxxStoreIn;
	private JLabel lblxxLoadFrom;
	private JLabel lblxxGotoXx;
	private JLabel lblxxGotoIf;
	private JLabel lblxxGotoIf_1;
	private JLabel lblReadInput;
	private JLabel lblWriteOutput;
	private JLabel lblxxAddFrom;
	private JLabel lblxxSubtractFrom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.MainWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainWindow = new JFrame();
		MainWindow.setBounds(100, 100, 835, 742);
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainWindow.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
		    ColumnSpec.decode("center:4dlu"),
		    FormFactory.DEFAULT_COLSPEC,
		    ColumnSpec.decode("center:4dlu"),
		    ColumnSpec.decode("max(44dlu;default):grow"),
		    ColumnSpec.decode("center:4dlu"),
		    ColumnSpec.decode("default:grow"),
		    ColumnSpec.decode("left:4dlu"),
		    ColumnSpec.decode("default:grow"),
		    FormFactory.RELATED_GAP_COLSPEC,
		    ColumnSpec.decode("default:grow"),
		    FormFactory.RELATED_GAP_COLSPEC,
		    ColumnSpec.decode("default:grow"),
		    FormFactory.RELATED_GAP_COLSPEC,
		    FormFactory.DEFAULT_COLSPEC,},
		  new RowSpec[] {
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,
		    FormFactory.RELATED_GAP_ROWSPEC,
		    FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblMailbox = new JLabel("Mailbox 00-04");
		MainWindow.getContentPane().add(lblMailbox, "2, 2, right, default");
		
		box00 = new JTextField();
		box00.setText("000");
		MainWindow.getContentPane().add(box00, "4, 2, left, default");
		box00.setColumns(10);
		
		box01 = new JTextField();
		box01.setText("000");
		MainWindow.getContentPane().add(box01, "6, 2, left, default");
		box01.setColumns(10);
		
		box02 = new JTextField();
		box02.setText("000");
		MainWindow.getContentPane().add(box02, "8, 2, left, default");
		box02.setColumns(10);
		
		box03 = new JTextField();
		box03.setText("000");
		MainWindow.getContentPane().add(box03, "10, 2, left, default");
		box03.setColumns(10);
		
		box04 = new JTextField();
		box04.setText("000");
		MainWindow.getContentPane().add(box04, "12, 2, left, default");
		box04.setColumns(10);
		
		JLabel lblMailbox_1 = new JLabel("Mailbox 05-09");
		MainWindow.getContentPane().add(lblMailbox_1, "2, 4, right, default");
		
		box05 = new JTextField();
		box05.setText("000");
		MainWindow.getContentPane().add(box05, "4, 4, left, default");
		box05.setColumns(10);
		
		box06 = new JTextField();
		box06.setText("000");
		MainWindow.getContentPane().add(box06, "6, 4, left, default");
		box06.setColumns(10);
		
		box07 = new JTextField();
		box07.setText("000");
		MainWindow.getContentPane().add(box07, "8, 4, left, default");
		box07.setColumns(10);
		
		box08 = new JTextField();
		box08.setText("000");
		MainWindow.getContentPane().add(box08, "10, 4, left, default");
		box08.setColumns(10);
		
		box09 = new JTextField();
		box09.setText("000");
		MainWindow.getContentPane().add(box09, "12, 4, left, default");
		box09.setColumns(10);
		
		JLabel lblMailbox_11 = new JLabel("Mailbox 10-14");
		MainWindow.getContentPane().add(lblMailbox_11, "2, 6, right, default");
		
		box10 = new JTextField();
		box10.setText("000");
		MainWindow.getContentPane().add(box10, "4, 6, left, default");
		box10.setColumns(10);
		
		box11 = new JTextField();
		box11.setText("000");
		MainWindow.getContentPane().add(box11, "6, 6, left, default");
		box11.setColumns(10);
		
		box12 = new JTextField();
		box12.setText("000");
		box12.setColumns(10);
		MainWindow.getContentPane().add(box12, "8, 6, left, default");
		
		box13 = new JTextField();
		box13.setText("000");
		box13.setColumns(10);
		MainWindow.getContentPane().add(box13, "10, 6, left, default");
		
		box14 = new JTextField();
		box14.setText("000");
		box14.setColumns(10);
		MainWindow.getContentPane().add(box14, "12, 6, left, default");
		
		JLabel lblMailbox_2 = new JLabel("Mailbox 15-19");
		MainWindow.getContentPane().add(lblMailbox_2, "2, 8, right, default");
		
		box15 = new JTextField();
		box15.setText("000");
		box15.setColumns(10);
		MainWindow.getContentPane().add(box15, "4, 8, left, default");
		
		box16 = new JTextField();
		box16.setText("000");
		box16.setColumns(10);
		MainWindow.getContentPane().add(box16, "6, 8, left, default");
		
		box17 = new JTextField();
		box17.setText("000");
		box17.setColumns(10);
		MainWindow.getContentPane().add(box17, "8, 8, left, default");
		
		box18 = new JTextField();
		box18.setText("000");
		box18.setColumns(10);
		MainWindow.getContentPane().add(box18, "10, 8, left, default");
		
		box19 = new JTextField();
		box19.setText("000");
		box19.setColumns(10);
		MainWindow.getContentPane().add(box19, "12, 8, left, default");
		
		lblQuickReference = new JLabel("Quick Reference:");
		MainWindow.getContentPane().add(lblQuickReference, "14, 8");
		
		JLabel lblMailbox_3 = new JLabel("Mailbox 20-24");
		MainWindow.getContentPane().add(lblMailbox_3, "2, 10, right, default");
		
		box20 = new JTextField();
		box20.setText("000");
		box20.setColumns(10);
		MainWindow.getContentPane().add(box20, "4, 10, left, default");
		
		box21 = new JTextField();
		box21.setText("000");
		box21.setColumns(10);
		MainWindow.getContentPane().add(box21, "6, 10, left, default");
		
		box22 = new JTextField();
		box22.setText("000");
		box22.setColumns(10);
		MainWindow.getContentPane().add(box22, "8, 10, left, default");
		
		box23 = new JTextField();
		box23.setText("000");
		box23.setColumns(10);
		MainWindow.getContentPane().add(box23, "10, 10, left, default");
		
		box24 = new JTextField();
		box24.setText("000");
		box24.setColumns(10);
		MainWindow.getContentPane().add(box24, "12, 10, left, default");
		
		JLabel lblMailbox_4 = new JLabel("Mailbox 25-29");
		MainWindow.getContentPane().add(lblMailbox_4, "2, 12, right, default");
		
		box25 = new JTextField();
		box25.setText("000");
		MainWindow.getContentPane().add(box25, "4, 12, left, default");
		box25.setColumns(10);
		
		box26 = new JTextField();
		box26.setText("000");
		box26.setColumns(10);
		MainWindow.getContentPane().add(box26, "6, 12, left, default");
		
		box27 = new JTextField();
		box27.setText("000");
		box27.setColumns(10);
		MainWindow.getContentPane().add(box27, "8, 12, left, default");
		
		box28 = new JTextField();
		box28.setText("000");
		box28.setColumns(10);
		MainWindow.getContentPane().add(box28, "10, 12, left, default");
		
		box29 = new JTextField();
		box29.setText("000");
		box29.setColumns(10);
		MainWindow.getContentPane().add(box29, "12, 12, left, default");
		
		lblStop = new JLabel("000: stop");
		MainWindow.getContentPane().add(lblStop, "14, 12");
		
		JLabel lblMailbox_5 = new JLabel("Mailbox 30-34");
		MainWindow.getContentPane().add(lblMailbox_5, "2, 14, right, default");
		
		box30 = new JTextField();
		box30.setText("000");
		box30.setColumns(10);
		MainWindow.getContentPane().add(box30, "4, 14, left, default");
		
		box31 = new JTextField();
		box31.setText("000");
		box31.setColumns(10);
		MainWindow.getContentPane().add(box31, "6, 14, left, default");
		
		box32 = new JTextField();
		box32.setText("000");
		box32.setColumns(10);
		MainWindow.getContentPane().add(box32, "8, 14, left, default");
		
		box33 = new JTextField();
		box33.setText("000");
		box33.setColumns(10);
		MainWindow.getContentPane().add(box33, "10, 14, left, default");
		
		box34 = new JTextField();
		box34.setText("000");
		box34.setColumns(10);
		MainWindow.getContentPane().add(box34, "12, 14, left, default");
		
		lblxxAddXx = new JLabel("1XX: add XX");
		MainWindow.getContentPane().add(lblxxAddXx, "14, 14");
		
		JLabel lblMailbox_6 = new JLabel("Mailbox 35-39");
		MainWindow.getContentPane().add(lblMailbox_6, "2, 16, right, default");
		
		box35 = new JTextField();
		box35.setText("000");
		box35.setColumns(10);
		MainWindow.getContentPane().add(box35, "4, 16, left, default");
		
		box36 = new JTextField();
		box36.setText("000");
		box36.setColumns(10);
		MainWindow.getContentPane().add(box36, "6, 16, left, default");
		
		box37 = new JTextField();
		box37.setText("000");
		box37.setColumns(10);
		MainWindow.getContentPane().add(box37, "8, 16, left, default");
		
		box38 = new JTextField();
		box38.setText("000");
		box38.setColumns(10);
		MainWindow.getContentPane().add(box38, "10, 16, left, default");
		
		box39 = new JTextField();
		box39.setText("000");
		box39.setColumns(10);
		MainWindow.getContentPane().add(box39, "12, 16, left, default");
		
		lblxxSubtractXx = new JLabel("2XX: subtract XX");
		MainWindow.getContentPane().add(lblxxSubtractXx, "14, 16");
		
		JLabel lblMailbox_7 = new JLabel("Mailbox 40-44");
		MainWindow.getContentPane().add(lblMailbox_7, "2, 18, right, default");
		
		box40 = new JTextField();
		box40.setText("000");
		box40.setColumns(10);
		MainWindow.getContentPane().add(box40, "4, 18, left, default");
		
		box41 = new JTextField();
		box41.setText("000");
		box41.setColumns(10);
		MainWindow.getContentPane().add(box41, "6, 18, left, default");
		
		box42 = new JTextField();
		box42.setText("000");
		box42.setColumns(10);
		MainWindow.getContentPane().add(box42, "8, 18, left, default");
		
		box43 = new JTextField();
		box43.setText("000");
		box43.setColumns(10);
		MainWindow.getContentPane().add(box43, "10, 18, left, default");
		
		box44 = new JTextField();
		box44.setText("000");
		box44.setColumns(10);
		MainWindow.getContentPane().add(box44, "12, 18, left, default");
		
		lblxxStoreIn = new JLabel("3XX: store in XX");
		MainWindow.getContentPane().add(lblxxStoreIn, "14, 18");
		
		JLabel lblMailbox_8 = new JLabel("Mailbox 45-49");
		MainWindow.getContentPane().add(lblMailbox_8, "2, 20, right, default");
		
		box45 = new JTextField();
		box45.setText("000");
		box45.setColumns(10);
		MainWindow.getContentPane().add(box45, "4, 20, left, default");
		
		box46 = new JTextField();
		box46.setText("000");
		box46.setColumns(10);
		MainWindow.getContentPane().add(box46, "6, 20, left, default");
		
		box47 = new JTextField();
		box47.setText("000");
		box47.setColumns(10);
		MainWindow.getContentPane().add(box47, "8, 20, left, default");
		
		box48 = new JTextField();
		box48.setText("000");
		box48.setColumns(10);
		MainWindow.getContentPane().add(box48, "10, 20, left, default");
		
		box49 = new JTextField();
		box49.setText("000");
		box49.setColumns(10);
		MainWindow.getContentPane().add(box49, "12, 20, left, default");
		
		lblxxLoadFrom = new JLabel("5XX: load from XX");
		MainWindow.getContentPane().add(lblxxLoadFrom, "14, 20");
		
		JLabel lblMailbox_9 = new JLabel("Mailbox 50-54");
		MainWindow.getContentPane().add(lblMailbox_9, "2, 22, right, default");
		
		box50 = new JTextField();
		box50.setText("000");
		box50.setColumns(10);
		MainWindow.getContentPane().add(box50, "4, 22, left, default");
		
		box51 = new JTextField();
		box51.setText("000");
		box51.setColumns(10);
		MainWindow.getContentPane().add(box51, "6, 22, left, default");
		
		box52 = new JTextField();
		box52.setText("000");
		box52.setColumns(10);
		MainWindow.getContentPane().add(box52, "8, 22, left, default");
		
		box53 = new JTextField();
		box53.setText("000");
		box53.setColumns(10);
		MainWindow.getContentPane().add(box53, "10, 22, left, default");
		
		box54 = new JTextField();
		box54.setText("000");
		box54.setColumns(10);
		MainWindow.getContentPane().add(box54, "12, 22, left, default");
		
		lblxxGotoXx = new JLabel("6XX: goto XX");
		MainWindow.getContentPane().add(lblxxGotoXx, "14, 22");
		
		JLabel lblMailbox_10 = new JLabel("Mailbox 55-59");
		MainWindow.getContentPane().add(lblMailbox_10, "2, 24, right, default");
		
		box55 = new JTextField();
		box55.setText("000");
		box55.setColumns(10);
		MainWindow.getContentPane().add(box55, "4, 24, left, default");
		
		box56 = new JTextField();
		box56.setText("000");
		box56.setColumns(10);
		MainWindow.getContentPane().add(box56, "6, 24, left, default");
		
		box57 = new JTextField();
		box57.setText("000");
		box57.setColumns(10);
		MainWindow.getContentPane().add(box57, "8, 24, left, default");
		
		box58 = new JTextField();
		box58.setText("000");
		box58.setColumns(10);
		MainWindow.getContentPane().add(box58, "10, 24, left, default");
		
		box59 = new JTextField();
		box59.setText("000");
		box59.setColumns(10);
		MainWindow.getContentPane().add(box59, "12, 24, left, default");
		
		lblxxGotoIf = new JLabel("7XX: goto if 0");
		MainWindow.getContentPane().add(lblxxGotoIf, "14, 24");
		
		JLabel lblMailbox_12 = new JLabel("Mailbox 60-64");
		MainWindow.getContentPane().add(lblMailbox_12, "2, 26, right, default");
		
		box60 = new JTextField();
		box60.setText("000");
		box60.setColumns(10);
		MainWindow.getContentPane().add(box60, "4, 26, left, default");
		
		box61 = new JTextField();
		box61.setText("000");
		box61.setColumns(10);
		MainWindow.getContentPane().add(box61, "6, 26, left, default");
		
		box62 = new JTextField();
		box62.setText("000");
		box62.setColumns(10);
		MainWindow.getContentPane().add(box62, "8, 26, left, default");
		
		box63 = new JTextField();
		box63.setText("000");
		box63.setColumns(10);
		MainWindow.getContentPane().add(box63, "10, 26, left, default");
		
		box64 = new JTextField();
		box64.setText("000");
		box64.setColumns(10);
		MainWindow.getContentPane().add(box64, "12, 26, left, default");
		
		lblxxGotoIf_1 = new JLabel("8XX: goto if !0");
		MainWindow.getContentPane().add(lblxxGotoIf_1, "14, 26");
		
		JLabel lblMailbox_13 = new JLabel("Mailbox 65-69");
		MainWindow.getContentPane().add(lblMailbox_13, "2, 28, right, default");
		
		box65 = new JTextField();
		box65.setText("000");
		box65.setColumns(10);
		MainWindow.getContentPane().add(box65, "4, 28, left, default");
		
		box66 = new JTextField();
		box66.setText("000");
		box66.setColumns(10);
		MainWindow.getContentPane().add(box66, "6, 28, left, default");
		
		box67 = new JTextField();
		box67.setText("000");
		box67.setColumns(10);
		MainWindow.getContentPane().add(box67, "8, 28, left, default");
		
		box68 = new JTextField();
		box68.setText("000");
		box68.setColumns(10);
		MainWindow.getContentPane().add(box68, "10, 28, left, default");
		
		box69 = new JTextField();
		box69.setText("000");
		box69.setColumns(10);
		MainWindow.getContentPane().add(box69, "12, 28, left, default");
		
		lblReadInput = new JLabel("901: read input");
		MainWindow.getContentPane().add(lblReadInput, "14, 28");
		
		JLabel lblMailbox_14 = new JLabel("Mailbox 70-74");
		MainWindow.getContentPane().add(lblMailbox_14, "2, 30, right, default");
		
		box70 = new JTextField();
		box70.setText("000");
		box70.setColumns(10);
		MainWindow.getContentPane().add(box70, "4, 30, left, default");
		
		box71 = new JTextField();
		box71.setText("000");
		box71.setColumns(10);
		MainWindow.getContentPane().add(box71, "6, 30, left, default");
		
		box72 = new JTextField();
		box72.setText("000");
		box72.setColumns(10);
		MainWindow.getContentPane().add(box72, "8, 30, left, default");
		
		box73 = new JTextField();
		box73.setText("000");
		box73.setColumns(10);
		MainWindow.getContentPane().add(box73, "10, 30, left, default");
		
		box74 = new JTextField();
		box74.setText("000");
		box74.setColumns(10);
		MainWindow.getContentPane().add(box74, "12, 30, left, default");
		
		lblWriteOutput = new JLabel("902: write output");
		MainWindow.getContentPane().add(lblWriteOutput, "14, 30");
		
		JLabel lblMailbox_15 = new JLabel("Mailbox 75-79");
		MainWindow.getContentPane().add(lblMailbox_15, "2, 32, right, default");
		
		box75 = new JTextField();
		box75.setText("000");
		box75.setColumns(10);
		MainWindow.getContentPane().add(box75, "4, 32, left, default");
		
		box76 = new JTextField();
		box76.setText("000");
		box76.setColumns(10);
		MainWindow.getContentPane().add(box76, "6, 32, left, default");
		
		box77 = new JTextField();
		box77.setText("000");
		box77.setColumns(10);
		MainWindow.getContentPane().add(box77, "8, 32, left, default");
		
		box78 = new JTextField();
		box78.setText("000");
		box78.setColumns(10);
		MainWindow.getContentPane().add(box78, "10, 32, left, default");
		
		box79 = new JTextField();
		box79.setText("000");
		box79.setColumns(10);
		MainWindow.getContentPane().add(box79, "12, 32, left, default");
		
		JLabel lblMailbox_16 = new JLabel("Mailbox 80-84");
		MainWindow.getContentPane().add(lblMailbox_16, "2, 34, right, default");
		
		box80 = new JTextField();
		box80.setText("000");
		box80.setColumns(10);
		MainWindow.getContentPane().add(box80, "4, 34, left, default");
		
		box81 = new JTextField();
		box81.setText("000");
		box81.setColumns(10);
		MainWindow.getContentPane().add(box81, "6, 34, left, default");
		
		box82 = new JTextField();
		box82.setText("000");
		box82.setColumns(10);
		MainWindow.getContentPane().add(box82, "8, 34, left, default");
		
		box83 = new JTextField();
		box83.setText("000");
		box83.setColumns(10);
		MainWindow.getContentPane().add(box83, "10, 34, left, default");
		
		box84 = new JTextField();
		box84.setText("000");
		box84.setColumns(10);
		MainWindow.getContentPane().add(box84, "12, 34, left, default");
		
		lblxxAddFrom = new JLabel("10XX: add from XX");
		MainWindow.getContentPane().add(lblxxAddFrom, "14, 34");
		
		JLabel lblMailbox_17 = new JLabel("Mailbox 85-89");
		MainWindow.getContentPane().add(lblMailbox_17, "2, 36, right, default");
		
		box85 = new JTextField();
		box85.setText("000");
		box85.setColumns(10);
		MainWindow.getContentPane().add(box85, "4, 36, left, default");
		
		box86 = new JTextField();
		box86.setText("000");
		box86.setColumns(10);
		MainWindow.getContentPane().add(box86, "6, 36, left, default");
		
		box87 = new JTextField();
		box87.setText("000");
		box87.setColumns(10);
		MainWindow.getContentPane().add(box87, "8, 36, left, default");
		
		box88 = new JTextField();
		box88.setText("000");
		box88.setColumns(10);
		MainWindow.getContentPane().add(box88, "10, 36, left, default");
		
		box89 = new JTextField();
		box89.setText("000");
		box89.setColumns(10);
		MainWindow.getContentPane().add(box89, "12, 36, left, default");
		
		lblxxSubtractFrom = new JLabel("20XX: subtract from XX");
		MainWindow.getContentPane().add(lblxxSubtractFrom, "14, 36");
		
		JLabel lblMailbox_18 = new JLabel("Mailbox 90-94");
		MainWindow.getContentPane().add(lblMailbox_18, "2, 38, right, default");
		
		box90 = new JTextField();
		box90.setText("000");
		box90.setColumns(10);
		MainWindow.getContentPane().add(box90, "4, 38, left, default");
		
		box91 = new JTextField();
		box91.setText("000");
		box91.setColumns(10);
		MainWindow.getContentPane().add(box91, "6, 38, left, default");
		
		box92 = new JTextField();
		box92.setText("000");
		box92.setColumns(10);
		MainWindow.getContentPane().add(box92, "8, 38, left, default");
		
		box93 = new JTextField();
		box93.setText("000");
		box93.setColumns(10);
		MainWindow.getContentPane().add(box93, "10, 38, left, default");
		
		box94 = new JTextField();
		box94.setText("000");
		box94.setColumns(10);
		MainWindow.getContentPane().add(box94, "12, 38, left, default");
		
		JLabel lblMailbox_19 = new JLabel("Mailbox 95-99");
		MainWindow.getContentPane().add(lblMailbox_19, "2, 40, right, default");
		
		box95 = new JTextField();
		box95.setText("000");
		box95.setColumns(10);
		MainWindow.getContentPane().add(box95, "4, 40, left, default");
		
		box96 = new JTextField();
		box96.setText("000");
		box96.setColumns(10);
		MainWindow.getContentPane().add(box96, "6, 40, left, default");
		
		box97 = new JTextField();
		box97.setText("000");
		box97.setColumns(10);
		MainWindow.getContentPane().add(box97, "8, 40, left, default");
		
		box98 = new JTextField();
		box98.setText("000");
		box98.setColumns(10);
		MainWindow.getContentPane().add(box98, "10, 40, left, default");
		
		box99 = new JTextField();
		box99.setText("000");
		box99.setColumns(10);
		MainWindow.getContentPane().add(box99, "12, 40, left, default");
		
		lblCounter = new JLabel("Counter");
		MainWindow.getContentPane().add(lblCounter, "2, 44");
		
		counterField = new JTextField();
		counterField.setText("00");
		MainWindow.getContentPane().add(counterField, "4, 44, fill, default");
		counterField.setColumns(10);
		
		lblInput = new JLabel("Input");
		MainWindow.getContentPane().add(lblInput, "8, 44, right, default");
		
		inputField = new JTextField();
		MainWindow.getContentPane().add(inputField, "10, 44, fill, default");
		inputField.setColumns(10);
		
		lblCalculator = new JLabel("Calculator");
		MainWindow.getContentPane().add(lblCalculator, "2, 46");
		
		calculatorField = new JTextField();
		calculatorField.setText("0");
		MainWindow.getContentPane().add(calculatorField, "4, 46, fill, default");
		calculatorField.setColumns(10);
		
		lblOutput = new JLabel("Output");
		MainWindow.getContentPane().add(lblOutput, "8, 46, right, default");
		
		outputField = new JTextField();
		MainWindow.getContentPane().add(outputField, "10, 46, fill, default");
		outputField.setColumns(10);
		
		lblTickSpeed = new JLabel("Tick time (ms)");
		MainWindow.getContentPane().add(lblTickSpeed, "2, 50");
		
		tickTimeField = new JTextField();
		tickTimeField.setText("1000");
		MainWindow.getContentPane().add(tickTimeField, "4, 50, fill, default");
		tickTimeField.setColumns(10);
		
		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		    synchronized(Runner.INST) {
		      Runner.INST.notifyAll();
		    }
		    Runner.INST.run();
		  }
		});
		MainWindow.getContentPane().add(btnRun, "8, 50");
		
		btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		    Runner.INST.pause();
		  }
		});
		MainWindow.getContentPane().add(btnPause, "10, 50");
		
		btnNextStep = new JButton("Next step");
		MainWindow.getContentPane().add(btnNextStep, "12, 50");
		
	  BoxHandler.INST.init(this);
	  for(Field field : Field.values())
	    field.init(this);
	}
	
}

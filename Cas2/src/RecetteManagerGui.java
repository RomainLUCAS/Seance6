/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import jdk.jfr.Event;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.List;

/**
 *
 * @author lucas
 */
public class RecetteManagerGui extends javax.swing.JFrame {

    /**
     * Creates new form RecetteManagerGui
     */
    public RecetteManagerGui() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField1");
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField1");
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField1");
            }
        });

        jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField2");
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField2");
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                Mediator("jTextField2");
            }
        });

        jTextPane1.setEnabled(false);
        jTextPane1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Mediator("jTextPane1");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Mediator("jTextPane1");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Mediator("jTextPane1");
            }
        });

        jLabel1.setText("Nom de la recette : ");

        jLabel2.setText("Durée de la préparation (min) : ");

        jButton1.setText("Imprimer recette");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Oeuf(s)", "Farine", "Sucre", "Beurre", "Lait", "Raisins secs", "Levure", "Eau" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel3.setText("Ingrédients :");

        jLabel4.setText("Détail de l'étape :");

        jScrollPane2.setViewportView(jTextPane1);

        jButton2.setText("Ajouter une étape");
        jButton2.setEnabled(false);

        jLabel5.setText("Etapes :");

        listModel2 = new DefaultListModel<>();
        listModel2.addListDataListener(new ListDataListener() {
            @Override
            public void intervalAdded(ListDataEvent e) {
                Mediator("listModel2");
            }

            @Override
            public void intervalRemoved(ListDataEvent e) {
                Mediator("listModel2");
            }

            @Override
            public void contentsChanged(ListDataEvent e) {
                Mediator("listModel2");
            }
        });

        jList2 = new JList<>(listModel2);
        jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        jButton3.setText("Supprimer");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vers le haut");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Vers le bas ");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jButton3)
                                .addGap(57, 57, 57)
                                .addComponent(jButton4)
                                .addGap(50, 50, 50)
                                .addComponent(jButton5)))
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(11, 11, 11))
        );

        pack();
    }

    private void Mediator(String source) {
        switch (source)
        {
            case "jButton1":
                for(int i=0; i<listModel2.getSize();i++)
                {
                    System.out.println(i +". "+listModel2.getElementAt(i));
                }
                System.out.println("La recette est imprimée !");

                break;
            case "jButton2":
                String newLine = new String();
                List<String> alimentsList= jList1.getSelectedValuesList();
                if(!alimentsList.isEmpty())
                {
                    String aliments = "(";
                    for (String aliment:alimentsList) {
                        if(aliments.equals("("))
                            aliments = aliments + aliment;
                        else
                            aliments = aliments + "," + aliment;
                    }
                    newLine = aliments + ") ";
                }
                newLine = newLine + jTextPane1.getText();
                jTextPane1.setText("");
                jList1.clearSelection();
                listModel2.addElement(newLine);
                break;
            case "jButton3":
                int selectedIndex = jList2.getSelectedIndex();
                if(selectedIndex != -1)
                    listModel2.remove(selectedIndex);
                jList2.clearSelection();
                break;
            case "jButton4":
                int index = jList2.getSelectedIndex();
                if(index==0)
                    return;
                int newIndex = index-1;
                String temp = listModel2.getElementAt(index);
                listModel2.setElementAt(listModel2.getElementAt(newIndex), index);
                listModel2.setElementAt(temp, newIndex);
                jList2.clearSelection();
                break;
            case "jButton5":
                index = jList2.getSelectedIndex();
                if(index==listModel2.getSize()-1)
                    return;
                newIndex = index+1;
                temp = listModel2.getElementAt(index);
                listModel2.setElementAt(listModel2.getElementAt(newIndex), index);
                listModel2.setElementAt(temp, newIndex);
                jList2.clearSelection();
                break;
            case "jList1":
                break;
            case "listModel2":
                if(listModel2.isEmpty())
                {
                    jButton1.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(false);
                    jButton5.setEnabled(false);
                }
                else
                {
                    jButton1.setEnabled(true);
                    jButton3.setEnabled(true);
                    if(listModel2.getSize()>1)
                    {
                        jButton4.setEnabled(true);
                        jButton5.setEnabled(true);
                    }
                    else
                    {
                        jButton4.setEnabled(false);
                        jButton5.setEnabled(false);
                    }
                }
                break;
            case "jList2":
                break;
            case "jTextField2":
            case "jTextField1":
                if(jTextField1.getText().length() > 0 && jTextField2.getText().length() > 0)
                    jTextPane1.setEnabled(true);
                else{
                    jTextPane1.setEnabled(false);
                    jTextPane1.setText("");
                }
                break;
            case "jTextPane1":
                if(jTextPane1.getText().length() > 0)
                    jButton2.setEnabled(true);
                else
                    jButton2.setEnabled(false);
                break;
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Mediator("jButton1");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Mediator("jButton2");
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Mediator("jButton3");
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Mediator("jButton4");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Mediator("jButton5");
    }

    public static void main(String args[]) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetteManagerGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private DefaultListModel<String> listModel2;

}
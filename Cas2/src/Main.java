import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Application de Recette");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 1));

        // Ligne 1
        JPanel ligne1 = new JPanel();
        ligne1.setLayout(new FlowLayout());

        JLabel labelNomRecette = new JLabel("Nom de la recette: ");
        JTextField textFieldNomRecette = new JTextField(20);
        JLabel labelTempsPreparation = new JLabel("Temps de préparation (min): ");
        JTextField textFieldTempsPreparation = new JTextField(5);
        JButton imprimerButton = new JButton("Imprimer recette");

        ligne1.add(labelNomRecette);
        ligne1.add(textFieldNomRecette);
        ligne1.add(labelTempsPreparation);
        ligne1.add(textFieldTempsPreparation);
        ligne1.add(imprimerButton);

        // Ligne 2
        JPanel ligne2 = new JPanel();
        ligne2.setLayout(new FlowLayout());

        JLabel labelIngredients = new JLabel("Ingrédients: ");
        JLabel labelDescription = new JLabel("Description de l'étape");

        ligne2.add(labelIngredients);
        ligne2.add(labelDescription);

        // Ligne 3
        JPanel ligne3 = new JPanel();
        ligne3.setLayout(new FlowLayout());

        DefaultListModel<String> ingredientsListModel = new DefaultListModel<>();
        JList<String> ingredientsList = new JList<>(ingredientsListModel);
        JScrollPane ingredientsScrollPane = new JScrollPane(ingredientsList);
        JTextField descriptionEtape = new JTextField(40);
        JButton ajouterEtapeButton = new JButton("Ajouter étape");

        ligne3.add(ingredientsScrollPane);
        ligne3.add(descriptionEtape);
        ligne3.add(ajouterEtapeButton);

        // Ligne 4
        JPanel ligne4 = new JPanel();
        ligne4.setLayout(new FlowLayout());

        JLabel labelEtapes = new JLabel("Étapes");

        ligne4.add(labelEtapes);

        // Ligne 5
        JPanel ligne5 = new JPanel();
        ligne5.setLayout(new FlowLayout());

        DefaultListModel<String> etapesListModel = new DefaultListModel<>();
        JList<String> etapesList = new JList<>(etapesListModel);
        JScrollPane etapesScrollPane = new JScrollPane(etapesList);

        ligne5.add(etapesScrollPane);

        // Ligne 6
        JPanel ligne6 = new JPanel();
        ligne6.setLayout(new FlowLayout());

        JButton supprimerButton = new JButton("Supprimer");
        JButton versLeHautButton = new JButton("Vers le haut");
        JButton versLeBasButton = new JButton("Vers le bas");

        ligne6.add(supprimerButton);
        ligne6.add(versLeHautButton);
        ligne6.add(versLeBasButton);

        // Ajout des composants au panneau principal
        mainPanel.add(ligne1);
        mainPanel.add(ligne2);
        mainPanel.add(ligne3);
        mainPanel.add(ligne4);
        mainPanel.add(ligne5);
        mainPanel.add(ligne6);

        frame.add(mainPanel);
        frame.setVisible(true);

        // ActionListener pour le bouton "Ajouter étape"
        ajouterEtapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = descriptionEtape.getText();
                etapesListModel.addElement(description);
                descriptionEtape.setText("");
            }
        });
    }
}
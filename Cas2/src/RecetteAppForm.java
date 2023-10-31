import javax.swing.*;

public class RecetteAppForm extends JFrame {
    private JPanel mainPanel;
    private JTextField textFieldNomRecette;
    private JTextField textFieldTempsPreparation;
    private JButton imprimerButton;
    private JList<String> ingredientsList;
    private JTextField descriptionEtape;
    private JButton ajouterEtapeButton;
    private JList<String> etapesList;
    private JButton supprimerButton;
    private JButton versLeHautButton;
    private JButton versLeBasButton;

    public RecetteAppForm() {
        // Initialisation des composants et de la logique ici
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new RecetteAppForm();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
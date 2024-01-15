import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class AerospaceClient {
    String name;
    String organization;
    String aircraftType;
    int experienceYears;
    boolean isCertified;

    public AerospaceClient(String name, String organization, String aircraftType, int experienceYears, boolean isCertified) {
        this.name = name;
        this.organization = organization;
        this.aircraftType = aircraftType;
        this.experienceYears = experienceYears;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Organization: " + organization + ", Aircraft Type: " + aircraftType +
                ", Experience Years: " + experienceYears + ", Certification Status: " + (isCertified ? "Certified" : "Not Certified");
    }
}

public class AerospaceClientApp_Swing extends JFrame {
    private List<AerospaceClient> clients;
    private JTextArea clientListArea;
    private JTextField nameField;
    private JTextField organizationField;
    private JTextField aircraftTypeField;
    private JSpinner experienceSpinner;
    private JRadioButton certifiedRadioButton;
    private JRadioButton notCertifiedRadioButton;

    public AerospaceClientApp_Swing() {
        clients = new ArrayList<>();

        setTitle("Aerospace Client Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createUI();

        setVisible(true);
    }

    private void createUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        clientListArea = new JTextArea();
        clientListArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(clientListArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        inputPanel.add(new JLabel("Client Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Client Organization:"));
        organizationField = new JTextField();
        inputPanel.add(organizationField);

        inputPanel.add(new JLabel("Aircraft Type:"));
        aircraftTypeField = new JTextField();
        inputPanel.add(aircraftTypeField);

        inputPanel.add(new JLabel("Experience Years:"));
        SpinnerModel experienceModel = new SpinnerNumberModel(1, 1, 50, 1);
        experienceSpinner = new JSpinner(experienceModel);
        JSpinner.NumberEditor experienceEditor = new JSpinner.NumberEditor(experienceSpinner);
        experienceSpinner.setEditor(experienceEditor);
        inputPanel.add(experienceSpinner);

        inputPanel.add(new JLabel("Certification Status:"));
        certifiedRadioButton = new JRadioButton("Certified");
        notCertifiedRadioButton = new JRadioButton("Not Certified");
        ButtonGroup certificationGroup = new ButtonGroup();
        certificationGroup.add(certifiedRadioButton);
        certificationGroup.add(notCertifiedRadioButton);
        JPanel certificationPanel = new JPanel();
        certificationPanel.add(certifiedRadioButton);
        certificationPanel.add(notCertifiedRadioButton);
        inputPanel.add(certificationPanel);

        JButton addButton = new JButton("Add Client");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addClient(certificationGroup);
            }
        });

        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem viewClientsItem = new JMenuItem("View Clients");
        viewClientsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewClients();
            }
        });

        JMenuItem clearClientsItem = new JMenuItem("Clear Clients");
        clearClientsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearClients();
            }
        });

        JMenuItem searchClientItem = new JMenuItem("Search Client");
        searchClientItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchClient();
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(viewClientsItem);
        fileMenu.addSeparator();
        fileMenu.add(clearClientsItem);
        fileMenu.addSeparator();
        fileMenu.add(searchClientItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        add(mainPanel);
    }

    private void addClient(ButtonGroup certificationGroup) {
        String name = nameField.getText();
        String organization = organizationField.getText();
        String aircraftType = aircraftTypeField.getText();
        int experienceYears = (int) experienceSpinner.getValue();
        boolean isCertified = certifiedRadioButton.isSelected();

        if (validateName(name) && validateOrganization(organization) && validateCertification()) {
            AerospaceClient client = new AerospaceClient(name, organization, aircraftType, experienceYears, isCertified);
            clients.add(client);

            updateClientList();

            nameField.setText("");
            organizationField.setText("");
            aircraftTypeField.setText("");
            experienceSpinner.setValue(1);

            certificationGroup.clearSelection();

            JOptionPane.showMessageDialog(this, "Client details added successfully.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean validateName(String name) {
        if (name.isEmpty() || !name.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name with only alphabetic characters.",
                    "Invalid Name", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validateOrganization(String organization) {
        if (organization.isEmpty() || !organization.matches("[a-zA-Z0-9]+")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid organization name with alphanumeric characters.",
                    "Invalid Organization", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validateCertification() {
        if (!certifiedRadioButton.isSelected() && !notCertifiedRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select the certification status.", "Invalid Certification",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void viewClients() {
        StringBuilder clientList = new StringBuilder("Client List:\n");
        for (AerospaceClient client : clients) {
            clientList.append(client.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(this, clientList.toString(), "View Clients", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearClients() {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear the client list?",
                "Clear Clients", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            clients.clear();
            updateClientList();
        }
    }

    private void searchClient() {
        String searchName = JOptionPane.showInputDialog(this, "Enter the name of the client to search:");
        if (searchName != null) {
            boolean found = false;
            for (AerospaceClient client : clients) {
                if (client.name.equalsIgnoreCase(searchName)) {
                    JOptionPane.showMessageDialog(this, client.toString(), "Search Result",
                            JOptionPane.INFORMATION_MESSAGE);
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Client not found.", "Search Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void updateClientList() {
        clientListArea.setText("");
        for (AerospaceClient client : clients) {
            clientListArea.append(client.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AerospaceClientApp_Swing();
            }
        });
    }
}

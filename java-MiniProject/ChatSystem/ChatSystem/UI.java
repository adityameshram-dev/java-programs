import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class UI extends JFrame {

    public UI() {

        setTitle("Chat System");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        setLayout(new GridBagLayout());

        // Centre panel
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(360, 260));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        JLabel heading = new JLabel("Chat System");
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField name = new JTextField();
        name.setBorder(BorderFactory.createTitledBorder("Name"));

        JTextField port = new JTextField("5001");
        port.setBorder(BorderFactory.createTitledBorder("Port"));

        JLabel errorshow = new JLabel(" ");
        errorshow.setForeground(Color.RED);

        JTextField IP = new JTextField();
        IP.setBorder(BorderFactory.createTitledBorder("IP"));

        JButton connectBtn = new JButton("Connect");

        // Row 0 - Heading
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(heading, gbc);

        // Row 1 - IP Address (full width)
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        panel.add(IP, gbc);

        // Row 2 - Name + Port
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.6;
        panel.add(name, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.4;
        panel.add(port, gbc);

        // Row 3 - Button
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(connectBtn, gbc);

        // Row 4 - Error
        gbc.gridy = 4;
        panel.add(errorshow, gbc);

        add(panel);

        connectBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ip = IP.getText().trim();
                String username = name.getText().trim();
                String portText = port.getText().trim();

                if (ip.isEmpty() && username.isEmpty()) {
                    errorshow.setText("Enter Server IP and Username");
                } else if (ip.isEmpty()) {
                    errorshow.setText("Enter Server IP");
                } else if (username.isEmpty()) {
                    errorshow.setText("Enter Username");
                } else if (!portText.equals("5001")) {
                    errorshow.setText("Enter Valid Port Number");
                } else {
                    try {
                        Socket s = new Socket(ip, Integer.parseInt(portText));
                        dispose();
                        new chatUI(s, username);
                    } catch (Exception ex) {
                        errorshow.setText("Connection failed: " + ex.getMessage());
                    }
                }
            }
        });
        setVisible(true);
    }

    public class chatUI extends JFrame {

        public chatUI(Socket s, String username) throws Exception {
            setTitle("Chat");
            setSize(500, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            getContentPane().setBackground(Color.GRAY);
            setLayout(new BorderLayout());

            // Top - message display area
            JTextArea msgArea = new JTextArea();
            msgArea.setEditable(false);
            msgArea.setLineWrap(true);
            msgArea.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(msgArea);
            scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

            // Bottom - input + send button
            JPanel bottomPanel = new JPanel(new BorderLayout(8, 0));
            bottomPanel.setBackground(Color.GRAY);
            bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

            JTextField msgField = new JTextField();
            JButton sendBtn = new JButton("Send");

            bottomPanel.add(msgField, BorderLayout.CENTER);
            bottomPanel.add(sendBtn, BorderLayout.EAST);

            add(scrollPane, BorderLayout.CENTER);
            add(bottomPanel, BorderLayout.SOUTH);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            // Send on button click
            sendBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String msg = msgField.getText().trim();
                    try {
                        dos.writeUTF(username);
                        dos.writeUTF(msg);
                    } catch (Exception ex) {
                        msgArea.append("Error: " + ex.getMessage());
                    }
                    msgArea.append(username + " : " + msg + "\n");
                    msgField.setText("");
                }
            });

            // Send on Enter key
            msgField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sendBtn.doClick();
                }
            });

            new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            String username = dis.readUTF();
                            String msg = dis.readUTF();
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    msgArea.append(username + " : " + msg + "\n");
                                }
                            });
                        }
                    } catch (Exception ex) {
                        msgArea.append(ex.getMessage());
                    }
                }
            }).start();

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new UI();
    }
}
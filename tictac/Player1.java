package tictac;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player1 {

    private String iconName = "kk";
    private String buttonText = "1";
    public static String playerName1 = null;
    private String playMessage="Congratulations "+ playerName1 +"\n      You won !!!";



    public void checkWinner1(String name) {
        try {
            //***********************player1****************************************


            if (name.equals(iconName)) {
                if (TicTacToe.jb1.equals(buttonText)) {
                    if (TicTacToe.jb4.equals(buttonText)) {
                        if (TicTacToe.jb7.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb2.equals(buttonText)) {
                    if (TicTacToe.jb5.equals(buttonText)) {
                        if (TicTacToe.jb8.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb3.equals(buttonText)) {
                    if (TicTacToe.jb6.equals(buttonText)) {
                        if (TicTacToe.jb9.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb1.equals(buttonText)) {
                    if (TicTacToe.jb2.equals(buttonText)) {
                        if (TicTacToe.jb3.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb4.equals(buttonText)) {
                    if (TicTacToe.jb5.equals(buttonText)) {
                        if (TicTacToe.jb6.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb7.equals(buttonText)) {
                    if (TicTacToe.jb8.equals(buttonText)) {
                        if (TicTacToe.jb9.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb1.equals(buttonText)) {
                    if (TicTacToe.jb5.equals(buttonText)) {
                        if (TicTacToe.jb9.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


            if (name.equals(iconName)) {
                if (TicTacToe.jb3.equals(buttonText)) {
                    if (TicTacToe.jb5.equals(buttonText)) {
                        if (TicTacToe.jb7.equals(buttonText)) {
                            JOptionPane.showMessageDialog(null, playMessage);
                        }
                    }
                }
            }


        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {


    }


    public String getName(Icon icon) {
        String str = String.valueOf(icon);
        String iconName = null;
        Pattern p = Pattern.compile("(?<=\\bicon/\\b).*?(?=\\b.png\\b)");
        Matcher m = p.matcher(str);
        List<String> matches = new ArrayList<>();
        while (m.find()) {
            // matches.add(m.group());
            iconName = m.group();
        }
        return iconName;
    }
}







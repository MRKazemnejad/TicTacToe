package tictac;

import javax.swing.*;

public class Player2 {

    private String iconName = "trky";
    private String buttonText = "2";
    public static String playerName2 = null;
    private String playMessage="Congratulations "+ playerName2 +"\n      You won !!!";

    public void checkWinner2(String name) {
        try{
            //*************************************Player2**********************************
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



        }catch(Exception e){

        }
    }
}

import javax.swing.*;

public class Password {

    public static void main(String[] args) {

    //Variables
        String s = JOptionPane.showInputDialog(null, "Välj en bokstav");

        if (s.equals("a")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på A är " + "Anders, Alexander, Andreas, Axel, Arne, Anton, Adam, Ali, Arvid, Albin");
        }

        if (s.equals("b")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på B är " + "Bengt, Bo, Björn, Bertil, Börje, Bernt, Bror, Birger, Benjamin, Benny");
        }

        if (s.equals("c")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på C är " + "Carl, Christer, Christian, Claes, Christoffer, Conny, Charlie, Casper, Charles, Curt");
        }

        if (s.equals("d")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på D är " + "Daniel, David, Dan, Dennis, Dick, Douglas, Dag, Dante, Donald, Dragan");
        }

        if (s.equals("e")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på E är " + "Erik, Emil, Elias, Emanuel, Edvin, Evert, Einar, Ernst, Elliot, Edvard");
        }

        if (s.equals("f")) {
            JOptionPane.showMessageDialog(null, "Topp 10 populäraste manliga namn på F är " + "Fredrik, Filip, Folke, Felix, Frank, Frans, Fabian, Fred, Fritz, Ferdinand");
        }
    }
}

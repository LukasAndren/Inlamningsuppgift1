package inlamningsuppgift1;

import javax.swing.JOptionPane;

public class Inlamningsuppgift1 {

    public static void main(String[] args) {
        //Skapar en instans av Healthypets
        HealthyPets hotell = new HealthyPets();

        //Skapar instanser av de olika subklasserna till djur
        Djur sixten = new Hund(5000, "Sixten", "Hund");
        //Samt lägger in dessa i HealthyPets listan via metoden "checkaIn"
        hotell.checkaIn(sixten);

        Djur dogge = new Hund(10000, "Dogge", "Hund");
        hotell.checkaIn(dogge);

        Djur venus = new Katt(5000, "Venus", "Katt");
        hotell.checkaIn(venus);

        Djur ove = new Katt(3000, "Ove", "Katt");
        hotell.checkaIn(ove);

        Djur hypno = new Orm(1000, "Hypno", "Orm");
        hotell.checkaIn(hypno);

        //Skapar en sträng som tar emot vilket djur dietcoachen ska mata
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        try {
        //Skapar ett djur som är en kopia av djuret dietcoachen vill mata
        Djur tempDjur = hotell.getDjur(input);
                
        /*
         Skapar en sträng med det vad valda djuret heter, hur mycket (och av 
         vilken sorts) mat djuret ska med hjälp av metoden "getFoder".
         Inkapsling i form av "get"-metoderna och polymorfism
         */
        String svar = tempDjur.getArt() + "en " + tempDjur.getNamn()
                + " behöver " + tempDjur.getFoder(tempDjur) + "."; //POLYMORFISM

        //Skriver ut svaret
        JOptionPane.showMessageDialog(null, svar);
        
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Det djuret bor inte hos Healthy Pets");
        }

    }

}

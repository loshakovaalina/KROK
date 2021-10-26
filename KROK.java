
public class KROK{

    public static void main(String[] args) {

        songs[] s = new songs[3];
        s[0] = new songs("Markul", "Карусель");
        s[1] = new songs("Lil Nas X", "INDUSTRY BABY");
        s[2] = new songs("Offset", "Hit Em Hard");

        carrier cr = new carrier("D", s);

        playback executor = new playback("D", cr);
        executor.setCn(true);
        executor.play();
        executor.play();
        executor.play();
        executor.setCn(false);
    }
}
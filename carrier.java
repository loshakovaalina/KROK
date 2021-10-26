public class carrier {

    String crr;
    songs[] song;

    public carrier(String crr, songs []song){
        this.crr = crr;
        this.song = song;
    }

    public String toString(){
        return String.format("carrier: %s", this.crr);
    }
}
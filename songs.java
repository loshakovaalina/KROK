public class songs {

    String executor;
    String song;

    public songs(String executor, String song){
        this.executor = executor;
        this.song = song;
    }

    public String toString(){
        return String.format("Исполнитель: %s\nНазвание песни: %s", this.executor, this.song);
    }
}
public class playback{

    String name;
    private int count = 0;

    carrier cr;

    public playback(String player, carrier cr){
        this.name = player;
        this.cr = cr;
    }

    boolean cn = false;

    public void setCn(boolean cn){
        this.cn = cn;
    }

    public void play(){
        if (!this.cr.crr.equals(this.name)){
            System.out.println("Ошибка\n");
        } else {
            if (this.count == this.cr.song.length){
                this.count = 0;
            }
            System.out.println("Сейчас играет: \n" + this.cr.song[this.count] + "\n");
            this.count++;
        }
    }
}
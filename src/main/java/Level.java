import java.util.ArrayList;

public class Level {
    private ArrayList<ArrayList<Field>> levelArray;
    public Level(int width){
        this.levelArray = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            this.levelArray.add(new ArrayList<>());
            for (int j = 0; j < width; j++) {
                this.levelArray.get(i).add(new Field());
            }
        }
    }

    public ArrayList<ArrayList<Field>> getLevelArray() {
        return levelArray;
    }

    public void incrementValue(int i, int j){
        levelArray.get(i).get(j).increment();
    }
}

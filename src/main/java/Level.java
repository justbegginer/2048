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
        if (i >= levelArray.size() || j >= levelArray.size() ||
        i < 0 || j < 0)
            throw new WrongFieldException(i, j);
        levelArray.get(i).get(j).increment();
    }
    public Field getValue(int i, int j){
        return levelArray.get(i).get(j);
    }
    public void makeNull(int i, int j){
        levelArray.get(i).get(j).makeNull();
    }
}

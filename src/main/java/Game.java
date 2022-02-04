import java.util.Scanner;

public class Game {
    private Level level;
    private int score;
    public Game(int width){
        this.level = new Level(width);
        createRandom();
        createRandom();
    }
    public void start(){
    }
    public Level getLevel(){
        return this.level;
    }
    private void createRandom(){
        this.level.incrementValue((int)(Math.random() * 1_000_000) % level.getLevelArray().size(),
                (int)(Math.random() * 1_000_000) % level.getLevelArray().size());
    }
    private void draw(){
        String buffer = "";
        for (int j = 0; j < this.level.getLevelArray().size()*5+this.level.getLevelArray().size()+1; j++) {
            buffer+="-";
        }
        for(int i = 0; i < this.level.getLevelArray().size(); i++){
            for (int j = 0; j < this.level.getLevelArray().size(); j++) {
                int maxSum = 5 - Integer.toString(level.getValue(i, j).getValue()).length();
                buffer += "|";
                for (int k = 0; k < maxSum; k++) {
                    buffer += " ";
                }
                if (this.level.getValue(i,j).getValue() == 1){
                    buffer+=" ";
                }
                else {
                    buffer += Integer.toString(level.getValue(i, j).getValue());
                }
                buffer+= "|";
            }
            buffer+="\n";
            for (int j = 0; j < this.level.getLevelArray().size()*5+this.level.getLevelArray().size()+1; j++) {
                buffer+="-";
            }
            buffer+="\n";
        }
    }
    private void moveRight(){

    }
    private void moveLeft(){

    }
    private void moveDown(){

    }
    private void moveUp(){

    }
    private boolean isDefeat(){
        for(int i = 0; i < this.level.getLevelArray().size(); i++){
            for (int j = 0; j < this.level.getLevelArray().size(); j++) {
                if(level.getValue(i, j).getValue() == 1){
                    return true;
                }
            }
        }
        return true;
    }
}

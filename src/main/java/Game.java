public class Game {
    private Level level;
    private int score;
    public Game(int width){
        this.level = new Level(width);
        createRandom();
        createRandom();
    }
    public void start(){
        while(isDefeat()){
        }
    }
    private void createRandom(){
        this.level.incrementValue((int)(Math.random() * 1_000_000) % level.getLevelArray().size(),
                (int)(Math.random() * 1_000_000) % level.getLevelArray().size());
    }
    private void draw(){
        
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
        return false;
    }
}

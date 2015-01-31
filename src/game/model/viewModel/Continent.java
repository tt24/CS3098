package game.model.viewModel;


public class Continent {
    private int id;
    private String colour;
    
    public Continent(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }
    
    public int getId() {
        return id;
    }
    
    public String getColour() {
        return colour;
    }
}
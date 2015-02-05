package game.model.viewModel;

public class Map {
    private Continent[] continents; 
    
    public Map(Continent[] continents) {
    	this.continents = continents;
    }
    
    public Continent[] getContinents() {
    	return continents;
    }
}
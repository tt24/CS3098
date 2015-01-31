package game.model.viewModel;

public class Territory {
    private int id;
    private int continentId;
    
    public Territory(int id, int continentId) {
        this.id = id;
        this.continentId = continentId;
    }
    
    public int getId() {
        return id;
    }
    
    public int getContinentId() {
        return continentId;
    }
}

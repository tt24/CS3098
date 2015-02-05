package game.model.viewModel;

public class Territory {
    private int id;
    private int continentId;
    private int[] neighboursId;
    
    public Territory(int id, int continentId, int...neighboursId) {
        this.id = id;
        this.continentId = continentId;
        this.neighboursId = neighboursId;
    }
    
    public int getId() {
        return id;
    }
    
    public int getContinentId() {
        return continentId;
    }
    
    public int[] getNeighboursId() {
    	return neighboursId;
    }
}

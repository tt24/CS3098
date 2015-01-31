package game.model.viewModel;

public class Card {
    private int id;
    private int territoryId;
    private ArmyPiece type;
    private boolean wild;
    
    public Card(int id, int territoryId, ArmyPiece type, boolean wild) {
        this.id = id;
        this.territoryId = territoryId;
        this.type = type;
        this.wild = wild;
    }
    
    public int getId() {
        return id;
    }
    
    public int getTerritoryId() {
        return territoryId;
    }
    
    public ArmyPiece getType() {
        return type;
    }
    
    public boolean getWild() {
        return wild;
    }
}
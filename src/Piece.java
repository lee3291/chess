public abstract class Piece {
    private String name; // E4P, D4P, B1K... each unique position and name. P for Pawn, K for Knight.
    private String type; // pawn, knight...
    private String color; // Black or White
    private String currentPosition;

    public Piece(String name, String type, String color, String currentPosition) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }
}

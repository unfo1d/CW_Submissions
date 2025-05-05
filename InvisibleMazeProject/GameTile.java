public class GameTile {
    boolean hasPlayer;
    boolean isRevealed;
    boolean isWall;

    public GameTile() {
        hasPlayer = false;
        isRevealed = false;
        isWall = false;
    }

    public boolean hasPlayer() {
        return hasPlayer;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public boolean isWall() {
        return isWall;
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }

    public void setIsRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }

    public void setIsWall(boolean isWall) {
        this.isWall = isWall;
    }

    public String toString() {
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001b[36;1m";
  

        if (!isRevealed) {
            return "   ";
        } else if (hasPlayer) {
            return BLUE + "𖨆" + RESET;
        } else if (isWall) {
            return RED + " XX" + RESET;
        } else {
            return GREEN + " OO" + RESET;
        }
    }
}

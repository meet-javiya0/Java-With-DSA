public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, left, Right, Diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, ,left, Right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, ,left, Right,Diagonal - (By 1 step only)");
    }
}
package testdome;

public class ChainLink {
    private ChainLink left, right;

    public void append(ChainLink rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }

    public Side longerSide() {
        int countLeft = 0, countRight = 0;

        ChainLink left = this.left;
        while (left != null) {
            countLeft++;
            left = left.left;
        }

        ChainLink right = this.right;
        while (right != null) {
            countRight++;
            right = right.right;
        }

        if(countLeft > countRight) {
            return Side.LEFT;
        } else if(countRight > countLeft){
            return Side.RIGHT;
        } else{
            return Side.NONE;
        }
    }

    public static void main(String[] args) {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();

        left.append(middle);
        middle.append(right);

        System.out.println(left.longerSide());
    }

    enum Side { NONE, LEFT, RIGHT }
}

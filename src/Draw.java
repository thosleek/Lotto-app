public class Draw {

    public int drawId;
    public int[] drawNumbers;


    public int getDrawId() {
        return drawId;
    }

    public void setDrawId(int drawId) {
        this.drawId = drawId;
    }

    public int[] getDrawNumbers() {
        return drawNumbers;
    }

    public void setDrawNumbers(int[] drawNumbers) {
        this.drawNumbers = drawNumbers;
    }

    public Draw(int drawId, int[] drawNumbers) {
        this.drawId = drawId;
        this.drawNumbers = drawNumbers;
    }

    public Draw(int[] drawNumbers) {

        this.drawNumbers = drawNumbers;
        this.drawId = this.newDrawId();
    }

    public void display(){
        System.out.println("Draw id: " + drawId);
        System.out.print("Numbers drown:");
        for(int number: drawNumbers){
            System.out.print(" " + number);
        }
    }

    public int newDrawId(){
        int drawId = 101;
        //TODO: checks files, looks for highest no, returns new draw id
        return drawId;
    }
}

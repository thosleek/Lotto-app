public class DrawMachine {
    int quantity, range;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public DrawMachine(int quantity, int range) {
        this.quantity = quantity;
        this.range = range;
    }

    private int[] drawNumbers(){
        int[] numbers;
        //TODO:  draw unique <quantity> numbers from 1 to <range>
        numbers = new int[] {2,55,33,22,11};
        numbers[0] = this.getQuantity();
        numbers[4] = this.getRange();

        return numbers;
    }

    public static void main(String[] args){

        DrawMachine drawMachine = new DrawMachine(5,40);
        int[] numbers;
        numbers = drawMachine.drawNumbers();

        Draw todayDraw = new Draw(numbers);
        todayDraw.setDrawId(todayDraw.newDrawId());

        todayDraw.display();
    }
}

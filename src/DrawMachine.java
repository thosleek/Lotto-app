import java.util.Arrays;
import java.io.File;

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
        // TODO: break(?) constructor when inputs no-good
        if(range >= quantity){
            this.quantity = quantity;
            this.range = range;
        } else { System.out.println("Unable to draw: check quantity and range"); }

    }

    private int[] drawNumbers(){
        int numbersQuantityToDraw = this.getQuantity();
        int numbersRangeToDraw = this.getRange();
        int[] numbersDrawn = new int[numbersQuantityToDraw];


        int numbersAlreadyDrawn = 0;
        int tempNumber;
        while(numbersAlreadyDrawn < numbersQuantityToDraw){
            tempNumber = (int) ((Math.random() * (numbersRangeToDraw)) + 1);
            if(numbersAlreadyDrawn == 0){
                numbersAlreadyDrawn = 1;
                numbersDrawn[0] = tempNumber;
            } else {
                for(int i = 0; i < numbersAlreadyDrawn; i++){ // look for doubles
                    if(numbersDrawn[i] == tempNumber){
                        break;
                    } else if(i == numbersAlreadyDrawn - 1) { // all checks, no doubles, add number to array
                        numbersDrawn[numbersAlreadyDrawn] = tempNumber;
                        numbersAlreadyDrawn++;
                    }
                }
            }
        }

        Arrays.sort(numbersDrawn);
        return numbersDrawn;
    }

    public static void main(String[] args){

        DrawMachine drawMachine = new DrawMachine(6,46);
        int[] numbers;
        numbers = drawMachine.drawNumbers();

        Draw todayDraw = new Draw(numbers);
        //todayDraw.setDrawId(todayDraw.newDrawId());

        todayDraw.display();
    }
}

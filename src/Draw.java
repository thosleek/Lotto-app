import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

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

    /*public Draw(int drawId) {
        this.drawId = drawId;
        // TODO: za chuj nie dziala, good luck dude

        try {
            String fileName = Integer.toString(drawId) + ".txt";
            Scanner loadDraw = new Scanner(new File(fileName)).useDelimiter(",\\s*");
            List<Integer> temps = new ArrayList<Integer>();

            while(loadDraw.hasNext()){
                int token1 = loadDraw.nextInt();
                temps.add(token1);
            }
            loadDraw.close();
            this.drawNumbers = temps.toArray(new Integer[0]);

        } catch (IOException e){
            System.out.println("no file");
        }
    }*/

    public void display(){
        System.out.println("Draw id: " + this.getDrawId());
        System.out.print("Numbers drawn:");
        for(int number: this.getDrawNumbers()){
            System.out.print(" " + number);
        }
    }

    public int newDrawId(){
        int drawId = 1000; // first draw ever
        //TODO: checks files, looks for highest no, returns new draw id
       boolean gotDrawId = false;
        while(!gotDrawId){
            String fileName = "draws/" + Integer.toString(drawId) + ".txt";
            File file = new File(fileName);
            if(file.exists()){
                drawId++;
            } else gotDrawId = true;
        }
        return drawId;
    }
}

public class LotteryTicket {
    public int[][] ticketNumbers;
    public int ticketDrawId, ticketLines;

    public int[][] getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(int[][] ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }

    public int getTicketDrawId() {
        return ticketDrawId;
    }

    public void setTicketDrawId(int ticketDrawId) {
        this.ticketDrawId = ticketDrawId;
    }

    public int getTicketLines() {
        return ticketLines;
    }

    public void setTicketLines(int ticketLines) {
        this.ticketLines = ticketLines;
    }

    public LotteryTicket(int[][] ticketNumbers, int ticketDrawId, int ticketLines) {
        this.ticketNumbers = ticketNumbers;
        this.ticketDrawId = ticketDrawId;
        this.ticketLines = ticketLines;
    }
}

package Interface.Rental;

import java.util.Date;

public class CarRental {

    private Date start;
    private Date finish;

    public CarRental() {
    }

    public CarRental(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

}

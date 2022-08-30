import java.text.MessageFormat;

public class Sortie {
    public String tailNumber, deviation;
    public int lineNumber, scheduledDepart, actualDepart, scheduledArrival, actualArrival;

    public Sortie(){

    }

    public Sortie(String tailNumber, int lineNumber, int scheduledDepart, int actualDepart, int scheduledArrival, int actualArrival){
        this.tailNumber = tailNumber;
        this.lineNumber = lineNumber;
        this.scheduledDepart = scheduledDepart;
        this.actualDepart = actualDepart;
        this. scheduledArrival = scheduledArrival;
        this.actualArrival = actualArrival;
        this.deviation = null;
    }
    public Sortie(String tailNumber, int lineNumber, int scheduledDepart, int actualDepart, int scheduledArrival, int actualArrival, String deviation){
        this.tailNumber = tailNumber;
        this.lineNumber = lineNumber;
        this.scheduledDepart = scheduledDepart;
        this.actualDepart = actualDepart;
        this. scheduledArrival = scheduledArrival;
        this.actualArrival = actualArrival;
        this.deviation = deviation;
    }

    public boolean isDeviation(){
        int arrivalTimeDifference = Math.abs(actualArrival - scheduledArrival);
        int departTimeDifference = Math.abs(actualDepart - scheduledDepart);

        if (arrivalTimeDifference > 30){
            return true;
        }else if(departTimeDifference > 30){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String retString = MessageFormat.format("Tail No. {0} is scheduled to depart at {1}", this.tailNumber,this.scheduledDepart);
        return retString;
    }
}

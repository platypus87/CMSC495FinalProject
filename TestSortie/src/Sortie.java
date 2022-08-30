import java.text.MessageFormat;

public class Sortie {
    public String tailNumber, deviationReason;
    public int lineNumber, scheduledDepart, actualDepart, scheduledArrival, actualArrival;
    public boolean deviation;

    public Sortie(){

    }

    public Sortie(String tailNumber, int lineNumber, int scheduledDepart, int actualDepart, int scheduledArrival, int actualArrival){
        this.tailNumber = tailNumber;
        this.lineNumber = lineNumber;
        this.scheduledDepart = scheduledDepart;
        this.actualDepart = actualDepart;
        this. scheduledArrival = scheduledArrival;
        this.actualArrival = actualArrival;
        this.deviationReason = null;
    }
    public Sortie(String tailNumber, int lineNumber, int scheduledDepart, int actualDepart, int scheduledArrival, int actualArrival, String deviationReason){
        this.tailNumber = tailNumber;
        this.lineNumber = lineNumber;
        this.scheduledDepart = scheduledDepart;
        this.actualDepart = actualDepart;
        this. scheduledArrival = scheduledArrival;
        this.actualArrival = actualArrival;
        this.deviationReason = deviationReason;
    }

    public boolean isDeviation(){
        int arrivalTimeDifference = Math.abs(actualArrival - scheduledArrival);
        int departTimeDifference = Math.abs(actualDepart - scheduledDepart);

        System.out.println(arrivalTimeDifference);
        System.out.println(departTimeDifference);

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

package Sorties;

/**
 * This class will define 'Sortie' object
 * Contains all data pertinent to a Sortie
 *
 */
public class Sortie {
	private String identifier;	//Identifier could be tail number of aircraft, etc.
	private String destination;	//Destination could be country name or airport code e.g. LAX, DAL
	private int depDate;		//Departure date, possibly military date format YYYYMMDD
	private int depTime;		//Four digit military time
	private int arrDate;		//Same fields for arrival information
	private int arrTime;		//Julian time, eg. YYdddHHMM - 222151933
								//Julian time might not be available
								//MATH.Abs(departure - arrival) OR MATH.Abs(arrival - departure)
	private int crewSize;		//Enter as a Soft Goal
	private String cargo;		//This will be a long string, may be better ways to handle this
								//Probably do NOT need cargo
								//Enter as Soft Goal

	private int arrivalDate; //when initialized in text box, specify use of Julian number day
							//eg for Aug 29, 2022 = 22241 (YY = 22, DDD = 241)

	private int schedArrivalDate; //when initialized in text box, specify use of Julian number day
							//eg for Aug 29, 2022 = 22241 (YY = 22, DDD = 241)

	private int arrivalTime; //when initialized in text box, specify military time
							// eg for 7:30 pm = 1930

	private int schedArrivalTime; //when initialized in text box, specify military time
							// eg for 7:30 pm = 1930
	
	
	public Sortie() {
		//The default sortie constructor
		identifier = "80301";
		destination = "None provided";
		depDate = 19990101;
		depTime = 0001;
		arrDate = 19990101;
		arrTime = 0001;
		crewSize = 0;
		cargo = "No cargo information provided.";
	}

	public void Sortie(String tailNo, int line, int departTime, int actualDepartTime, int arrivalTime, int  ){

	}
	
	//Get methods for this class
	public void setIdentifier(String id) {
		this.identifier = id;
	}
	//TODO Include set methods for remaining fields

	
	public String getIdentifier() {
		return identifier;
	}
	//TODO Include get methods for remaining fields
}

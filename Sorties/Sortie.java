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
	private int arrTime;		
	private int crewSize;		
	private String cargo;		//This will be a long string, may be better ways to handle this
	
	
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

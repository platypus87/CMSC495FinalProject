package Sorties;

/**
 * This class will define 'Sortie' object Contains all data pertinent to a
 * Sortie
 *
 */
public class Sortie {
	private int line; // 3 digit line number
	private String tailNo; // Tail number of aircraft
	private String destination; // Destination could be country name or airport code e.g. LAX, DAL
	private int depDate; // Departure date military date format YYDDD
	private int depTime; // Four digit 24h time HHMM
	private int arrDate; // Same fields for arrival information
	private int arrTime;
	private int depFinDate; // Fields for finalized arrival & departure date & time
	private int depFinTime;
	private int arrFinDate;
	private int arrFinTime;
	private int depDiscrepancy; // Fields for discrepancy between planned and actual departure/arrival
	private int arrDiscrepancy;
	private int crewSize;
	private String notes; // This will be a long string allows for misc. notes about sortie
	private String depDisNote; // Fields for notes on time discrepancies, required if discrepancy > 30 minutes

	/**
	 * public Sortie() { // The default sortie constructor try { setLine(911);
	 * setTailNo("80301"); setDestination("None provided"); setDepDate(99001);
	 * setDepTime(0001); setArrDate(99001); setArrTime(0001); setCrewSize(0);
	 * setNotes("No notes provided."); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */

	// Get/Set methods for this class

	public int getLine() {
		return line;
	}

	public void setLine(int line) throws Exception {
		int ln = String.valueOf(line).length();
		if (ln == 3) {
			this.line = line;
		} else {
			throw new Exception("Invalid Line, must be 3-digit integer.");
		}

	}

	public String getTailNo() {
		return tailNo;
	}

	public void setTailNo(String tailNo) {
		this.tailNo = tailNo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDepDate() {
		return depDate;
	}

	public void setDepDate(int depDate) {
		this.depDate = depDate;
	}

	public int getDepTime() {
		return depTime;
	}

	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}

	public int getArrDate() {
		return arrDate;
	}

	public void setArrDate(int arrDate) {
		this.arrDate = arrDate;
	}

	public int getArrTime() {
		return arrTime;
	}

	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}

	public int getDepFinDate() {
		return depFinDate;
	}

	public void setDepFinDate(int depFinDate) {
		this.depFinDate = depFinDate;
	}

	public int getDepFinTime() {
		return depFinTime;
	}

	public void setDepFinTime(int depFinTime) {
		this.depFinTime = depFinTime;
	}

	public int getArrFinDate() {
		return arrFinDate;
	}

	public void setArrFinDate(int arrFinDate) {
		this.arrFinDate = arrFinDate;
	}

	public int getArrFinTime() {
		return arrFinTime;
	}

	public void setArrFinTime(int arrFinTime) {
		this.arrFinTime = arrFinTime;
	}

	public int getDepDiscrepancy() {
		return depDiscrepancy;
	}

	public void setDepDiscrepancy(int depDiscrepancy) {
		this.depDiscrepancy = depDiscrepancy;
	}

	public int getArrDiscrepancy() {
		return arrDiscrepancy;
	}

	public void setArrDiscrepancy(int arrDiscrepancy) {
		this.arrDiscrepancy = arrDiscrepancy;
	}

	public int getCrewSize() {
		return crewSize;
	}

	public void setCrewSize(int crewSize) {
		this.crewSize = crewSize;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDepDisNote() {
		return depDisNote;
	}

	public void setDepDisNote(String depDisNote) {
		this.depDisNote = depDisNote;
	}

	public void printSortie() {
		System.out.println("-------SORTIE-------");
		System.out.println("Line: " + getLine());
		System.out.println("Tail Number: " + getTailNo());
		System.out.println("Destination: " + getDestination());
		System.out.println("Departure: " + getDepDate() + " " + getDepTime());
		System.out.println("Arrival: " + getArrDate() + " " + getArrTime());
		System.out.println("Actual Departure: " + getDepFinDate() + " " + getDepFinTime());
		System.out.println("Actual Arrival: " + getArrFinDate() + " " + getArrFinTime());
		System.out.println("Crew Size: " + getCrewSize());
		System.out.println("Notes: " + getNotes());
	}

}

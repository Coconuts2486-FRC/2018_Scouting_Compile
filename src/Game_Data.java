
public class Game_Data implements java.io.Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 2486;
int teamNumber;
int roundNumber;
//Auto---------------------------------------------------------------------------------
//int Auto_blocksInVault;
int Auto_blocksInSwitch;
int Auto_blocksInScale;

boolean Auto_crossedLine;
String Auto_comments;
//Teleop---------------------------------------------------------------------------------
int Teleop_blocksInVault;
int Teleop_blocksInSwitch;
int Teleop_blocksInScale;
int Teleop_blocksInOppositeScale;

boolean Teleop_climbed;
String Teleop_comments;
//General---------------------------------------------------------------------------------
boolean redFlag;
boolean yellowFlag;

boolean mechanum;
boolean swerve;
boolean westCoast;
}

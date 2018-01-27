import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class CSV {
	
	public void WriteToFile(){

		WriteToFile(System.getProperty("user.dir") + "//"+"Scout Data2"+"/Compiled Data"+".csv", true);
	}
	
	public void WriteToFile(String directory, Boolean columnHeaders){
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(directory));
			//
			if(columnHeaders){
				out.write("\"Team Number\",\"Round Number\",\"Teleop Vault\",\"Teleop Switch\",\"Teleop Scale\",\"Teleop Climbed\",\"Teleop Opposite Switch\",\"Teleop Comments\",\"Auto Switch\",\"Auto Scale\",\"Auto Crossed Line\",\"Auto Comments\",\"Red Flag\",\"Yellow Flag\",\"Mecanum Drive\",\"Swerve Drive\",\"West Coast Drive\"");
			}
			for(int i = 0; i <= Game_Array.GameList.size() - 1; i++){
				out.write("\n" + String.format("%1s,%2s,%3s,%4s,%5s,%6s,%7s,%8s,%9s,%10s,%11s,%12s,%13s,%14s,%15s,%16s,%17s", Game_Array.GameList.get(i).teamNumber,Game_Array.GameList.get(i).roundNumber,Game_Array.GameList.get(i).Teleop_blocksInVault,Game_Array.GameList.get(i).Teleop_blocksInSwitch,Game_Array.GameList.get(i).Teleop_blocksInScale,Game_Array.GameList.get(i).Teleop_climbed,Game_Array.GameList.get(i).Teleop_blocksInOppositeScale,Game_Array.GameList.get(i).Teleop_comments,Game_Array.GameList.get(i).Auto_blocksInSwitch,Game_Array.GameList.get(i).Auto_blocksInScale,Game_Array.GameList.get(i).Auto_crossedLine,Game_Array.GameList.get(i).Auto_comments,Game_Array.GameList.get(i).redFlag,Game_Array.GameList.get(i).yellowFlag,Game_Array.GameList.get(i).mechanum,Game_Array.GameList.get(i).swerve,Game_Array.GameList.get(i).westCoast));
			}
			out.close();
		}
		catch(IOException ex) { System.out.println(ex.getMessage()); }
	}
}

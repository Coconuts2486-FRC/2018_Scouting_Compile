import java.io.File;
import java.util.ArrayList;

public class MainS {

	public static void main(String[] args) {
	Deserelization d = new Deserelization();
	d.FileGetters();
	d.Deserelize();
	CSV c = new CSV();
	c.WriteToFile();

}

}

package catchnest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class BotSite {

class Nordstrom {
	public void BotNordstrom() {
		System.out.println("We're botting nordstrom.com");
		
	 }
	}
	class FNL {
	public void BotFinishline() {
		System.out.println("We're botting either finishline/jdsports (.com)");
		
	}
}

 class Nike {
	public void BotNike() {
		System.out.println("We're botting nike.com");
		
	}
}

class Foots {
	public void BotFootsites() {
		System.out.println("We're botting either footlocker/eastbay/champssports/footaction (.com)");
		
	}
}

class Hibbett {
	public void BotHibbett() {
		System.out.println("We're botting hibbett.com");
		
	}
}

class Sniper {
	public void BotSnipes() {
		System.out.println("We're botting snipesusa.com");
		
	}
 }
}


public class Bot {
	
	public static void main(String[] args) throws IOException {
		final String BOTNAME = "berrybot";
	    BotSite bot = new BotSite();
		String tempdata;
		String file = "/Users/berrykix/eclipse-workspace/catchnest/src/catchnest/checkoutdata.txt";
		String cdata;
		Scanner getinput = new Scanner(System.in);
		
	   System.out.println("Starting up the bot "+BOTNAME.toUpperCase());
	   System.out.println("Lets open the file "+file+" to get checkout data");
	   
	   try {
			FileReader rf = new FileReader(file);
			Scanner readfile = new Scanner(rf);
            // hope you followed documentation and only had one line in file
			cdata = readfile.nextLine();
			System.out.println("CHECKOUT DATA: "+cdata);
			rf.close();
			readfile.close();
			
	   } catch(FileNotFoundException e) {
		   e.printStackTrace();
		   System.exit(1);
	   }
	   
	   System.out.print("Now what site are we botting? ");
     
	   tempdata = getinput.nextLine();
	   
	   switch (tempdata.toLowerCase()) {
	   
	   case "hibbett":
		BotSite.Hibbett botobj1 = bot.new Hibbett();
		botobj1.BotHibbett();
		break;
	   
	   case "nike":
		   BotSite.Nike botobj2 = bot.new Nike();
			botobj2.BotNike();
		break;
		
	   case "fnl":
		   BotSite.FNL botobj3 = bot.new FNL();
			botobj3.BotFinishline();
		 break;
		 
	   case "foots":
		   BotSite.Foots botobj = bot.new Foots();
			botobj.BotFootsites();
		 break;
	   
		 default:
			 System.out.println("Looks like we're not botting any websites..");
			 System.exit(1);
	   }
	    

	}

}

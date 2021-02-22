package encapsulation;

public class BotInformation implements SomeInterface {
	 private String botName;
	 private String botAuthor;
	 private String botDOB;
	 private int copies;
     private boolean mesh;
     private boolean nike;
     private boolean foots;
     private boolean retail;
     
     
	 public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}
	public String getBotAuthor() {
		return botAuthor;
	}
	public void setBotAuthor(String botAuthor) {
		this.botAuthor = botAuthor;
	}
	public String getBotDOB() {
		return botDOB;
	}
	public void setBotDOB(String botDOB) {
		this.botDOB = botDOB;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void setMesh(boolean mesh) {
		this.mesh = mesh;
	}

	public void setNike(boolean nike) {
		this.nike = nike;
	}

	public void setFoots(boolean foots) {
		this.foots = foots;
	}

	public void setRetail(boolean retail) {
		this.retail = retail;
	}

	public void supportNike() {
     System.out.print("--This bot ");
     
      if(nike == true) {
        System.out.print("does");
      } else {
    	 System.out.print("doesnt");
      }
        System.out.println(" support Nike");
		}

	public void supportFoots() {
	     System.out.print("--This bot ");
	     
	      if(foots == true) {
	        System.out.print("does");
	      } else {
	    	 System.out.print("doesnt");
	      }
	        System.out.println(" support Footlocker and co");
		
	}
	public void supportRetail() {
	     System.out.print("--This bot ");
	     
	      if(retail == true) {
	        System.out.print("does");
	      } else {
	    	 System.out.print("doesnt");
	      }
	        System.out.println(" support Target/Amazon/Walmart");
		
	}

	public void supportMesh() {
	     System.out.print("--This bot ");
	     
	      if(mesh == true) {
	        System.out.print("does");
	      } else {
	    	 System.out.print("doesnt");
	      }
	        System.out.println(" support Footpatrol and co");
		
	}
	 
}

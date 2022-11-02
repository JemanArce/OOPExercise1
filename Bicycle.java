public class Bicycle  {

		private String ownerName;
		private String tagNo;
		private String id;
		
		public Bicycle () {
			ownerName = "Unassigned.";
			id = "XXX - XXX";
			tagNo = "Unknown";
			

		}
	
		public String getOwnerName () {
			return ownerName;

		}

		public void getOwnerName (String name) {
			ownerName = name ;
		}
		public void setOwnerName(String name){
			
		}
		public String getTagNo(){
			return tagNo;
		}
		public void setTagNo(String tag)
{
tagNo = tag; 
}
public void settaggNo(String tag)
{
	tagNo = tag;
}
public Bicycle(String tagNo, String name){
	 id = tagNo;
	 ownerName = name;
	 }
}
	 

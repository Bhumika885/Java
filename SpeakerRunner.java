class SpeakerRunner{
	
public static void main(String[] args) {
       
        Speaker speaker1 = new Speaker("Sony", 23, 30000, "Good");
		System.out.println("brandname:"+speaker1.brand);
		System.out.println("brandsize:"+speaker1.size);
		System.out.println("brandcost:"+speaker1.cost);
		System.out.println("brandoutput:"+speaker1.output);
		
		
        
		Speaker speaker2 = new Speaker("Bose", 20, 25000, "Excellent");
		System.out.println("brandname:"+speaker2.brand);
		System.out.println("brandsize:"+speaker2.size);
		System.out.println("brandcost:"+speaker2.cost);
		System.out.println("brandoutput:"+speaker2.output);
		
		
		
		Speaker speaker3 = new Speaker("JBL", 25, 20000, "Average");
		System.out.println("brandname:"+speaker3.brand);
		System.out.println("brandsize:"+speaker3.size);
		System.out.println("brandcost:"+speaker3.cost);
		System.out.println("brandoutput:"+speaker3.output);
          

    }
}


public class ComparePerformance {
	
	    public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Javaprograms");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Thoutam is writting a big program");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Javaprograms");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Thoutam is writting a big program");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
	}  



import java.util.Arrays;

class Movie {
	
    public static void main(String[] args) {
    	
    	String[] filmTitles ={
    		"Indiana Jones and the Kingdom of the Crystal Skull",
    		"Indiana Jones and the Last Crusade",
    		"Indiana Jones and the Temple of Doom"
    	};
    	
    	String[][] actors ={
    		{"Harrison Ford", "Cate Blanchett", "Meziani Isma�l"},
    		{"Harrison Ford", "Sean Connery", "Meziani Isma�l"},
    		{"Harrison Ford", "Kate Capshaw", "Meziani Isma�l Again !"},
    	};
    	

      for (int i = 0; i < filmTitles.length; i++){
    	  	System.out.println("In the movie "+ filmTitles[i] + ", the principals actors are : ");
        
      for (int j = 0; j < actors[i].length; j++){
            System.out.println("-" + actors[i][j]);}  
      };
      

    }
}


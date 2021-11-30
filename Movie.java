import java.util.Arrays;

public class Movie {
public static void main(String[] args) {
		
	String[] filmTitles = {"Le Royaume du Crâne de Cristal", "La Dernière Croisade","Le Temple maudit"};
	String[] principalActors = {"Harrison Ford & Cate Blanchett","Harrison Ford & Sean Connery","Harrison Ford & Kate Capshaw"};
    
	String[][] movies;
	
	movies = new String[][] {filmTitles, principalActors};
	
	for (int i = 0; i < filmTitles.length; i++) {
		System.out.println("The film Title is : " + filmTitles[i] + " and the principal actors are : " + principalActors[i]);
        }
      
}
}
	
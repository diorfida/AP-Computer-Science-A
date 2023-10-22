
/**
 * Write a description of class MovieTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTesterV2
{
    public static void printMovies(MovieV2[] movies)
    {
        for(MovieV2 movie : movies){
            System.out.println(movie);
        }
    }
    
    public static void sortByTitle(MovieV2[] source, int order)
    {
        int i;
        int k;
        int posMax;
        MovieV2 temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if(order == 1){
                    if ( source[k].getTitle().compareTo(source[posMax].getTitle()) > 0 ){
                        posMax = k;
                    }
                }else{
                    if ( source[k].getTitle().compareTo(source[posMax].getTitle()) < 0 ){
                        posMax = k;
                    }
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax];
            source[ posMax ] = temp;
        }
    }
    
    public static void sortByYear(MovieV2[] source, int order)
    {
        int i;
        int k;
        int posMax;
        MovieV2 temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if(order == 1){
                    if ( source[k].getYear() > source[posMax].getYear() ){
                        posMax = k;
                    }
                }else{
                    if ( source[k].getYear() < source[posMax].getYear() ){
                        posMax = k;
                    }
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax];
            source[ posMax ] = temp;
        }
    }
    
    public static void sortByStudio(MovieV2[] source, int order)
    {
        int i;
        int k;
        int posMax;
        MovieV2 temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if(order == 1){
                    if ( source[k].getStudio().compareTo(source[posMax].getStudio()) > 0 ){
                        posMax = k;
                    }
                }else{
                    if ( source[k].getStudio().compareTo(source[posMax].getStudio()) < 0 ){
                        posMax = k;
                    }
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax];
            source[ posMax ] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        MovieV2[] movies = new MovieV2[10];
        movies[0] = new MovieV2("Harry Potter", 2001, "Universal");
        movies[1] = new MovieV2("The Witches", 2020, "HBO");
        movies[2] = new MovieV2("Soul", 2020, "Disney Pixar");
        movies[3] = new MovieV2("My Girl", 1991, "Tubi");
        movies[4] = new MovieV2("The Karate Kid", 1984, "Prime");
        movies[5] = new MovieV2("Spirited Away", 2001, "HBO");
        movies[6] = new MovieV2("Hidden Figures", 2016, "Disney");
        movies[7] = new MovieV2("The Goonies", 1985, "HBO");
        movies[8] = new MovieV2("The Greatest Showman", 2017, "Disney");
        movies[9] = new MovieV2("Hook", 1991, "Netflix");
        
        System.out.println("Original Movies Array:\n");
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Title >>\n");
        sortByTitle(movies, 1);
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Title Reverse Order >>\n");
        sortByTitle(movies, 2);
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Year >>\n");
        sortByYear(movies, 1);
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Year Reverse Order >>\n");
        sortByYear(movies, 2);
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Studio >>\n");
        sortByStudio(movies, 1);
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Studio Reverse Order >>\n");
        sortByStudio(movies, 2);
        printMovies(movies);
    }
}


/**
 * Write a description of class MovieTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTester
{
    public static void printMovies(Movie[] movies)
    {
        for(Movie movie : movies){
            System.out.println(movie);
        }
    }
    
    public static Movie[] sortByTitle(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1){
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }else {
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }

            dest[ insertIndex ] = next;
            
        } 
        return dest;
    }
    
    public static Movie[] sortByYear(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1){
                    if( next.getYear() > dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }else {
                    if( next.getYear() < dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }

            dest[ insertIndex ] = next;
        }
        return dest;
    }
    
    public static Movie[] sortByStudio(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(order == 1){
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }else {
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }

            dest[ insertIndex ] = next;
            
        } 
        return dest;
    }
    
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Harry Potter", 2001, "Universal");
        movies[1] = new Movie("The Witches", 2020, "HBO");
        movies[2] = new Movie("Soul", 2020, "Disney Pixar");
        movies[3] = new Movie("My Girl", 1991, "Tubi");
        movies[4] = new Movie("The Karate Kid", 1984, "Prime");
        movies[5] = new Movie("Spirited Away", 2001, "HBO");
        movies[6] = new Movie("Hidden Figures", 2016, "Disney");
        movies[7] = new Movie("The Goonies", 1985, "HBO");
        movies[8] = new Movie("The Greatest Showman", 2017, "Disney");
        movies[9] = new Movie("Hook", 1991, "Netflix");
        
        System.out.println("Original Movies Array:\n");
        printMovies(movies);
        
        System.out.println("\n<< Sorting by Title >>\n");
        Movie[] sortedTitle1 = sortByTitle(movies, 1);
        printMovies(sortedTitle1);
        
        System.out.println("\n<< Sorting by Title Reverse Order >>\n");
        Movie[] sortedTitle2 = sortByTitle(movies, 2);
        printMovies(sortedTitle2);
        
        System.out.println("\n<< Sorting by Year >>\n");
        Movie[] sortedYear1 = sortByYear(movies, 1);
        printMovies(sortedYear1);
        
        System.out.println("\n<< Sorting by Year Reverse Order >>\n");
        Movie[] sortedYear2 = sortByYear(movies, 2);
        printMovies(sortedYear2);
        
        System.out.println("\n<< Sorting by Studio >>\n");
        Movie[] sortedStudio1 = sortByStudio(movies, 1);
        printMovies(sortedStudio1);
        
        System.out.println("\n<< Sorting by Studio Reverse Order >>\n");
        Movie[] sortedStudio2 = sortByStudio(movies, 2);
        printMovies(sortedStudio2);
    }
}


/**
 * Runner class for the Music object.
 *
 * @author Domenic Iorfida
 * @version 2/11/21
 */
public class MusicTesterV3
{
    public static void main(String[] args)
    {
        MusicV3[] songs = new MusicV3[10];
        songs[0] = new MusicV3("Smells Like Teen Spirit", 1991, "Nirvana");
        songs[1] = new MusicV3("Imagine", 1971, "John Lennon");
        songs[2] = new MusicV3("One", 1990, "U2");
        songs[3] = new MusicV3("Billie Jean", 1982, "Michael Jackson");
        songs[4] = new MusicV3("Bohemian Rhapsody", 1979, "Queen");
        songs[5] = new MusicV3("Hey Jude", 1968, "The Beatles");
        songs[6] = new MusicV3("Like a Rolling Stone", 1965, "Bob Dylan");
        songs[7] = new MusicV3("Can't Get No Satisfaction", 1965, "Rolling Stones");
        songs[8] = new MusicV3("Sweet Child O'Mine", 1987, "Guns N' Roses");
        songs[9] = new MusicV3("Paint it Black", 1965, "Rolling Stones");
        
        System.out.println("Original Music Array:\n");
        printMusicArray(songs);
        
        System.out.println("\n<< Searching for Billie Jean >>\n");
        selectionSortTitle(songs);
        binarySearchTitle(songs, "Billie Jean");
        
        System.out.println("\n<< Searching for My Song >>\n");
        selectionSortTitle(songs);
        binarySearchTitle(songs, "My Song");
        
        System.out.println("\n<< Searching for all occurances of 1965 >>\n");
        selectionSortYear(songs);
        binarySearchYear(songs, 1965);
        
        System.out.println("\n<< Searching for all occurances of 2001 >>\n");
        selectionSortYear(songs);
        binarySearchYear(songs, 2001);
        
        System.out.println("\n<< Searching for all occurances of Rolling Stones >>\n");
        selectionSortArtist(songs);
        binarySearchArtist(songs, "Rolling Stones");
        
        System.out.println("\n<< Searching for all occurances of Domenic Iorfida >>\n");
        selectionSortArtist(songs);
        binarySearchArtist(songs, "Domenic Iorfida");
    }
    
    public static void printMusicArray(MusicV3[] music)
    {
        for(MusicV3 song : music){
            System.out.println(song);
        }
    }
    
    public static void sequentialSearchTitle(MusicV3[] music, String title)
    {
        int found = -1;

        for(int i = 0; i < music.length; i++)
        {
            if(music[i].getTitle().compareTo(title) == 0)
            {
                found = i;
                break;
            }
        }
        
        if(found != -1)
        {
            System.out.println("Find results: ");
            System.out.println(music[found]);
        }
        else
            System.out.println(title + " is not in the array");
    }
    
    public static void sequentialSearchYear(MusicV3[] music, int year)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < music.length; i++)
        {
            if(music[i].getYear() == year)
            {
                System.out.println(music[i]);
                found++;
            }
        }
        
        if(found == 0)
        { 
            System.out.println(year + " is not in the array");
        }
    }
    
    public static void sequentialSearchArtist(MusicV3[] music, String artist)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < music.length; i++)
        {
            if(music[i].getArtist().compareTo(artist) == 0)
            {
                System.out.println(music[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(artist + " is not in the array");
        }
    }
    
    public static void selectionSortTitle(MusicV3[] music)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;

        for( i = music.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            
            for( k = 0 ; k <= i ; k++ )
            {
                if(music[k].getTitle().compareTo(music[posMax].getTitle()) > 0 )
                    posMax = k;
            }
            temp = music[i];
            music[i] = music[posMax];
            music[posMax] = temp;
        }
    }
    
    public static void selectionSortYear(MusicV3[] music)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;

        for( i = music.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            
            for( k = 0 ; k <= i ; k++ )
            {
                if(music[k].getYear() > music[posMax].getYear())
                    posMax = k;
            }
            temp = music[i];
            music[i] = music[posMax];
            music[posMax] = temp;
        }
    }
    
    public static void selectionSortArtist(MusicV3[] music)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;

        for( i = music.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            
            for( k = 0 ; k <= i ; k++ )
            {
                if(music[k].getArtist().compareTo(music[posMax].getArtist()) > 0 )
                    posMax = k;
            }
            temp = music[i];
            music[i] = music[posMax];
            music[posMax] = temp;
        }
    }
    
    public static void binarySearchTitle(MusicV3[] music, String target)
    {
        int high = music.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(music[probe].getTitle().compareTo(target) > 0)
                high = probe;
            else
            {
                low = probe;
                if(music[probe].getTitle().compareTo(target) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (music[low].getTitle().compareTo(target) == 0 ))
        {
            int i;
            int start = low;
            int end = low;
    
            i = low - 1;
            while((i >= 0) && (music[i].getTitle().compareTo(target) == 0))
            {
                start = i;
                i--;
            }
            
            i = low + 1;
            while((i < music.length) && (music[i].getTitle().compareTo(target) == 0))
            {
                end = i;
                i++;
            }
            
            for(i = start; i <= end; i++)
                System.out.println(music[i]);
        }
        else
            System.out.println("NOT found: " + target);
    }
    
    public static void binarySearchYear(MusicV3[] music, int target)
    {
        int high = music.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(music[probe].getYear() > target)
                high = probe;
            else
            {
                low = probe;
                if(music[probe].getYear() > target)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (music[low].getYear() == target))
        {
            int i;
            int start = low;
            int end = low;
    
            i = low - 1;
            while((i >= 0) && (music[i].getYear() == target))
            {
                start = i;
                i--;
            }
            
            i = low + 1;
            while((i < music.length) && (music[i].getYear() == target))
            {
                end = i;
                i++;
            }
            
            for(i = start; i <= end; i++)
                System.out.println(music[i]);
        }
        else
            System.out.println("NOT found: " + target);
    }
    
    public static void binarySearchArtist(MusicV3[] music, String target)
    {
        int high = music.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(music[probe].getArtist().compareTo(target) > 0)
                high = probe;
            else
            {
                low = probe;
                if(music[probe].getArtist().compareTo(target) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (music[low].getArtist().compareTo(target) == 0 ))
        {
            int i;
            int start = low;
            int end = low;
    
            i = low - 1;
            while((i >= 0) && (music[i].getArtist().compareTo(target) == 0))
            {
                start = i;
                i--;
            }
            
            i = low + 1;
            while((i < music.length) && (music[i].getArtist().compareTo(target) == 0))
            {
                end = i;
                i++;
            }
            
            for(i = start; i <= end; i++)
                System.out.println(music[i]);
        }
        else
            System.out.println("NOT found: " + target);
    }
}

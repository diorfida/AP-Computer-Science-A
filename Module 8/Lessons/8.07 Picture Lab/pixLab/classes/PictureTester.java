/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void keepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      
      Pixel[][] pixels = beach.getPixels2D();
      for(Pixel[] rowArray : pixels){
          for(Pixel pixelObj : rowArray){
              pixelObj.setRed(0);
              pixelObj.setGreen(0);
          }
      }
      beach.explore();
  }
  
  public static void negate()
  {
      Picture beach = new Picture("beach.jpg");
      
      Pixel[][] pixels = beach.getPixels2D();
      for(Pixel[] rowArray : pixels){
          for(Pixel pixelObj : rowArray){
              pixelObj.setRed(255 - pixelObj.getRed());
              pixelObj.setBlue(255 - pixelObj.getBlue());
              pixelObj.setGreen(255 - pixelObj.getGreen());
          }
      }
      beach.explore();
  }
  
  public static void grayscale()
  {
      Picture beach = new Picture("beach.jpg");
      
      Pixel[][] pixels = beach.getPixels2D();
      for(Pixel[] rowArray : pixels){
          for(Pixel pixelObj : rowArray){
              int average = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
              
              pixelObj.setRed(average);
              pixelObj.setBlue(average);
              pixelObj.setGreen(average);
          }
      }
      beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture pic = new Picture("caterpillar.jpg");
    Pixel[][] pixels = pic.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
    pic.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture pic = new Picture("caterpillar.jpg");
    Pixel[][] pixels = pic.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    pic.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture pic = new Picture("caterpillar.jpg");
    Pixel[][] pixels = pic.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    }
    pic.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture pic = new Picture("snowman.jpg");
    Pixel[][] pixels = pic.getPixels2D();
    
    
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int count = 0;
    
    for (int row = 158; row < mirrorPoint; row++)
    {
      for (int col = 103; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
        count ++;
      }
    }
    
    int mirror2 = 198;
    Pixel top2 = null;
    Pixel bottom2 = null;
    
    for(int row = 171; row < mirror2; row ++)
    {
      for(int col = 239; col < 294; col ++)
      {
        top2 = pixels[row][col];
        bottom2 = pixels[mirror2 - row + mirror2][col];
        bottom2.setColor(top2.getColor());
      }
    }
    
    pic.explore();
    
  }
  
  public static void testMirrorGull()
  {
    Picture pic = new Picture("seagull.jpg");
    Pixel[][] pixels = pic.getPixels2D();
    
    int mirrorPoint = 345;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    
    for(int row = 235; row < 323; row ++)
    {
      for(int col = 238; col < mirrorPoint; col ++)
      {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
    
    pic.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //keepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //negate();
    //grayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}













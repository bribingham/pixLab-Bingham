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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    //beach.zeroBlue();
    //beach.keepOnlyBlue();
   // beach.negate();
   // beach.grayscale();
    beach.mirrorVerticalRightToLeft();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    //beach.zeroBlue();
    beach.keepOnlyBlue();
    // beach.negate();
    // beach.grayscale();
    //beach.mirrorVerticalRightToLeft();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testNegate()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.negate();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.grayscale();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.mirrorVerticalRightToLeft();
   // beach.mirrorHorizontal();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testMirrorHorizontal () {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore();
      beach.mirrorHorizontal();
      beach.explore();
  }
  public static void testMirrorHorizontalBotToTop () {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.mirrorHorizontalBotToTop();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
 // public static void testMirrorVertical()
//  {
//    Picture caterpillar = new Picture("caterpillar.jpg");
//    caterpillar.explore();
//    caterpillar.mirrorVertical();
//    caterpillar.explore();
//  }
  
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
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
   // testGrayscale();
    //testFixUnderwater();
   // testMirrorVerticalRightToLeft();
   // testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
import java.util.Arrays;
//Leonard Wang, 1st period, AP CompSci
public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		System.out.println(Arrays.toString("I like apples!".split(" "))); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		splitBread("applebreadyogurtyahibread");
		splitStringAtSpaces("bread ham lettuce yogurt tomatoe mayo mayo mayo cheese bread egg cheese");

		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}
public static void splitStringAtSpaces(String sandwiche){
	String [] revisedSandwiche = sandwiche.split("bread");
	if(revisedSandwiche.length <= 2){
		System.out.println("Not a sandwiche");
	}else {
		if(revisedSandwiche[1].equals(" ")){
			System.out.println("Not A sandwiche");
		}else{
		for(int i = 1; i < revisedSandwiche.length-1; i++){
			sandwiche = revisedSandwiche[i];
			System.out.print(sandwiche);
		}
		}
	}
//	if(revisedSandwiche.length == 3){
//		sandwiche = revisedSandwiche[1];
//		System.out.println(sandwiche);
//	}
}

public static void splitBread(String breadStatement){
	String[] breadArray = breadStatement.split("bread");
//	while(breadStatement.contains("bread")){
//		breadStatement.replaceFirst("bread"," ");
//		System.out.println(breadStatement);
//		numberOfBreads++;
//	}	
	//doesnt work, cant get the numberOfBreads
//	for(int i = 1; i < numberOfBreads; i++){
//		System.out.println(bread[i-1]);
//	}
	//need to find # of breads
	if(breadArray.length <= 2){
		System.out.println("Not a sandwiche");
	}else{
	for(int i = 1; i <breadArray.length; i++){
		String breadMiddleStatement = breadArray[i];
		System.out.println("The statement between the two breads are: " + breadMiddleStatement);
	}
	}
//		if(bread.length == 2){
//			String breadMiddleStatement = bread[1];
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement);
//		}
//		if(bread.length == 3){
//			String breadMiddleStatement1 = bread[1];
//			String breadMiddleStatement2 = bread[2];
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement1);
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement2);
//		}
//		if(bread.length == 4){
//			String breadMiddleStatement1 = bread[1];
//			String breadMiddleStatement2 = bread[2];
//			String breadMiddleStatement3 = bread[3];
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement1);
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement2);
//			System.out.println("The statement between the two breads are: " + breadMiddleStatement3);
//		}
	//if there is no "bread" before this start here.
	//if there is no bread after this end here
}
}


package JavaDocs;
/**
 * This is a important class
 */

public class methods_tags {
    /**
     * 
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("Hey I am main method");
    }
        /**
     * Hello this is a method and this is the most important method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c= i+ j;
        return c;
    
    }
}
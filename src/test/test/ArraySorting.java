package test.test;

public class ArraySorting {


	    public static void main(String[] args) {    
	    	int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7}; 
	    	ArraySorting  arr= new ArraySorting();
	    	arr.sortArray(intArray);
            arr.descendingOrder(intArray);
        }
    


        private void sortArray(int[] intArray) {

          

            int tracker=0;

            for (int i = 0; i < intArray.length; i++) {
                for (int j = i+1; j < intArray.length; j++) {

                    if(intArray[i]>intArray[j]){
                         tracker=intArray[i];
                         intArray[i]=intArray[j];
                         intArray[j]=tracker;
                    }
                   
                
                }
                
            }

            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
            
        }


        public void descendingOrder(int [] intArray){
                int tracker=0;

                for (int i = 0; i < intArray.length; i++) {
                    for (int j = i+1; j < intArray.length; j++) {
                        if(intArray[i]<intArray[j]){
                            tracker= intArray[i];
                            intArray[i]=intArray[j];
                            intArray[j]=tracker;
                        }
                    }
                }

                for (int i = 0; i < intArray.length; i++) {
                    System.out.println(intArray[i]);
                }

        }

    }
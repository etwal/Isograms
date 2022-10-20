package cpen221practice;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        char []arr = phrase.toCharArray();




        for (int i =0; i< arr.length; i++){
            for (int j =0; j< arr.length; j++){
                if(j != i && arr[i] != '-' && arr[j] != ' '){

                    if(Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[j]) ){
                        return false;
                    }

                }
            }
        }
        return true;
    }

}

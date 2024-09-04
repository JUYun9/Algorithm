import java.util.ArrayList;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 1)
                food[i] -= 1; 
        }
        
        ArrayList<Integer> myFood = new ArrayList<>();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            while (count > 0) {
                myFood.add(i);
                count--;
            }
        }
        
        ArrayList<Integer> myFoodInverse = new ArrayList<>();
       for (int i = myFood.size() - 1; i >= 0; i--) {
           myFoodInverse.add(myFood.get(i));
       }
        
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 0; i < myFood.size(); i++)
            sb.append(myFood.get(i));
        
        sb.append(0);
        
        for (int i = 0; i < myFoodInverse.size(); i++)
            sb.append(myFoodInverse.get(i));
        
        answer = sb.toString();
        
        return answer;
    }
}